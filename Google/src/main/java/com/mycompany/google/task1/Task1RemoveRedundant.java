/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.google.task1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author selyc
 */
public class Task1RemoveRedundant {
    
    public static void main(String args []){
        
        int[] data = {1, 2, 2,3, 3, 3, 3, 4, 5, 5};
        int n=2;
        
           
        int[] result = Solution.solution(data, n);
        for(int i=0;i<result.length;++i){            
            System.out.println(result[i]);
        }
    }
    
}
