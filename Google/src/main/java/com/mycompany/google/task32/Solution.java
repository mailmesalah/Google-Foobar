/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.google.task32;

/**
 *
 * @author selyc
 */
public class Solution {

    public static void main(String[] arg) {

        //int[] ret=Solution.solution(params);
        System.out.println("Question");

        System.out.println("Answer");
        System.out.println("[0, 0, 0, 0, 0, 0, 0] :" + Solution.solution(new int[]{0, 0, 0, 0, 0, 0, 0}));
        System.out.println("[0] :" + Solution.solution(new int[]{0}));
        System.out.println("[1, 2] ==0 :" + Solution.solution(new int[]{1, 2}));
        System.out.println("[2, 4]) == 0 :" + Solution.solution(new int[]{2, 4}));
        System.out.println("[1, 1, 1, 1] == 4 :" + Solution.solution(new int[]{1, 1, 1, 1}));
        System.out.println("[1, 1, 1, 1, 1] == 10 :" + Solution.solution(new int[]{1, 1, 1, 1, 1}));
        System.out.println("[1, 1, 1, 1, 1, 1] == 20 :" + Solution.solution(new int[]{1, 1, 1, 1, 1, 1}));
        System.out.println("[1, 1, 1, 1, 1, 1, 1] == 35 :" + Solution.solution(new int[]{1, 1, 1, 1, 1, 1, 1}));
        System.out.println("[1, 1, 2] == 1 :" + Solution.solution(new int[]{1, 1, 2}));
        System.out.println("[1, 1, 2, 2] == 4 :" + Solution.solution(new int[]{1, 1, 2, 2}));
        System.out.println("[1, 1, 2, 2, 2] == 10 :" + Solution.solution(new int[]{1, 1, 2, 2, 2}));
        System.out.println("[1, 1, 2, 2, 2, 3] == 11 :" + Solution.solution(new int[]{1, 1, 2, 2, 2, 3}));
        System.out.println("[1, 2, 4, 8, 16] == 10 :" + Solution.solution(new int[]{1, 2, 4, 8, 16}));
        System.out.println("[2, 4, 5, 9, 12, 34, 45] == 1 :" + Solution.solution(new int[]{2, 4, 5, 9, 12, 34, 45}));
        System.out.println("[2, 2, 2, 2, 4, 4, 5, 6, 8, 8, 8] == 90 :" + Solution.solution(new int[]{2, 2, 2, 2, 4, 4, 5, 6, 8, 8, 8}));
        System.out.println("[2, 4, 8] == 1 :" + Solution.solution(new int[]{2, 4, 8}));
        System.out.println("[2, 4, 8, 16] == 4 :" + Solution.solution(new int[]{2, 4, 8, 16}));
        System.out.println("[3, 4, 2, 7] == 0 :" + Solution.solution(new int[]{3, 4, 2, 7}));
        System.out.println("[6, 5, 4, 3, 2, 1] == 0 :" + Solution.solution(new int[]{6, 5, 4, 3, 2, 1}));
        System.out.println("[4, 7, 14] == 0 :" + Solution.solution(new int[]{4, 7, 14}));
        System.out.println("[4, 21, 7, 14, 8, 56, 56, 42] == 9 :" + Solution.solution(new int[]{4, 21, 7, 14, 8, 56, 56, 42}));
        System.out.println("[4, 21, 7, 14, 56, 8, 56, 4, 42] == 7 :" + Solution.solution(new int[]{4, 21, 7, 14, 56, 8, 56, 4, 42}));
        System.out.println("[4, 7, 14, 8, 21, 56, 42] == 4 :" + Solution.solution(new int[]{4, 7, 14, 8, 21, 56, 42}));
        System.out.println("[4, 8, 4, 16] == 2 :" + Solution.solution(new int[]{4, 8, 4, 16}));

    }

    public static int solution(int[] l) {
        // Your code here
        int counter = 0;
        for (int i = 0; i < l.length - 2; ++i) {
            if(l[i]==0){
                continue;
            }
            for (int j = i + 1; j < l.length - 1; ++j) {
                if(l[j]==0){
                    continue;
                }
                if (l[i] <= l[j] && l[j] % l[i] == 0) {
                    for (int k = j + 1; k < l.length; ++k) {
                        if(l[k]==0){
                            continue;
                        }
                        if (l[j] <= l[k] && l[k] % l[j] == 0) {
                            ++counter;
                        }
                    }
                }
            }
        }

        return counter;
    }

}
