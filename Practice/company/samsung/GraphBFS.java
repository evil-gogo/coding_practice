package samsung;

import java.util.*;

public class GraphBFS {
	private int noOfVertices;
	private LinkedList<Integer>[] adjacencyList;

	GraphBFS(int noOfVertices) {
		this.noOfVertices = noOfVertices;
		adjacencyList = new LinkedList[noOfVertices];
		for (int i = 0; i < noOfVertices; i++) {
			adjacencyList[i] = new LinkedList();
		}
	}

	void addEdge(int source, int destinition) {
		adjacencyList[source].add(destinition);
	}

	void BFS(int s)	{
		boolean visited[] = new boolean[noOfVertices];

		LinkedList<Integer> queue = new LinkedList<Integer>();

		visited[s] = true;
		queue.add(s);
		int n;
		while (queue.size() != 0) {
			s = queue.poll();
			System.out.print(s + " ");

			Iterator<Integer> i = adjacencyList[s].listIterator();
			while (i.hasNext()) {
				n = i.next();
				if (!visited[n]) {
					visited[n] = true;
					queue.add(n);
				}
			}
		}
	}

	public static void main(String args[]) {
		System.out.println("Java Program to Print BFS traversal from a given source vertex");
		int source = 2;
		GraphBFS graph = new GraphBFS(4);
		
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(1, 2);
		graph.addEdge(2, 0);
		graph.addEdge(2, 3);
		graph.addEdge(3, 3);

		System.out.println("Following is Breadth First Traversal starting from vertex " + source);

		graph.BFS(source);
	}
}