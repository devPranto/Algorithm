/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prim;

import java.io.*;
import java.util.*;

import com.sun.javafx.scene.traversal.WeightedClosestCorner;
/**
 *
 * @author PRANTO DEV
 */
public class FileReader {
    Scanner scan ;
     int [][] matrix ;
    int size ; 
    int edge  ; 
    int weight_value ; 
    public FileReader(String path) throws  Exception{
    scan = new Scanner(new File(path));
    size = scan.nextInt();
    edge = scan.nextInt();
//    System.out.println(size +"  "+edge);
    }
    public int [][] getMatrix(){
         matrix = new int[size][size];
        while(scan.hasNext()){
            int row = scan.nextInt();
            int column= scan.nextInt();
            int weight =scan.nextInt(); 
            matrix[row][column]= weight ; 
            matrix[column][row]= weight ; 
   //         System.out.println(weight);
        }
        print();
        return matrix;
    }
    public int getSize(){
        return size;
    }
    public int getEdge() {
    	return edge ;
    }
    public void print(){
        for(int i =0 ; i < size ; i++){
            for(int j =0 ; j <size ; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
    
}
