package edu.bu.datastructures.graphs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AdjacencyListGraph implements Graph {
	List<Edge>[] nodes;

	public AdjacencyListGraph(int numberOfNodes) {
		nodes = new List[numberOfNodes];
	}

	public void addEdge(int source, int destination, boolean biDirectional) {
		if (nodes[source] == null)
			nodes[source] = new ArrayList<>();
		nodes[source].add(new Edge(destination));
		if (biDirectional) {
			if (nodes[destination] == null)
				nodes[destination] = new ArrayList<>();
			nodes[destination].add(new Edge(source));
		}
	}

	public List<Edge> getEdges(int node) {
		return nodes[node] == null ? Collections.emptyList() : nodes[node];

	}

	@Override
	public int getNumberOfNodes() {
		return nodes.length;
	}
}
