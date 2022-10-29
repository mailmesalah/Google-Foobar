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
public class Solution1 {
    
    public static void main(String[] arg){
        System.out.println("Question");
        //int [] entrance={0,1};
        //int [] exits={4,5};
        //int [][] paths={{0, 0, 4, 6, 0, 0},{0, 0, 5, 2, 0, 0}, {0, 0, 0, 0, 4, 4}, {0, 0, 0, 0, 6, 6}, {0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}};
        
        int [] entrance={0};
        int [] exits={3};
        int [][] paths={{0, 7, 0, 0},{0, 0, 6, 0}, {0, 0, 0, 8}, {9, 0, 0, 0}};
        
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
        
        for(int i=entrances.length;i<exits[0];++i){//Going through each room
            for(int j=i+1;j<path[i].length;++j){//going through each next room
                int trans = Math.min(bunnyCount[i], path[i][j]);
                bunnyCount[j]+=trans;
                bunnyCount[i]-=trans;
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
}
