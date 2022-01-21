package GraphUtility;

import java.util.LinkedList;

import GraphUtility.graph.edge;

public class graph {
class edge{
	int i,  v , w ; 
	edge(int v , int w ){
		this.v=v ; 
		this.w = w ; 
	}
	@Override
	public String toString() {
		return "[Vertex : "+v+", weight : "+w+"]" ;
	}
}
	LinkedList <edge> []e ; 
	graph(int n){
		e = new LinkedList[n];
		for(int i =0 ; i<n ; i++) {
			e[i]=new LinkedList<edge>();
		}
	}
	@Override
	public String toString() {
		String result="";
		for(int i =0 ; i<e.length ; i++) {
			result+=i+" "+e[i]+" \n" ;
		}
		return result ; 
	}
	void addEdge(int i , int v , int w ) {
		e[i].add(0, new edge(v,w));
	}
	boolean isConnected(int u ,int v) {
		for(edge i : e[u]) {
			if(i.v==v) {
				return true ;
			}
		}
		return false ;
	}
LinkedList<edge> getLinkedNodes(int i ) {
return e[i];
}
}
 class Tester{
	public static void main(String[]args) {
		graph g = new graph(10);
		g.addEdge(0, 1, 10);
		g.addEdge(2, 5, 12);
		g.addEdge(3, 5, 16);
		g.addEdge(4, 6, 77);
		g.addEdge(7, 6, 34);
		g.addEdge(7, 5, 13);
		System.out.println(g.isConnected(7, 6));
		System.out.print(g);
		LinkedList<edge> n = g.getLinkedNodes(7);
		for(edge i : n ) {
			System.out.println(i.v);
		}
	}
}

