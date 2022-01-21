/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DFS;

import java.io.*;
import java.util.*;
/**
 *
 * @author PRANTO DEV
 */
public class FileReader {
    Scanner scan ;
     int [][] matrix ;
    int size ; 
    public FileReader(String path) throws  Exception{
    scan = new Scanner(new File(path));
    size = scan.nextInt();
    }
    public int [][] getMatrix(){
         matrix = new int[size][size];
        while(scan.hasNext()){
            int row = scan.nextInt();
            int column= scan.nextInt();
            matrix[row][column]=1 ; 
          //  matrix[column][row]=1 ; 
        }
        print();
        return matrix;
    }
    public int getSize(){
        return size;
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
