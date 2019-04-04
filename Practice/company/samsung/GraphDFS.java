package samsung;

import java.util.*;

public class GraphDFS {
	private int noOfVertices;
	private LinkedList<Integer>[] adjacencyList;

	GraphDFS(int noOfVertices) {
		this.noOfVertices = noOfVertices;
		adjacencyList = new LinkedList[noOfVertices];
		for (int i = 0; i < noOfVertices; i++) {
			adjacencyList[i] = new LinkedList();
		}
	}

	void addEdge(int source, int destinition) {
		adjacencyList[source].add(destinition);
	}

	void DFSUtil(int v, boolean visited[]) {
		// Mark the current node as visited and print it
		visited[v] = true;
		System.out.print(v + " ");
		
		int n;
		Iterator<Integer> i = adjacencyList[v].listIterator();
		while (i.hasNext()) {
			n = i.next();
			if (!visited[n]) {
				DFSUtil(n, visited);
			}
		}
	}

	void DFS(int source) {
		boolean visited[] = new boolean[noOfVertices];
		DFSUtil(source, visited);
	}
	
	public static void main(String args[]) {
		System.out.println("Java Program to Print DFS traversal from a given source vertex");
		int source = 2;
		GraphDFS graph = new GraphDFS(4);

		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(1, 2);
		graph.addEdge(2, 0);
		graph.addEdge(2, 3);
		graph.addEdge(3, 3);

		System.out.println("Following is Breadth First Traversal starting from vertex " + source);

		graph.DFS(source);
	}
}