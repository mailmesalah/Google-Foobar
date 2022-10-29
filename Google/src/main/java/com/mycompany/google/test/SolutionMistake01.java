/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.google.test;


/**
 *
 * @author selyc
 */
public class SolutionMistake01 {

    public static void main(String[] arg) {

        int [][] map = new int[][]{{0, 1, 1, 0}, {0, 0, 0, 1}, {1, 1, 0, 0}, {1, 1, 1, 0}};
        /*small=Integer.MAX_VALUE;
        System.out.println("Question");
        printMatrix(map);
        System.out.println("Answer :" + Solution.solution(map));*/
        
        //map = new int[][]{{0, 0, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 0}, {0, 0, 0, 0, 0, 0}, {0, 1, 1, 1, 1, 1}, {0, 1, 1, 1, 1, 1}, {0, 0, 0, 0, 0, 0}};
        /*small=Integer.MAX_VALUE;
        System.out.println("Question");
        printMatrix(map);
        System.out.println("Answer :" + Solution.solution(map));*/
        
        /*map = new int[][]{{0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
              {1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
              {1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0},
              {1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
              {1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
              {1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
              {1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
              {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
              {0, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
              {0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
              {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
              {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0},
              {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0},
              {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1},
              {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1},
              {0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0},
              {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0},
              {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0},
              {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
              {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0}};*/
        
        map = new int[][]{{0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
              {1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
              {1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0},
              {1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
              {1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
              {1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
              {1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
              {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
              {0, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
              {0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
              {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
              {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0}};
        
        map = new int[][]{{0, 0, 1, 1, 1},
              {1, 1, 0, 1, 1, 1},
              {1, 1, 0, 0, 0, 0},
              {1, 1, 1, 0, 0, 1},
              {1, 1, 1, 1, 0, 0},
              {1, 0, 0, 0, 0, 0},
              {1, 1, 1, 1, 1, 1},
              {0, 0, 0, 0, 0, 0},
              {0, 1, 1, 1, 1, 1},
              {0, 1, 1, 1, 1, 1},
              {0, 0, 1, 0, 0, 0},
              {1, 1, 1, 1, 1, 1}};
        
        
        map = new int[][]{{0, 0, 1, 1, 1},
              {1, 1, 0, 1, 1, 1},
              {1, 0, 0, 0, 0, 0},
              {1, 1, 1, 1, 1, 1},
              {0, 0, 0, 0, 0, 0},
              {0, 1, 1, 1, 1, 1},
              {0, 1, 1, 1, 1, 1},
              {0, 0, 1, 0, 0, 0},
              {1, 1, 1, 1, 1, 1}};
        map = new int[][]{{0, 0, 1, 1, 1},
              {1, 1, 0, 1, 1, 1},
              {0, 0, 0, 0, 0, 0},
              {0, 1, 1, 1, 1, 1},
              {0, 1, 1, 1, 1, 1},
              {0, 0, 1, 0, 0, 0},
              {1, 1, 1, 1, 1, 1}};
        
        
        map = new int[][]{{0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
              {1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
              {1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0},
              {1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
              {1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
              {1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
              {1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
              {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0},
              {0, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
              {0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
              {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0},
              {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0},
              {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0},
              {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1},
              {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1},
              {0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0},
              {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0},
              {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0},
              {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0},
              {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 0}};
        
         map = new int[][]{{0, 0, 1, 1, 1},
              {1, 1, 0, 1, 1, 1},
              {0, 0, 0, 0, 0, 0},
              {0, 1, 1, 1, 1, 1},
              {0, 1, 1, 1, 1, 1},
              {0, 0, 1, 0, 0, 0},
              {1, 1, 1, 1, 1, 1}};
         
         map = new int[][]{{0}};
        
        
        small=Integer.MAX_VALUE;
        System.out.println("Question");
        printMatrix(map);
        System.out.println("Answer :" + SolutionMistake01.solution(map));
        
        System.out.println("Matrix");
        printMatrix(map);
    }

    public static int solution(int[][] map) {
               
        boolean[][]visited= new boolean[map.length][map[0].length];
        
        map[0][0]=1;
        map[map.length-1][map[0].length-1]=1;
        visited[0][0]=true;
        int [][]x=new int[map.length][map[0].length] ;
        copyMatrix(map, x);
        search(x,map,0,0,visited);                
        
        small=small==Integer.MAX_VALUE?0:small+1;
        return small;
    }
    
    static int count=0;
    static int small=Integer.MAX_VALUE;
    static boolean wallUsed=false;
    static boolean search(int[][] x,int[][] map, int row, int col, boolean[][] visited){        
        
        //System.out.println("Visited : "+row+"-"+col);
        //printMatrix(x);
        //printMatrix(visited);
        //if reached the end point
        if(row==x.length-1 && col==x[0].length-1){
            //System.out.println("Count : "+count);
            if(count<small){
                small=count;
            }
            visited[row][col]=false;
            return true;
        }
        
        boolean success=false;
        boolean ret=false;
        
        //right
        if(col+1<x[0].length){
            if(x[row][col+1]==1 && !visited[row][col+1]){
                visited[row][col+1]=true;
                ++count;

                ret=search(x,map, row, col+1, visited);
                success=ret?true:success;
                if(!ret){//close here because no path
                    x[row][col+1]=0;
                }
                visited[row][col+1]=false;                
                --count;
            }else if(x[row][col+1]==0 && !wallUsed && !visited[row][col+1]){
                wallUsed=true;
                visited[row][col+1]=true;
                ++count;
                
                ret=search(x,map, row, col+1, visited);
                success=ret?true:success;
                if(!ret){//close here because no path
                    x[row][col+1]=0;
                }
                wallUsed=false;
                copyMatrix(map, x);
                visited[row][col+1]=false;
                --count;
                //System.out.println("Reset");
                //printMatrix(x);
                //printMatrix(map);
            }
        }
                        
        //down
        if(row+1<x.length){
            if(x[row+1][col]==1 && !visited[row+1][col]){
                visited[row+1][col]=true;
                ++count;

                ret=search(x,map, row+1, col, visited);
                success=ret?true:success;
                if(!ret){//close here because no path
                    x[row+1][col]=0;
                }
                visited[row+1][col]=false;
                --count;
            }else if(x[row+1][col]==0 && !wallUsed && !visited[row+1][col]){
                wallUsed=true;
                visited[row+1][col]=true;
                ++count;
                
                ret=search(x,map, row+1, col, visited);
                success=ret?true:success;
                if(!ret){//close here because no path
                    x[row+1][col]=0;
                }
                wallUsed=false;
                copyMatrix(map, x);
                visited[row+1][col]=false;
                --count;
                //System.out.println("Reset");
                //printMatrix(x);
                //printMatrix(map);
            }
        }
        
        //left
        if(col-1>=0){
            if(x[row][col-1]==1 && !visited[row][col-1]){
                visited[row][col-1]=true;
                ++count;

                ret=search(x,map, row, col-1, visited);
                success=ret?true:success;
                if(!ret){//close here because no path
                    x[row][col-1]=0;
                }
                visited[row][col-1]=false;
                --count;
            }else if(x[row][col-1]==0 && !wallUsed && !visited[row][col-1] && (col-1)>=0){
                wallUsed=true;
                visited[row][col-1]=true;
                ++count;
                
                ret=search(x,map, row, col-1, visited);
                success=ret?true:success;
                if(!ret){//close here because no path
                    x[row][col-1]=0;
                }
                wallUsed=false;
                copyMatrix(map, x);
                visited[row][col-1]=false;
                --count;
                //System.out.println("Reset");
                //printMatrix(x);
                //printMatrix(map);
            }
        }
        
        //up
        if(row-1>=0){
            if(x[row-1][col]==1 && !visited[row-1][col]){
                visited[row-1][col]=true;
                ++count;

                ret=search(x,map, row-1, col, visited);
                success=ret?true:success;
                if(!ret){//close here because no path
                    x[row-1][col]=0;
                }
                visited[row-1][col]=false;
                --count;
            }else if(x[row-1][col]==0 && !wallUsed && !visited[row-1][col]){
                wallUsed=true;
                visited[row-1][col]=true;
                ++count;
                
                ret=search(x,map, row-1, col, visited);
                success=ret?true:success;
                if(!ret){//close here because no path
                    x[row-1][col]=0;
                }
                wallUsed=false;
                copyMatrix(map, x);
                visited[row-1][col]=false;
                --count;
                //System.out.println("Reset");
                //printMatrix(x);
                //printMatrix(map);
            }
        }
        
        //System.out.println("Returning : "+row+"-"+col);
        //printMatrix(x);
        //printMatrix(visited);
        
        /*if(!ret){//close here because no path
            x[row][col]=0;
        }*/
        
        return success;
    }
    
    static void copyMatrix(int[][] x, int [][]y){
        for(int i=0;i<x.length;++i){
            for(int j=0;j<x[0].length;++j){
                y[i][j]=x[i][j];
            }
        }
    }

    static void printMatrix(int [][] x){
        for(int i=0;i<x.length;++i){
                                                    
            for(int j=0;j<x[0].length;++j){
                if(i==0 && j==0){
                    System.out. print("   ");
                    for(int k=0;k<x[0].length;++k){
                        String s1="   "+k;
                        s1=s1.substring(s1.length()-3);
                        System.out. print(s1);
                    }
                    System.out.println();
                }
                if(j==0){
                     String s2="   "+i;
                     s2=s2.substring(s2.length()-3);
                     System.out. print(s2);
                }
                String s3="   "+x[i][j];
                s3=s3.substring(s3.length()-3);
                System.out. print(s3);                
            }
            System.out.println();
        }
        System.out.println();
    }
    
    static void printMatrix(boolean [][] x){
        for(int i=0;i<x.length;++i){
            for(int j=0;j<x[0].length;++j){
                System.out.print(x[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
