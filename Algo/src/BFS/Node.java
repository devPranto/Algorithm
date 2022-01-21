/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BFS;

import java.util.ArrayList;

/**
 *
 * @author PRANTO DEV
 */
public class Node {
    boolean visited ; 
    boolean explored ; 
    int distance ; 
    int serial ;
    ArrayList path;
    public Node(int i ) {
        path = new ArrayList<Integer>();
        serial = i ; 
    }
    @Override
    public String toString(){
        return "Serial : "+serial+ " Explored : "+explored +" , Distance : "+distance;
    }
    
}
