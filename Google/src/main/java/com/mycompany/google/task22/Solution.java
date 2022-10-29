/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.google.task22;

/**
 *
 * @author selyc
 */

public class Solution {
    
    public static void main(String[] arg){
        int [] res = solution(new int[]{4, 30, 50});
        System.out.println("Output : "+res[0]+" "+res[1]);
        
        res = solution(new int[]{4, 17, 50});
        System.out.println("Output : "+res[0]+" "+res[1]);
        
        res = solution(new int[]{1, 51});
        System.out.println("Output : "+res[0]+" "+res[1]);
        
        res = solution(new int[]{1, 31});
        System.out.println("Output : "+res[0]+" "+res[1]);
        
        res = solution(new int[]{1, 31, 51, 71});
        System.out.println("Output : "+res[0]+" "+res[1]);
        
        res = solution(new int[]{1, 31, 51, 71, 91});
        System.out.println("Output : "+res[0]+" "+res[1]);
        
        res = solution(new int[]{4, 9, 17, 31, 40});
        System.out.println("Output : "+res[0]+" "+res[1]);
    }
    public static int[] solution(int[] pegs) {
        // Your code here        
        int [] result= new int[]{-1,-1};             
        //Finding the radius        
        int sum =0;
        for(int i =0;i<pegs.length-1;++i){            
            sum+=((pegs[i+1]-pegs[i])*(i%2==0?1:-1));
        }
        
        if(sum<1){
            return result;
        }
        
        //Factorization
        int numerator= 2*sum;
        int denominator=pegs.length%2==0?3:1;
        boolean canDivide =numerator%denominator==0;
        numerator=canDivide?numerator/denominator:numerator;
        denominator=canDivide?1:denominator;
        
        //Checking for validity
        int prevRadius=numerator/denominator;
        int curRadius=0;        
        for(int i=0;i<pegs.length-1;++i){
            curRadius=pegs[i+1]-(pegs[i]+prevRadius);
            if(curRadius<1){
                return result;
            }
            prevRadius=curRadius;
        }
        result[0]=numerator;
        result[1]=denominator;
                
        return result;
    }
}