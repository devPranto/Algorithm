package prim;

public class Vertex {
	int weight;
	boolean visited, explored;
	Vertex parent;
	int serial;
int value ; 
	public Vertex(int s) {
		serial = s;
		value = Integer.MAX_VALUE;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return ""+serial ; 
	}
}
