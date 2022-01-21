/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dijkstra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 *
 * @author 18101424
 */
public class Tester {
  static PriorityQueue<Integer> q = new PriorityQueue<>();
       static ArrayList<Vertex> graph = new ArrayList<Vertex>();
       static int [] parent ;
       static int distance [];
       static boolean visited []; 
       static int vs ; 
       static int es ; 
    public static void  main(String[]args)throws  Exception{
            FileReader f = new FileReader("D:\\DFS FROM BOOK\\Algo\\src\\Dijkstra\\input.txt");
            int  matrix [][] =f.getMatrix(); 
            vs = f.vertex ; 
            es = f.edge ; 
            parent = new int[vs];       
        for (int i = 0; i < vs; i++) {
            parent[i]=-1 ;        
        }
        distance = new int[vs];
        for(int i =0 ; i<vs ; i++){
            distance[i]=100000 ; 
        }
        visited = new boolean[vs];
        for(int i =0 ; i<vs ; i++){
            visited[i]=false ; 
        }
             for(int i =0 ; i<vs ; i++){
                    Vertex v = new Vertex(i);
                    graph.add(v);
                } 
             for(int i = 0 ; i<vs ; i++){
                 for(int j = 0 ; j <vs ; j++){
                     if(matrix[i][j]!=0){
                         graph.get(j).d=matrix[i][j];
                     }
                 }
             }
           Scanner scan = new Scanner (System.in);
           System.out.println("Please select a source Node :) from  0 to "+(vs-1));
             int src = scan.nextInt();
             q.add(src);
             graph.get(src).d=0 ;
                        distance[src]=0 ; 
             while(!q.isEmpty()){
                 int p=q.poll();
                 //System.out.println(p+" <== ");
                 for(int i =0 ; i<vs ; i++){
                     if(graph.get(i).d==p){
                         p =i ; 
                     }
                 }
                 System.out.println(p);
               //  System.out.println(p+" <== ");
           for(int i =0 ; i<vs ; i++){
              // System.out.println(graph.get(i).color +" === "+p);
               if(matrix[p][i]!=0 && graph.get(i).color=='w'){
                   if(distance[i]>(matrix[p][i]+distance[p])){
                       
                       distance[i]=matrix[p][i]+distance[p];
                       graph.get(i).d=matrix[p][i]+distance[p];
                       graph.get(i).parent= graph.get(p);
                       q.add(matrix[src][i]+distance[p]);
                       System.out.println(q);
                   }
               }
           }
           graph.get(src).color='b';
             }
             print();
    }
    public static  void initialize(){
        
        
    }
    public static  void print(){
        for(int i =0 ; i<vs ; i++){
            System.out.println(graph.get(i).label +" , "+graph.get(i).d +" distance "+distance[i]);
        }
    }
}
