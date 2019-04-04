package samsung;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class GraphTopologicalSort {
	private int noOfVertices;
	private LinkedList<Integer>[] adjacencyList;

	GraphTopologicalSort(int noOfVertices) {
		this.noOfVertices = noOfVertices;
		adjacencyList = new LinkedList[noOfVertices];
		for (int i = 0; i < noOfVertices; i++) {
			adjacencyList[i] = new LinkedList();
		}
	}

	void addEdge(int source, int destinition) {
		adjacencyList[source].add(destinition);
	}

	void topologicalSortUtil(int v, boolean visited[], Stack<Integer> stack) {
		visited[v] = true;
		int i;

		Iterator<Integer> it = adjacencyList[v].iterator();
		while (it.hasNext()) {
			i = it.next();
			if (!visited[i]) {
				topologicalSortUtil(i, visited, stack);
			}
		}
		stack.push(new Integer(v));
	}

	void topologicalSort() {
		Stack<Integer> stack = new Stack<Integer>();

		boolean visited[] = new boolean[noOfVertices];

		for (int i = 0; i < noOfVertices; i++) {
			visited[i] = false;
		}

		for (int i = 0; i < noOfVertices; i++) {
			if (visited[i] == false) {
				topologicalSortUtil(i, visited, stack); 
			}
		}

		while (!stack.isEmpty()) {
			System.out.print(stack.pop() + " "); 
		}
	}

	public static void main(String args[]) {
		System.out.println("A Java program to print topological sorting of a DAG");

		GraphTopologicalSort graph = new GraphTopologicalSort(6);

		graph.addEdge(5, 2);
		graph.addEdge(5, 0);
		graph.addEdge(4, 0);
		graph.addEdge(4, 1);
		graph.addEdge(2, 3);
		graph.addEdge(3, 1);
		
		System.out.println("Following is a Topological sort of the given graph");
		
		graph.topologicalSort();
	}
}