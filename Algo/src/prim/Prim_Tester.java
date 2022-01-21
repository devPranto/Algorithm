package prim;

import java.util.*;

public class Prim_Tester {
	static LinkedList<Vertex> graph = new LinkedList<Vertex>();
	static int edge, size;
	static int[][] matrix;
	static Q queue = new Q();
	static int cost = 0;

	public static void main(String[] args) throws Exception {
		FileReader fileReader = new FileReader(
				"D:\\Algo\\src\\Prim\\input.txt");
		matrix = fileReader.getMatrix();
		size = fileReader.getSize();
		edge = fileReader.getSize();
		// Now we will initialize an boolean array for keep track of explored vertices
		// Scanner scan = new Scanner(System.in);
		initiate();
		System.out.println(size);
		prims(0);
		System.out.println("Cost : "+cost);
		print();
	}

	public static void initiate() {

		for (int i = 0; i < size; i++) {
			Vertex vertex = new Vertex(i);
			graph.add(vertex);
		}
	}

	public static void prims(int src) {
		queue.add(src, 0);
		graph.get(src).value=0 ; 
		while (!queue.isEmpty()) {
			src = queue.getMin();
			System.out.println(src);
			for (int i = 0; i < size; i++) {
				if (matrix[src][i] > 0 && graph.get(i).value > graph.get(src).value+matrix[src][i] && !graph.get(i).explored) {
					Vertex vertex = graph.get(i);
					vertex.value = matrix[src][i]+graph.get(src).value;
					cost += matrix[src][i];
					vertex.parent = graph.get(src);
					queue.add(i, matrix[src][i]);
					System.out.println("Q ====> "+ matrix[src][i]);
				}
			}
			graph.get(src).explored = true;
		}
	}
	public static void print() {
		for (int i = 0; i < size; i++) {
			System.out.println(graph.get(i) +" ==> Parent : "+graph.get(i).parent +" value "+graph.get(i).value);
		}
	}
}
