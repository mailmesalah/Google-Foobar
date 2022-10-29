/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.google.task33;

/**
 *
 * @author selyc
 */
public class SolutionWorking {

    public static void main(String[] arg) {

        int [][] map = new int[][]{{0, 1, 1, 0}, {0, 0, 0, 1}, {1, 1, 0, 0}, {1, 1, 1, 0}};
        /*small=Integer.MAX_VALUE;
        System.out.println("Question");
        printMatrix(map);
        System.out.println("Answer :" + Solution.solution(map));
        
        map = new int[][]{{0, 0, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 0}, {0, 0, 0, 0, 0, 0}, {0, 1, 1, 1, 1, 1}, {0, 1, 1, 1, 1, 1}, {0, 0, 0, 0, 0, 0}};
        small=Integer.MAX_VALUE;
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
        
        map =new int[][]{{0, 1, 1, 0}, {0, 0, 0, 1}, {1, 1, 0, 0}, {1, 1, 1, 0}};
        map =new int[][]{{0, 0, 0,0,0,0,0,0,0,0,0,0,0,0,0, 0}};
        
        map = new int[][]{{0, 0, 0, 0, 0},
              {0, 0, 0, 0, 0, 0},
              {0, 0, 0, 0, 0, 0},
              {0, 0, 0, 0, 0, 0},
              {0, 0, 0, 0, 0, 0},
              {0, 0, 0, 0, 0, 0},
              {0, 0, 0, 0, 0, 0},
              {0, 0, 0, 0, 0, 0},
              {0, 0, 0, 0, 0, 0},
              {0, 0, 0, 0, 0, 0},
              {0, 0, 0, 0, 0, 0},
              {0, 0, 0, 0, 0, 0},
              {0, 0, 0, 0, 0, 0},
              {0, 0, 0, 0, 0, 0},
              {0, 0, 0, 0, 0, 0},
              {0, 0, 0, 0, 0, 0},
              {0, 0, 0, 0, 0, 0},
              {0, 0, 0, 0, 0, 0}};
        
        small=Integer.MAX_VALUE;
        System.out.println("Question");
        printMatrix(map);
        System.out.println("Answer :" + SolutionWorking.solution(map));
        
    }

    public static int solution(int[][] map) {
               
        boolean[][]visited= new boolean[map.length][map[0].length];
                        
        visited[0][0]=true;
        search(map,0,0,false,visited);
        
        small=small==Integer.MAX_VALUE?0:small+1;
        int ret=small;
        small=Integer.MAX_VALUE;
        return ret;
    }
    
    static int count=0;
    static int small=Integer.MAX_VALUE;
    static void search(int[][] x, int row, int col, boolean wallUsed, boolean[][] visited){        
        
        //System.out.println("Visited : "+row+"-"+col);
        //printMatrix(visited);
        //if reached the end point
        if(row==x.length-1 && col==x[0].length-1){
            //System.out.println("Count : "+count);
            if(count<small){
                small=count;
            }
            visited[row][col]=false;
            return;
        }
        
        
        
        //right
        if(col+1<x[0].length){
            if(x[row][col+1]==0 && !visited[row][col+1]){
                visited[row][col+1]=true;
                ++count;

                search(x, row, col+1, wallUsed, visited);
                visited[row][col+1]=false;
                --count;
            }else if(x[row][col+1]==1 && !wallUsed && !visited[row][col+1]){
                wallUsed=true;
                visited[row][col+1]=true;
                ++count;
                
                search(x, row, col+1, wallUsed, visited);
                wallUsed=false;
                visited[row][col+1]=false;
                --count;
            }
        }
                        
        //down
        if(row+1<x.length){
            if(x[row+1][col]==0 && !visited[row+1][col]){
                visited[row+1][col]=true;
                ++count;

                search(x, row+1, col, wallUsed, visited);
                visited[row+1][col]=false;
                --count;
            }else if(x[row+1][col]==1 && !wallUsed && !visited[row+1][col]){
                wallUsed=true;
                visited[row+1][col]=true;
                ++count;
                
                search(x, row+1, col, wallUsed, visited);
                wallUsed=false;
                visited[row+1][col]=false;
                --count;
            }
        }
        
        //left
        if(col-1>=0){
            if(x[row][col-1]==0 && !visited[row][col-1]){
                visited[row][col-1]=true;
                ++count;

                search(x, row, col-1, wallUsed, visited);
                visited[row][col-1]=false;
                --count;
            }else if(x[row][col-1]==1 && !wallUsed && !visited[row][col-1] && (col-1)>=0){
                wallUsed=true;
                visited[row][col-1]=true;
                ++count;
                
                search(x, row, col-1, wallUsed, visited);
                wallUsed=false;
                visited[row][col-1]=false;
                --count;
            }
        }
        
        //up
        if(row-1>=0){
            if(x[row-1][col]==0 && !visited[row-1][col]){
                visited[row-1][col]=true;
                ++count;

                search(x, row-1, col, wallUsed, visited);
                visited[row-1][col]=false;
                --count;
            }else if(x[row-1][col]==1 && !wallUsed && !visited[row-1][col]){
                wallUsed=true;
                visited[row-1][col]=true;
                ++count;
                
                search(x, row-1, col, wallUsed, visited);
                wallUsed=false;
                visited[row-1][col]=false;
                --count;
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
            for(int j=0;j<x.length;++j){
                System.out.print(x[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
