/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.google.task41;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author selyc
 */
public class Solution {
    
    public static void main(String[] arg){
        System.out.println("Question");
        
        printAnswer(solution(2, 1));
    }
    
    private static void printAnswer(int x [][]){
        if(x==null){
            return;
        }
        for(int i=0;i<x.length;++i){
            for(int j=0;j<x[0].length;++j)
            {
                System.out.print(x[i][j]+"  ");
            }
            System.out.println();
        }
    }
    
    private static void printList(List<Integer> dat){
        for(int i=0;i<dat.size();++i){
            System.out.print(dat.get(i)+" ");
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
    
    public static int[][] solution(int num_buns, int num_required) {
    
        int buns=num_buns;
        int keys=num_required;
        //return 0 if one bunny is required
        if(keys==1){
            return new int[buns][1];
        }
        
        
        //Finding combinations indices
        int combLimit=buns-keys+1;
        List<List> indices=combinations(buns, combLimit);
        //printListList(indices);
        
        //Find keys
        List<Integer>[] keyList = new ArrayList[buns];
        //Initialise
        for(int i=0;i<buns;++i){
            keyList[i]= new ArrayList<>();
        }
        
        int num=0;
        for(int i=0;i<indices.size();++i){
            for(int j=0;j<indices.get(i).size();++j){
                keyList[(int)indices.get(i).get(j)].add(num);
            }
            ++num;
        }
        
        //copy keys to array
        int[][] ret = new int[buns][keyList[0].size()];
        for(int i=0;i<buns;++i){
            for(int j=0;j<keyList[0].size();++j){
                ret[i][j]=keyList[i].get(j);
            }
        }
        
        return ret;
    }
    
    private static List<List> combinations(int n, int k){
        List<List> res = new ArrayList<>();        
        
        List<Integer> comb = new ArrayList<>();        
        comb.add(0);
        int count=0;
        //comb.get(0)<=(buns-keys)
        while(comb.size()>0){
            
            if(comb.size()<k){
                comb.add(comb.get(comb.size()-1)+1);
            }
            //Check if has a key
            if(comb.size()==k){                
                ++count;                
                List<Integer> indices = new ArrayList<>();
                for(int i=0;i<comb.size();++i){
                    indices.add(comb.get(i));
                }
                res.add(indices);
                
                //Change the key to next key if available 
                int index=k-1;
                if(comb.get(index)<n-1){
                    comb.set(index, comb.get(index)+1);
                }else{
                    //if it has reached the last limit
                    //remove last element until it i no longer reached limit or it is the first element
                    
                    while(comb.size()>0){
                        int limit=n-k+index;
                        if(comb.get(index)<limit){
                            comb.set(index, comb.get(index)+1);
                            break;//exit the loop if found element that can be incremented
                        }else{                            
                            //if has reached limit, remove the element
                            comb.remove(index);
                            --index;
                        }
                    }
                }
            }                                              
        }
        
        return res;
    }
}
