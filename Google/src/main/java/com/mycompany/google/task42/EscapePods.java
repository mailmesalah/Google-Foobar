/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.google.task42;

import java.util.List;
import java.util.ArrayList;


public class EscapePods {
    private static final int MAX_COUNT = 2000000;

    private static void printArrayofArray(int[][] x){
        for(int i=0;i<x.length;++i){
            for(int j=0;j<x[i].length;++j){
                System.out.print(x[i][j]+" ");
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
    
    private static void printArray(int[] x){
        for(int i=0;i<x.length;++i){
            System.out.print(x[i]+" ");
        }
        System.out.println();
    }
    
    private static int[][] convert(int[] entrances, int[] exits, int[][] path) {        
        int l = path.length;
        int nl = l + 2;
        int[][] nPath = new int[nl][nl];
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l; j++) {
                nPath[i + 1][j + 1] = path[i][j];
            }
        }
        for (int entrance : entrances) {
            nPath[0][entrance + 1] = MAX_COUNT;
        }
        for (int exit : exits) {
            nPath[exit + 1][nl - 1] = MAX_COUNT;
        }
        return nPath;
    }

    private static List<Integer> searchPath(int[][] nPath) {
        int[] temp = new int[nPath.length];
        for(int i=0;i<temp.length;++i){
            temp[i]=-1;
        }
        List<Integer> q = new ArrayList<>();
        q.add(0);        
        int lastT=temp[temp.length - 1];
        for (int i=0; q.size()>0 &&  lastT== -1; ) {
            i=q.get(q.size()-1);
            q.remove(q.get(q.size()-1));
            for (int j = 0; j < temp.length; j++) {
                if (nPath[i][j] > 0 && temp[j] == -1) {
                    q.add(j);
                    temp[j] = i;
                }               
            }
            lastT=temp[temp.length - 1];
        }
        System.out.println();        
        printArray(temp);
        List<Integer> path = new ArrayList<>();
        int ind = temp[temp.length - 1];
        while (ind != 0) {
            if (ind == -1) return null;
            path.add(ind);
            ind = temp[ind];
        }
        
        printList(path);
        List<Integer> ret= new ArrayList<>();
        for(int i=path.size()-1;i>=0;--i){
            ret.add(path.get(i));
        }
        printList(ret);
        return ret;
    }

    public static int solution(int[] entrances, int[] exits, int[][] path) {
        int[][] nPath=convert(entrances, exits, path);
        
        int mSum = 0;
        List<Integer> lPath;
        while ((lPath = searchPath(nPath)) != null) {
            printArrayofArray(nPath);
            // calculate residual capacity c_f(p)
            int bCount = MAX_COUNT;
            int i = 0;
            for (int j : lPath) {
                bCount = Math.min(bCount, nPath[i][j]);
                i = j;
            }
            // increment max flow
            mSum += bCount;
            i = 0;
            // update residual network
            for (int j : lPath) {
                nPath[i][j] -= bCount;
                nPath[j][i] += bCount;
                i = j;
            }
        }
        //int sum=fordFulkerson(nPath);
        return mSum;
    }
    
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
}