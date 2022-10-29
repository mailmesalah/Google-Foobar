/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.google.task33;

import com.sun.org.apache.bcel.internal.generic.AALOAD;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author selyc
 */
public class Solution {

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
        
                       
         map =  new int[][]{{0, 0, 0, 0, 0}, 
				{1, 1, 1, 1, 0}, 
				{0, 0, 0, 0, 0},
				{0, 1, 0, 1, 1}, 
				{0, 0, 0, 0, 0}};
         
         map = new int[][]{
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
         
        
                              
         
          
            
                    
            
            
          
          
           map =  new int[][]{{0, 0, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 0}, {0, 0, 0, 0, 0, 0}, {0, 1, 1, 1, 1, 1}, {0, 1, 1, 1, 1, 1}, {0, 0, 0, 0, 0, 0}};         
           map =  new int[][]{
              {0, 0, 0, 0, 0, 0}, 
              {0, 1, 1, 1, 1, 0}, 
              {0, 1, 1, 0, 1, 0}, 
              {0, 0, 0, 0, 0, 0}, 
              {0, 1, 1, 0, 1, 1}, 
              {0, 1, 1, 0, 1, 1}, 
              {0, 0, 0, 0, 0, 0}};
           
           map = new int[][]{{0, 1, 1, 0}, {0, 0, 0, 1}, {1, 1, 0, 0}, {1, 1, 1, 0}};
           
           map = new int[][]{
              {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
              {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
              {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
              {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
              {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
              {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
              {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
              {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
              {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
              {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
              {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
              {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
              {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
              {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
              {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
              {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
              {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
              {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
              {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
              {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};

                     
                
        System.out.println("Question");
        printMatrix(map);
        System.out.println("Answer :" + Solution.solution(map));
        
        System.out.println("Matrix");
        printMatrix(map);
    }

       
    
    static class Node{
        public static int MAX=10000; 
        
        boolean isDoor=false;
        boolean isVisited=false;
        
        int distance=MAX;
        int distanceWithWall=MAX;
        
        
        public Node(int val){
            isDoor=val==0;
        }
        public Node(){
            
        }
        
        public int getSmallestDistance(){
            return distance>distanceWithWall?distanceWithWall:distance;
        }
        
    }
    
    static int rows=0;
    static int cols=0;
    static boolean wallUsed=false;
    static int currentPath=0;
    static int smallestPath=Node.MAX;    
        
      
    public static int solution(int[][] map) {                       
        
        if(map.length==1&&map[0].length==1){
            return 0;
        }                
        
        rows=map.length;
        cols=map[0].length;
        
        Node[][] nodes = new Node[rows][cols];
                
        //Copy input value to nodes
        for(int i=0;i<rows;++i){
            for(int j=0;j<cols;++j){
                nodes[i][j]= new Node(map[i][j]);
            }
        }
        //Setting the last(end) node distance to 0
        nodes[rows-1][cols-1].distance=0;
        
        //Empty current path
        currentPath=0;
        
               
        //Set the first node as visited
        nodes[0][0].isVisited=true;
        search(nodes,0,0);                
        
        return nodes[0][0].getSmallestDistance()+1;
    }
    
    
    static int search(Node[][] nodes,int row, int col){        
             
        ++currentPath;

        //If Count is greater than small value no need to further search
        //We need path for each nodes so no need to do the comparison
        if(currentPath+1>=smallestPath){
            --currentPath;
            if(wallUsed){
                return nodes[row][col].distanceWithWall;
            }else{
                return nodes[row][col].distance;
            }
        } 
        
        //if reached the end point
        if(row==rows-1 && col==cols-1){                
            smallestPath=smallestPath>currentPath?currentPath:smallestPath;
            --currentPath;
            return 0;
        }
        
        //If already traversed this node just return the distance based on if wall is used or not
        if(wallUsed){
            if(nodes[row][col].distanceWithWall!=Node.MAX){
                --currentPath;
                return nodes[row][col].distanceWithWall;
            }
        }else{
            if(nodes[row][col].distance!=Node.MAX){
                --currentPath;
                return nodes[row][col].distance;
            }
        }
                
        int ret=Node.MAX;        
        
        //right
        if(col+1<cols){
            if(nodes[row][col+1].isDoor && !nodes[row][col+1].isVisited){
                ret=Node.MAX; 
                nodes[row][col+1].isVisited=true;

                ret=search(nodes, row, col+1);                
                nodes[row][col+1].isVisited=false;
                //Save the distance
                if(wallUsed){
                    nodes[row][col].distanceWithWall=nodes[row][col].distanceWithWall>ret+1?ret+1:nodes[row][col].distanceWithWall;
                }else{
                    nodes[row][col].distance=nodes[row][col].distance>ret+1?ret+1:nodes[row][col].distance;
                }
                
            }else if(!nodes[row][col+1].isDoor && !wallUsed && !nodes[row][col+1].isVisited){
                ret=Node.MAX; 
                wallUsed=true;
                nodes[row][col+1].isVisited=true;
                
                ret=search(nodes, row, col+1);                
                wallUsed=false;
                nodes[row][col+1].isVisited=false;
                //Save the distance
                if(wallUsed){
                    nodes[row][col].distanceWithWall=nodes[row][col].distanceWithWall>ret+1?ret+1:nodes[row][col].distanceWithWall;
                }else{
                    nodes[row][col].distance=nodes[row][col].distance>ret+1?ret+1:nodes[row][col].distance;
                }
            }
        }
                        
        //down
        if(row+1<rows){
            if(nodes[row+1][col].isDoor && !nodes[row+1][col].isVisited){
                ret=Node.MAX; 
                nodes[row+1][col].isVisited=true;
                //++count;

                ret=search(nodes, row+1, col);                
                //if(ret==MAXV){//close here because no path
                //    nodes[row+1][col].isDoor=false;
                //}
                nodes[row+1][col].isVisited=false;
                //Save the distance
                if(wallUsed){
                    nodes[row][col].distanceWithWall=nodes[row][col].distanceWithWall>ret+1?ret+1:nodes[row][col].distanceWithWall;
                }else{
                    nodes[row][col].distance=nodes[row][col].distance>ret+1?ret+1:nodes[row][col].distance;
                }
                //--count;
            }else if(!nodes[row+1][col].isDoor && !wallUsed && !nodes[row+1][col].isVisited){
                ret=Node.MAX; 
                wallUsed=true;
                nodes[row+1][col].isVisited=true;
                
                ret=search(nodes, row+1, col);               
                wallUsed=false;
                nodes[row+1][col].isVisited=false;
                //Save the distance
                if(wallUsed){
                    nodes[row][col].distanceWithWall=nodes[row][col].distanceWithWall>ret+1?ret+1:nodes[row][col].distanceWithWall;
                }else{
                    nodes[row][col].distance=nodes[row][col].distance>ret+1?ret+1:nodes[row][col].distance;
                }
            }
        }
        
        //left
        if(col-1>=0){
            if(nodes[row][col-1].isDoor && !nodes[row][col-1].isVisited){
                ret=Node.MAX; 
                nodes[row][col-1].isVisited=true;

                ret=search(nodes, row, col-1);                
                nodes[row][col-1].isVisited=false;
                //Save the distance
                if(wallUsed){
                    nodes[row][col].distanceWithWall=nodes[row][col].distanceWithWall>ret+1?ret+1:nodes[row][col].distanceWithWall;
                }else{
                    nodes[row][col].distance=nodes[row][col].distance>ret+1?ret+1:nodes[row][col].distance;
                }
            }else if(!nodes[row][col-1].isDoor && !wallUsed && !nodes[row][col-1].isVisited){
                ret=Node.MAX; 
                wallUsed=true;
                nodes[row][col-1].isVisited=true;
                
                ret=search(nodes, row, col-1);                
                wallUsed=false;
                nodes[row][col-1].isVisited=false;
                //Save the distance
                if(wallUsed){
                    nodes[row][col].distanceWithWall=nodes[row][col].distanceWithWall>ret+1?ret+1:nodes[row][col].distanceWithWall;
                }else{
                    nodes[row][col].distance=nodes[row][col].distance>ret+1?ret+1:nodes[row][col].distance;
                }
            }
        }
        
        //up
        if(row-1>=0){
            if(nodes[row-1][col].isDoor && !nodes[row-1][col].isVisited){
                ret=Node.MAX; 
                nodes[row-1][col].isVisited=true;

                ret=search(nodes, row-1, col);                
                nodes[row-1][col].isVisited=false;
                //Save the distance
                if(wallUsed){
                    nodes[row][col].distanceWithWall=nodes[row][col].distanceWithWall>ret+1?ret+1:nodes[row][col].distanceWithWall;
                }else{
                    nodes[row][col].distance=nodes[row][col].distance>ret+1?ret+1:nodes[row][col].distance;
                }
            }else if(!nodes[row-1][col].isDoor && !wallUsed && !nodes[row-1][col].isVisited){
                ret=Node.MAX; 
                wallUsed=true;
                nodes[row-1][col].isVisited=true;
                
                ret=search(nodes, row-1, col);                
                wallUsed=false;
                nodes[row-1][col].isVisited=false;
                //Save the distance
                if(wallUsed){
                    nodes[row][col].distanceWithWall=nodes[row][col].distanceWithWall>ret+1?ret+1:nodes[row][col].distanceWithWall;
                }else{
                    nodes[row][col].distance=nodes[row][col].distance>ret+1?ret+1:nodes[row][col].distance;
                }
            }
        }
        
        --currentPath;
           
        if(wallUsed){
            return nodes[row][col].distanceWithWall;
        }else{
            return nodes[row][col].distance;
        }
                
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
    
    static void printMatrixVisited(Node [][] x){
        for(int i=0;i<x.length;++i){
            for(int j=0;j<x[0].length;++j){
                System.out.print(x[i][j].isVisited+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    static void printMatrix(Node [][] x){
        for(int i=0;i<x.length;++i){
            for(int j=0;j<x[0].length;++j){
                System.out.print(x[i][j].isDoor?1:0+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    static void printMatrixDist(Node [][] x){
        for(int i=0;i<x.length;++i){
            for(int j=0;j<x[0].length;++j){
                String s="         "+x[i][j].getSmallestDistance();
                s=s.substring(s.length()-5);
                System.out.print(s+"  ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
