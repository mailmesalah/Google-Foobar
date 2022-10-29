/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.google.task1;

/**
 *
 * @author selyc
 */import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public static int[] solution(int[] data, int n) {
        // Your code here
        //Counting
        HashMap<Integer,Integer> counter = new HashMap<>();
        for(int i=0;i<data.length;++i){
            if(counter.containsKey(data[i])){
                counter.put(data[i], counter.get(data[i])+1);
            }else{
                counter.put(data[i], 1);
            }
        }
        
        //removing poor minions
        for (int i=0;i<data.length;++i) {           
           Integer val=counter.get(data[i]);           
           if(val==null){
               continue;
           }
           if(val>n){
               counter.remove(data[i]);
           }
        }
        
        List<Integer> res = new ArrayList();
        //reordering list
        for(int i=0;i<data.length;++i){
            if(counter.containsKey(data[i])){
                res.add(data[i]);
            }
        }
           
        int[] result = new int[res.size()];       
        for(int i=0;i<res.size();++i){
            result[i]=res.get(i);
        }
        
        return result;
    }
}