package BFS;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TestBFS {
	public static void main(String[] args) throws Exception {
		FileReader fReader = new FileReader("C:\\Users\\PRANTO DEV\\Documents\\NetBeansProjects\\Algo\\src\\BFS\\input.txt");

		int [][]matrix = fReader.getMatrix();
                int size = fReader.size;
                ArrayList<Node> graph = new ArrayList<Node>();
                for(int i =0 ; i<size ; i++){
                    Node n = new Node(i);
                    graph.add(n);
                }
                 Scanner sc = new Scanner(System.in);
                 System.out.println("input a number a from 0 to "+size);
                 int source = sc.nextInt();
                 Queue<Integer> q = new LinkedList<Integer>();
                 q.add(source);
                 
                 while(!q.isEmpty()){
                     int currentNode= q.poll();
                     Node s = graph.get(currentNode);
                     s.visited = true ;
                     System.out.println(currentNode);
                     for(int i =0 ; i<size ; i++){
                         if(matrix[currentNode][i]==1){
                             Node next = graph.get(i);
                             if(!next.visited){
                              next.visited= true ; 
                              next.distance=s.distance+1;
                              next.path.add(currentNode);
                              q.add(i);   
                             }
                         }
                     }
                     s.explored=true ;
                 }
                 for(int i =0 ; i<size ; i++){
                     System.out.println(graph.get(i));
                 }
        }
}
