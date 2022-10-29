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

public class FractionTest {
    
    public static void main(String[] arg){
        /*int[][] params=
        {
            {0, 86, 61, 189, 0, 18, 12, 33, 66, 39}, 
            {0, 0, 2, 0, 0, 1, 0, 0, 0, 0}, 
            {15, 187, 0, 0, 18, 23, 0, 0, 0, 0}, 
            {1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
        };*/
        
        /*int[][] params=
        {
            {2, 5, 1, 3}, 
            {4, 1, 7, 9}, 
            {6, 8, 3, 2}, 
            {7, 8, 1, 4}
        };*/
        
        /*int[][] params=
        {
            {5, -7, 2, 2}, 
            {0, 3, 0, -4}, 
            {-5, -8, 0, 3}, 
            {0, 5, 0, -6}
        };*/
        
        int[][] params=
        {
            {3, 0, 2}, 
            {2, 0, -2}, 
            {0, 1, 1}
        };
        
        Fraction f[][] = new Fraction[params.length][params.length];
        for(int i=0;i<params.length;++i){
            for(int j=0;j<params.length;++j){
                f[i][j]=new Fraction(params[i][j], 1);
            }
        }
        
        System.out.println("Matrix");
        printMatrix(params);
        
        System.out.println("Fraction Matrix");
        printFMatrix(f);
        
        Fraction d=Fraction.findDeterminant(f);
        System.out.println("Determinant = "+d.getNumerator()+"/"+d.getDenominator());
        
        Fraction[][] in=Fraction.matrixInverse(f);
        System.out.println("Inverse Matrix");
        printFMatrix(in);
        
        
        
    }
    
    private static void printMatrix(int[][] x){
        for(int i=0;i<x.length;++i){
            
            for(int j=0;j<x[i].length;++j){
                System.out.print(x[i][j]+"    ");
            }
            System.out.println();
        }
    }
    
    private static void printFMatrix(Fraction[][] x){
        for(int i=0;i<x.length;++i){
            
            for(int j=0;j<x[i].length;++j){
                System.out.print(x[i][j].getNumerator()+"/"+x[i][j].getDenominator()+"   ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static class Fraction{
        private int numerator=0;
        private int denominator=1;
        
        public Fraction(){
            numerator=0;
            denominator=1;
        }
        public Fraction(int n, int d){
            numerator=n;
            denominator=d;            
            reduce();
        }

        public int getNumerator() {
            return numerator;
        }

        public void setNumerator(int numberator) {
            this.numerator = numberator;
            reduce();
        }

        public int getDenominator() {
            return denominator;
        }

        public void setDenominator(int denominator) {
            this.denominator = denominator;
            reduce();
            
        }
        
        private void reduce(){
            //Fraction Reduction
            if(numerator==0){
                denominator=1;
            }
            int smallest=Math.abs(numerator)>Math.abs(denominator)?Math.abs(denominator):Math.abs(numerator);            
            for(int i=2;i<=smallest;++i){
                if(numerator%i==0 && denominator%i==0){
                    numerator/=i;
                    denominator/=i;
                    i=2;
                    smallest=numerator>denominator?denominator:numerator;
                    smallest=smallest/2;
                }
            }
            
            //Update Sign
            if(denominator<0){
                numerator*=-1;
                denominator*=-1;
            }
        }
        
        public static Fraction[][] matrixSubstract(Fraction[][] x, Fraction[][] y){
            
            Fraction[][] z= new Fraction[x.length][x[0].length];
            
            for(int i=0;i<x.length;++i){
                for(int j=0;j<x[0].length;++j){                    
                    z[i][j]= new Fraction(0,1);
                    z[i][j].denominator=x[i][j].denominator*y[i][j].denominator;
                    z[i][j].numerator=(x[i][j].numerator*y[i][j].denominator)-(y[i][j].numerator*x[i][j].denominator);
                }
            }
            
            return z;
            
        }
        
        public static Fraction[][] matrixMultiply(Fraction[][] x, Fraction[][] y){
            
            Fraction[][] z= new Fraction[x.length][y[0].length];
            
            for(int i=0;i<x.length;++i){                
                for(int j=0;j<y[0].length;++j){
                    z[i][j]=new Fraction(0,1);                    
                    for(int k=0;k<x.length;++k){
                        Fraction mul=Fraction.fracMultiply(x[i][k], y[k][j]);
                        z[i][j]=Fraction.fracAdd(z[i][j], mul);                        
                    }                    
                }
            }
            
            return z;
            
        }
        
        public static Fraction fracAdd(Fraction x, Fraction y){
            
            Fraction z= new Fraction();
            
            int xn=x.getNumerator();
            int xd=x.getDenominator();
            int yn=y.getNumerator();
            int yd=y.getDenominator();
            
            int n= (xn*yd)+(yn*xd);
            int d= xd*yd;
            
            z.setNumerator(n);
            z.setDenominator(d);
            z.reduce();
            
            return z;
            
        }
        
        public static Fraction fracSubtract(Fraction x, Fraction y){
            
            Fraction z= new Fraction();
            
            int xn=x.getNumerator();
            int xd=x.getDenominator();
            int yn=y.getNumerator();
            int yd=y.getDenominator();
            
            int n= (xn*yd)-(yn*xd);
            int d= xd*yd;
            
            z.setNumerator(n);
            z.setDenominator(d);
            z.reduce();
            
            return z;
            
        }
        
        public static Fraction fracMultiply(Fraction x, Fraction y){
            
            Fraction z= new Fraction();
            z.setNumerator(x.getNumerator()*y.getNumerator());
            z.setDenominator(x.getDenominator()*y.getDenominator());
            
            z.reduce();
            return z;
            
        }        
        
        public static Fraction[][] matrixInverse(Fraction[][] x){            
            
            //Determinant
            Fraction determinant= new Fraction();
            //Step 1: Matrix of Minors & Step 2: Matrix of Cofactors
            Fraction[][] minorCo = new Fraction[x.length][x.length];
            if(x.length==2){//For 2x2 Matrix                
                minorCo[0][0]= new Fraction(x[1][1].getNumerator(), x[1][1].getDenominator());
                minorCo[0][1]= new Fraction(x[1][0].getNumerator()*-1, x[1][0].getDenominator());
                minorCo[1][0]= new Fraction(x[0][1].getNumerator()*-1, x[0][1].getDenominator());
                minorCo[1][1]= new Fraction(x[0][0].getNumerator(), x[0][0].getDenominator());
                //determinant for 2x2
                determinant= Fraction.fracSubtract(Fraction.fracMultiply(minorCo[0][0], minorCo[1][1]), Fraction.fracMultiply(minorCo[0][1], minorCo[1][0]));                 
            }else{
                for(int i=0;i<x.length;++i){
                    for(int j=0;j<x.length;++j){                        
                        minorCo[i][j]=Fraction.findDeterminant(Fraction.getExMatrix(x, i, j));
                        
                        //System.out.println("Sub Matrix of "+i+"-"+j);
                        //printFMatrix(Fraction.getExMatrix(x, i, j));
                        //System.out.print("Its Determinant "+minorCo[i][j].getNumerator()+"/"+minorCo[i][j].getDenominator()+"\n");
                        int sign=(int)Math.pow(-1,i+j);
                        minorCo[i][j].setNumerator(minorCo[i][j].getNumerator()*sign);                        
                    }
                }
                //Finding the Determinant of Whole Matrix
                determinant=Fraction.findDeterminant(x);
            }
            
            //System.out.println("Minor");
            //printFMatrix(minorCo);
            
            //Step 3: Adjugate (also called Adjoint)
            Fraction[][] adj = new Fraction[x.length][x.length];
            for(int i=0;i<x.length;++i){
                for(int j=0;j<x.length;++j){
                    adj[i][j]=minorCo[j][i];
                }
            }
            
            //Step 4: Multiply by 1/Determinant
            Fraction[][] inv = new Fraction[x.length][x.length];
            int n=determinant.getNumerator();
            int d=determinant.getDenominator();
            Fraction indet= new Fraction(d,n);
            for(int i=0;i<x.length;++i){
                for(int j=0;j<x.length;++j){
                    inv[i][j]=Fraction.fracMultiply(indet, adj[i][j]);
                }
            }
            
            return inv;
            
        }
        
        public static Fraction findDeterminant(Fraction[][] x){            
            
            if(x.length==2){
                Fraction ad=Fraction.fracMultiply(x[0][0],x[1][1]);
                Fraction bc=Fraction.fracMultiply(x[1][0],x[0][1]);                                
                return Fraction.fracSubtract(ad, bc);
            }else{
                //Laplace Expansion                
                int l=(x.length*2)-1;
                Fraction[][] exM =new Fraction[x.length][l];
                //Fill the expansion matrix
                for(int i=0;i<x.length;++i){
                    for(int j=0;j<x.length;++j){
                        exM[i][j]=x[i][j];
                    }
                }
                //Added columns
                for(int i=0;i<x.length;++i){
                    for(int j=0;j<x.length-1;++j){
                        int jj=x.length+j;
                        exM[i][jj]=x[i][j];
                    }
                }
                
                
                Fraction a = new Fraction(0,1);//For addition
                for(int k=0;k<x.length;++k){
                    
                    int ro=0;
                    int co=k;
                    Fraction aa = new Fraction(1,1);//for multiply
                    while(ro<x.length){                                                
                        aa=Fraction.fracMultiply(aa, exM[ro][co]);                        
                        
                        ++ro;
                        ++co;
                    }
                    a=Fraction.fracAdd(a, aa);
                                        
                }                
                Fraction b = new Fraction(0,1);//For addition
                for(int k=0;k<x.length;++k){
                    
                    int ro=x.length-1;
                    int co=k;
                    Fraction bb = new Fraction(1,1);//for multiply
                    while(ro>=0){                                                
                        bb=Fraction.fracMultiply(bb, exM[ro][co]);                        
                        
                        --ro;
                        ++co;
                    }
                    b=Fraction.fracAdd(b, bb);                                        
                }
                
                Fraction det = Fraction.fracSubtract(a, b);
                
                return det;                
            }
                        
        }
        
        public static Fraction[][] getExMatrix(Fraction x[][], int ro, int col){
            Fraction res[][]= new Fraction[x.length-1][x.length-1];
            int ii=0;
            int jj=0;
            for(int i=0;i<x.length;++i){
                if(i!=ro){
                    for(int j=0;j<x.length;++j){
                        if(j!=col){
                            int n=x[i][j].getNumerator();
                            int d=x[i][j].getDenominator();
                            res[ii][jj]=new Fraction(n,d);
                            ++jj;
                        }
                    }
                    jj=0;
                    ++ii;
                }
            }
            return res;
        }
        
    }
}