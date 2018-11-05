package edu.bu.datastructures.graphs.algorithms;

import org.junit.Test;

import edu.bu.datastructures.graphs.AdjacencyListGraph;
import edu.bu.datastructures.graphs.Graph;

public class BFSTest {
	@Test
	public void testDoBFS() {
		Graph graph = new AdjacencyListGraph(9);
		graph.addEdge(1, 2, true);
		graph.addEdge(1, 3, true);
		graph.addEdge(2, 4, true);
		graph.addEdge(2, 5, true);
		graph.addEdge(3, 6, true);
		graph.addEdge(3, 7, true);
		graph.addEdge(6, 8, true);

		BFS bfs = new BFS();
		bfs.doBFS(graph, 1, 8);
	}

	@Test
	public void testDoBFSDirected() {
		Graph graph = new AdjacencyListGraph(9);
		graph.addEdge(1, 2, false);
		graph.addEdge(1, 3, false);
		graph.addEdge(3, 4, false);
		graph.addEdge(2, 4, false);
		graph.addEdge(3, 5, false);
		graph.addEdge(2, 6, false);

		BFS bfs = new BFS();
		//bfs.doBFS(graph, 1, 6);
	}
}
