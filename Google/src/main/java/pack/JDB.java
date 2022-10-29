/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack;

import java.util.Random;

/**
 *
 * @author selyc
 */
public class JDB {
    
    public static void main(String[] arg){
        System.out.println("Question");
        Random r = new Random();
        String sql="INSERT INTO StockEntryDetail (StockEntry_fk,SerialNo,Product_fk,Quantity,ProductPrice) VALUES (";
        int min = 2;
        int range = 10;
        int prMax=30;
        for(int i=1;i<=142;++i){
            int limit=r.nextInt(range);
            for(int j=1;j<= (limit+ min);++j){
                String s=i+","+j+","+(r.nextInt(prMax)+1)+","+(r.nextInt(10)+1+","+(r.nextInt(10000)+1)+");");
                System.out.println(sql+s);
            }
        }
        
    }
}
