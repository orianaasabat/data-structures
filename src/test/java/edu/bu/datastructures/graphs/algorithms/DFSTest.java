package edu.bu.datastructures.graphs.algorithms;

import org.junit.Test;

import edu.bu.datastructures.graphs.AdjacencyListGraph;
import edu.bu.datastructures.graphs.Graph;

public class DFSTest {
	@Test
	public void testDoDFS() {
		Graph graph = new AdjacencyListGraph(9);
		graph.addEdge(1, 2, true);
		graph.addEdge(1, 3, true);
		graph.addEdge(2, 4, true);
		graph.addEdge(2, 5, true);
		graph.addEdge(3, 6, true);
		graph.addEdge(3, 7, true);
		graph.addEdge(6, 8, true);

		DFS dfs = new DFS();
		dfs.doDFS(graph, 1, 8);
	}

	@Test
	public void testDoDFSDirected() {
		Graph graph = new AdjacencyListGraph(9);
		graph.addEdge(1, 2, false);
		graph.addEdge(1, 3, false);
		graph.addEdge(3, 4, false);
		graph.addEdge(2, 4, false);
		graph.addEdge(3, 5, false);
		graph.addEdge(2, 6, false);

		DFS dfs = new DFS();
		 dfs.doDFS(graph, 6, 1);
	}
}
