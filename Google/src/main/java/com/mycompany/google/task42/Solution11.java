/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.google.task42;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author selyc
 */
public class Solution11 {
    
    public static void main(String[] arg){
        System.out.println("Question");
        int [] entrance={0,1};
        int [] exits={4,5};
        int [][] paths={{0, 0, 4, 6, 0, 0},{0, 0, 5, 2, 0, 0}, {0, 0, 0, 0, 4, 4}, {0, 0, 0, 0, 6, 6}, {0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}};
        
        //int [] entrance={0};
        //int [] exits={3};
        //int [][] paths={{0, 7, 0, 0},{0, 0, 6, 0}, {0, 0, 0, 8}, {9, 0, 0, 0}};
        
        
        /*int [] entrance={0,1};
        int [] exits={6,7};
        int [][] paths={
            {0, 0, 1, 5, 0, 0, 0, 0},
            {0, 0, 3, 6, 0, 0, 0, 0}, 
            {0, 0, 0, 0, 4, 4, 0, 0}, 
            {0, 0, 0, 0, 2, 6, 0, 0}, 
            {0, 0, 0, 0, 0, 0, 1, 1}, 
            {0, 0, 0, 0, 0, 0, 8, 8}, 
            {0, 0, 0, 0, 0, 0, 0, 0}, 
            {0, 0, 0, 0, 0, 0, 0, 0}};*/
        
        int ans = solution(entrance, exits, paths);
        System.out.println("Answer");
        System.out.println(ans);
        
        
    }
    
    private static void printArray(int[] x){
        for(int i=0;i<x.length;++i){
            System.out.print(x[i]+" ");
        }
        System.out.println();
    }
    
    private static void printArrayofArray(int[][] x){
        for(int i=0;i<x.length;++i){
            for(int j=0;j<x[i].length;++j){
                System.out.print(x[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    public static int solution(int[] entrances, int[] exits, int[][] path) {
        // Your code here
        System.out.println("Start");
        printArray(entrances);
        System.out.println("Path");
        printArrayofArray(path);
        System.out.println("Exits");
        printArray(exits);
        
        int[] bunnyCount = new int[path.length];
        
        //move from entrence
        //entry bunnies can send all bunnies to next path
        for(int i=0;i<entrances.length;++i){
            for(int j=i+1;j<path[i].length;++j){//check the entrance entries
                bunnyCount[j]+=path[i][j];
            }
        }
        
        System.out.println("Bunny Count");
        printArray(bunnyCount);
        
        List<List<Integer>> doors = new ArrayList<>();
        
        
        //room count
        int[] roomCount = new int[path.length];
        for(int i=0;i<path.length;++i){            
            List<Integer> dCount = new ArrayList<>();
            for(int j=i+1;j<path.length;++j){                
                if(path[i][j]>0){
                    dCount.add(j);
                    roomCount[i]+=path[i][j];
                }
            }
            doors.add(dCount);
        }
        
        System.out.println("Room Count");
        printArray(roomCount);
        
        for(int i=entrances.length;i<exits[0];++i){//Going through each room
            if(bunnyCount[i]<roomCount[i]){
                int[] indices=findDoors(doors.get(i),roomCount);
                for(int j=0;j<indices.length;++j){
                    int in = indices[j];
                    int trans = Math.min(bunnyCount[i], path[i][in]);
                    bunnyCount[in]+=trans;
                    bunnyCount[i]-=trans;
                }
            }else{
                for(int j=i+1;j<path[i].length;++j){//going through each next room
                    int trans = Math.min(bunnyCount[i], path[i][j]);
                    bunnyCount[j]+=trans;
                    bunnyCount[i]-=trans;
                }
            }
        }
        
        System.out.println("Bunny Count");
        printArray(bunnyCount);
        
        int sum=0;
        for(int i=0;i<exits.length;++i){
            sum+=bunnyCount[exits[i]];
        }
        
        return sum;
    }
    
    private static int[] findDoors(List<Integer> doors, int [] rCount){
        int[] ret = new int[doors.size()];
        //Copy Current Index/doors to the room
        int[] temp= new int[doors.size()];
        for(int i=0;i<doors.size();++i){
            ret[i]=doors.get(i);
            temp[i]=rCount[doors.get(i)];
        }
        
        for (int i=0;i<temp.length-1;++i) {
            for (int j=i+1;j<temp.length;++j) {
                if(temp[i]<temp[j]){
                    //value swap
                    int t=temp[i];
                    temp[i]=temp[j];
                    temp[j]=t;
                    //index swap
                    t=ret[i];
                    ret[i]=ret[j];
                    ret[j]=t;
                }
            }    
        }
                
        return ret;
    }
}
