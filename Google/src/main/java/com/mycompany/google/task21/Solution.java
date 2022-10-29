/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.google.task21;

/**
 *
 * @author selyc
 */

public class Solution {
    
    public static void main(String[] arg){
        
        System.out.println("Output : "+solution(1430756000));
    }
    public static int solution(int total_lambs) {
        // Your code here
        //2^n        
        int i=0;
        int last=0;
        int powerCount=0;
        while(last<=total_lambs){                       
            last+=Math.pow(2, i);                  
            ++i;
            if(last<=total_lambs){
                ++powerCount;
            }
        }      
                
        //palindrom
        int palindrom=0;        
        int a=1;
        int b=0;
        int palCount=0;
        while(palindrom<=total_lambs){            
            palindrom+=a;            
            int c=b;
            b=a;
            a=c+b;
            if(palindrom<=total_lambs){
                ++palCount;
            }
        }
                
        return Math.abs(palCount-powerCount);
    }
}