/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dijkstra;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author 18101424
 */
public class FileReader {
    int vertex  ; 
    int edge ;
    int[][] matrix;
            Scanner scan ; 
     
    public FileReader(String pathString ) throws FileNotFoundException {
        scan = new Scanner (new File(pathString));
        vertex = scan.nextInt();
        edge = scan.nextInt();
        matrix = new int[vertex][vertex];
    }
    public int [][] getMatrix(){
        while(scan.hasNext()){
            int row = scan.nextInt();
            int column = scan.nextInt();
            int weight = scan.nextInt();
            matrix[row][column]=weight;
                        matrix[column][row]=weight;
        }
        return matrix ; 
    }
    
}
