/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DFS;

/**
 *
 * @author PRANTO DEV
 */
public class Vertex {
char color ; 
int label  ; 
int distance ;
int finish ; 
Vertex parent ; 

public Vertex(int i ){
    label = i ; 
    color = 'w';
}
public String toString(){
            return ""+label ;
        }
}
