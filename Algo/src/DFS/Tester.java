/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DFS;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import javafx.scene.control.TreeItem;

/**
 *
 * @author PRANTO DEV
 */
public class Tester {
    static LinkedList a = new LinkedList();
     static ArrayList<Vertex> graph = new ArrayList<Vertex>();
     static int [][]matrix ;
     static int size; 
     static int time = 0 ; 
    public static void main(String[]args) throws Exception {
		FileReader fReader = new FileReader("D:\\DFS FROM BOOK\\Algo\\src\\DFS\\input.txt");

		matrix = fReader.getMatrix();
                 size = fReader.getSize();
              
                for(int i =0 ; i<size ; i++){
                    Vertex v = new Vertex(i);
                    graph.add(v);
                }
                 Scanner sc = new Scanner(System.in);
                 System.out.println("input a number a from 0 to "+size);
                 int source = sc.nextInt();
                         
                 Vertex v = graph.get(source);
                 dfs(v);
                topologicalSort();
                 
    }

  public static void dfs(Vertex v){
      //System.out.println(v.label);
      int k = v.label;
      for(int i =0 ; i<size ; i++){
          k=k%size ; 
         // System.out.println(k);
          if(graph.get(k).color=='w'){
              dfsVisit(graph.get(k));
                            k++ ; 
          }
      }
  }
public static void dfsVisit(Vertex u){
 
    time+=1 ;
    u.distance = time ;
    u.color ='g';// visited
    for(int i =0 ; i <size ; i++){
        if(matrix[u.label][i]==1 && graph.get(i).color=='w'){
            graph.get(i).parent=u ; 
            dfsVisit(graph.get(i));
        }
    }
       a.add(u);
    u.color='b';
    time++;
    u.finish=time ; 
    System.out.println(u.label +", Time : "+ u.distance+"  , Finish Time : "+u.finish  +" , Parent : "+u.parent);
}
public static void topologicalSort()throws Exception{
 Iterator x = a.descendingIterator();
while(x.hasNext()){
    System.out.print(x.next());
}
System.out.print("] \n");

}
}
