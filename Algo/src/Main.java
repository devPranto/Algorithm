import java.util.*;

import javax.sound.midi.Soundbank;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		LinkedList<Node> graph = new LinkedList<>();
		for (int i = 0; i <=N ; i++) {
			Node node = new Node(i);
			graph.add(node);
		}
		int[][] matrix = new int[N + 1][N + 1];
		// two cost 
		int total = 0;
		int newCost = 0 ; 
		for (int j = 1; j < N; j++) {
			int row = scan.nextInt();
			int column = scan.nextInt();
			int cost = scan.nextInt();
			matrix[row][column] = cost;
			total += cost;
		}
	//	System.out.println(total);
		//k input 
		int k = scan.nextInt();
		for (int i = 1; i <= k; i++) {
			int row = scan.nextInt();
			int column = scan.nextInt();
			int cost = scan.nextInt();
			matrix[row][column] = cost;
		}
		//System.out.println("K done");
		//M input 
		int M = scan.nextInt() ; 
		for (int i = 1; i <= M; i++) {
			int row = scan.nextInt();
			int column = scan.nextInt();
			int cost = scan.nextInt();
			matrix[row][column] = cost;
		}
	//	System.out.println("M done");

		  Queue<Integer> q = new LinkedList<Integer>();
          q.add(1);
          graph.get(1).cost=0 ;
          while(!q.isEmpty()){
              int currentNode= q.poll();
              Node s = graph.get(currentNode);
              s.color = 'g';
            //  System.out.println(currentNode);
              for(int i =1 ; i<=N ; i++){
                  if(matrix[currentNode][i]>0 && !(graph.get(i).color=='b')&& (graph.get(i).cost>matrix[currentNode][i])){
                      Node next = graph.get(i);
                      next.cost = matrix[currentNode][i];
                      q.add(i);
                  }
              }
              s.color='b' ;
          }
          for (int i = 1; i <=N; i++) {
			newCost+=graph.get(i).cost ; 
		}
          System.out.println(total);
          System.out.println(newCost);
	}
}

//Node class
class Node {
	int cost = Integer.MAX_VALUE;
	char color = 'w';
	int serial;

	public Node(int i) {
		serial = i;
	}
}