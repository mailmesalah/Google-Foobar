/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.google.task1;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author selyc
 */
public class Temp {
    
    public static void main(String args []){
        
        int[] data = {1, 2, 2, 3, 3, 3, 4, 5, 5};
        int n=2;
        
        HashMap<Integer,Integer> counter = new HashMap<>();
        for(int i=0;i<data.length;++i){
            if(counter.containsKey(data[i])){
                counter.put(data[i], counter.get(data[i])+1);
            }else{
                counter.put(data[i], 1);
            }
        }
        
        for (int i=0;i<data.length;++i) {           
           Integer val=counter.get(data[i]);           
           if(val==null){
               continue;
           }
           if(val>n){
               counter.remove(data[i]);
           }
        }
        
        int[] result=new int[counter.size()];
        
        int i=0;
        for (Map.Entry<Integer, Integer> entry : counter.entrySet()) {
            Object key = entry.getKey();
            Integer val = entry.getValue();            
            result[i++]=(int) key;
        }   
        
        for(i=0;i<result.length;++i){
            System.out.println(result[i]);
        }
    }
    
}
