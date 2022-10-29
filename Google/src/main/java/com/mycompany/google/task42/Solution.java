/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.google.task42;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author selyc
 */
public class Solution {
    
    public static void main(String[] arg){
        System.out.println("Question");
        //int [] entrance={0,1};
        //int [] exits={4,5};
        //int [][] paths={{0, 0, 4, 6, 0, 0},{0, 0, 5, 2, 0, 0}, {0, 0, 0, 0, 4, 4}, {0, 0, 0, 0, 6, 6}, {0, 0, 0, 0, 0, 0}, {0, 0, 0, 0, 0, 0}};
        
        //int [] entrance={0};
        //int [] exits={3};
        //int [][] paths={{0, 7, 0, 0},{0, 0, 6, 0}, {0, 0, 0, 8}, {9, 0, 0, 0}};
        
        int [] entrance={0,1};
        int [] exits={6,7};
        int [][] paths={
            {0, 0, 1, 5, 0, 0, 0, 0},
            {0, 0, 3, 6, 0, 0, 0, 0}, 
            {0, 0, 0, 0, 4, 4, 0, 0}, 
            {0, 0, 0, 0, 2, 6, 0, 0}, 
            {0, 0, 0, 0, 0, 0, 1, 1}, 
            {0, 0, 0, 0, 0, 0, 8, 8}, 
            {0, 0, 0, 0, 0, 0, 0, 0}, 
            {0, 0, 0, 0, 0, 0, 0, 0}};
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
    
    private static void printListList(List<List> dat){
        for(int i=0;i<dat.size();++i){
            for(int j=0;j<dat.get(i).size();++j){
                System.out.print(dat.get(i).get(j)+" ");
            }
            System.out.println();
        }
        System.out.println();        
    }
    
    private static void printList(List<Integer> dat){
        for(int i=0;i<dat.size();++i){
            System.out.print(dat.get(i)+" ");
        }
        System.out.println();
    }
    
    private static void printListAr(List<Integer[]> dat){
        for(int i=0;i<dat.size();++i){
            System.out.println(dat.get(i)[0]+" "+dat.get(i)[1]);
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
        
        int[] doorCount = new int[path.length];
        
        //move from entrence
        //entry bunnies can send all bunnies to next path
        int doors=0;
        for(int i=0;i<entrances.length;++i){
            for(int j=i+1;j<path[i].length;++j){//check the entrance entries
                doorCount[j]+=path[i][j];
                if(path[i][j]>0 && i==0){
                    ++doors;
                }
            }
        }
        
        //room count
        int[] roomCount = new int[path.length];
        for(int i=0;i<path.length;++i){            
            for(int j=0;j<path.length;++j){
                if(i<entrances.length){//Add Entrance room count same as door count
                    doorCount[i]+=path[i][j];
                }
                roomCount[i]+=path[i][j];
            }
        }
        System.out.println("Room Count");
        printArray(roomCount);
        
        
        List<List> indices=permutations(doors);
        System.out.println("Permutations");
        printListList(indices);
        
        System.out.println("Door Count");
        printArray(doorCount);
        
        List<Integer> sums = new ArrayList<>();
        List<Integer[]> travers = new ArrayList<>();//int[0] keeps index, int[1] keeps permutation index
        
        int i=entrances.length;
        while(i<exits[0]){//Going through each room
            int dCount=doorCount[i];
            if(dCount<roomCount[i]){
                if(travers.size()==0 || travers.get(travers.size()-1)[0]!=i){// add new traverse
                    Integer[] tr = new Integer[2];
                    tr[0]=i;
                    tr[1]=0;
                    travers.add(tr);
                }
                
                int in=travers.get(travers.size()-1)[1];
                //find next index(door)
                int nDoor=0;
                for(int j=i+1;j<path.length;++j){
                    if(path[i][j]>0){
                        nDoor=j;
                        break;
                    }
                }
                
                System.out.println("Traverse");
                printListAr(travers);
                
                for(int j=0;j<doors;++j){
                    int n=(int)indices.get(in).get(j)+nDoor;
                    int trans = Math.min(dCount, path[i][n]);
                    doorCount[n]+=trans;
                    dCount-=trans;
                }
            }else{
                //find next index(door)
                int nDoor=0;
                for(int j=i+1;j<path.length;++j){
                    if(path[i][j]>0){
                        nDoor=j;
                        break;
                    }
                }
                
                for(int j=0;j<doors;++j){//going through each next room
                    int n=j+nDoor;  
                    int trans = Math.min(dCount, path[i][n]);
                    doorCount[n]+=trans;
                    dCount-=trans;
                }
            }
            
                        
            ++i;
            
            if(i==(exits[0])){//One Iteration over, find sum
                
                System.out.println("Door Count 1");
                printArray(doorCount);
        
                int sum=0;
                for(int k=0;k<exits.length;++k){
                    sum+=doorCount[exits[k]];
                }
                sums.add(sum);  
                
                System.out.println("Sum :"+sum);
                
                //Traverse if required
                if(travers.size()>0){
                                                           
                    Integer[] last=travers.get(travers.size()-1);
                    
                    ++last[1];//for index of permutation
                   
                    while(last[1]>=indices.size()){
                        travers.remove(travers.size()-1);                        
                        if(travers.size()>0){
                            last=travers.get(travers.size()-1);                            
                            ++last[1];
                        }else{
                            last[0]=exits[0];                            
                            break;
                        }
                    }

                    i=last[0];

                    //Repopulate doorCount
                    if(last[0]!=exits[0]){
                        doorCount=repopulateDoorCounts(entrances[entrances.length-1],i,path,travers,indices,roomCount,doors);
                    }
                    
                    
                }
                
                System.out.println("Door Count 2");
                printArray(doorCount);
            }
            
            
        }                
        
        System.out.println("Sums");
        printList(sums);
        
                         
        int ans=0;
        for(int k=0;k<sums.size();++k){
            ans=ans<sums.get(k)?sums.get(k):ans;
        }
                         
        return ans;
    }
    
    private static int [] repopulateDoorCounts(int pathStart, int row, int[][] path,List<Integer[]> travers, List<List> indices,int[] roomCount, int doors){
        int[] ret = new int[path.length];
        
        //Adding entrance count
        for(int i=0;i<=pathStart;++i){                        
            for(int j=i+1;j<path.length;++j){
                ret[j]+=path[i][j];
            }
        }
        
        //Adding path so far
        int lIndex=0;
        for(int i=pathStart+1;i<row;++i){
            int dCount=ret[i];
            if(dCount<roomCount[i]){
                //int in=travers.get(travers.size()-1)[1];
                //find next index(door)
                int nDoor=0;
                for(int j=i+1;j<path.length;++j){
                    if(path[i][j]>0){
                        nDoor=j;
                        break;
                    }
                }
                
                int ind=travers.get(lIndex)[1];
                ++lIndex;
                for(int j=0;j<doors;++j){                    
                    int n=(int)indices.get(ind).get(j)+nDoor;                    
                    int trans = Math.min(dCount, path[i][n]);
                    ret[n]+=trans;
                    dCount-=trans;
                }
                
            }else{
                //find next index(door)
                int nDoor=0;
                for(int j=i+1;j<path.length;++j){
                    if(path[i][j]>0){
                        nDoor=j;
                        break;
                    }
                }

                for(int j=0;j<doors;++j){//going through each next room
                    int n=j+nDoor;  
                    int trans = Math.min(dCount, path[i][n]);
                    ret[n]+=trans;
                    dCount-=trans;
                }
            }
        }
        System.out.println("Door Count 3 "+row);
        printArray(ret);
        
        return ret;
    }
            
    private static List<List> permutations(int n){
        List<List> res = new ArrayList<>();                
        
        boolean taken[]= new boolean[n];
        //current value
        List<Integer> curr = new ArrayList<>(); 
        //Initial Value
        for(int i=0;i<n;++i){
            curr.add(i);
            taken[i]=true;
        }        
        
        boolean finished =false;
        while(!finished){            
            //Add Current Sequence to the list
            List<Integer> perm = new ArrayList<>(); 
            for(int i=0;i<curr.size();++i){
                perm.add(curr.get(i));
            }
            res.add(perm);
            
            int index=n-1;            
            while(index>-1){
                
                int num= curr.get(index);
                if(num>=n-1){
                    taken[num]=false;
                    curr.remove(index);
                    --index;
                }
                
                if(index<0){
                    finished=true;
                    break;
                }
                
                num= curr.get(index);
                
                int nextN =nextNum(num, taken);
                if(nextN==-1){
                    taken[num]=false;
                    curr.remove(index);
                    --index;
                }else{    
                    //Update the new found number
                    taken[num]=false;
                    curr.set(index, nextN);
                    taken[nextN]=true;
                    break;
                }
                
            }

            while(curr.size()<n)
            for(int i=0;i<n;++i){
                if(!taken[i]){
                    curr.add(i);
                    taken[i]=true;
                }                
            }
            
        }
        
        return res;
    }
    
    private static int nextNum(int curV ,boolean[] taken){
        int ret=-1;
        for(int i=curV+1;i<taken.length;++i){
            if(!taken[i]){
                ret=i;
                break;
            }
        }
        
        return ret;
    }
}
