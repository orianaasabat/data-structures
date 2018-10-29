package edu.bu.datastructures.graphs;

import java.util.ArrayList;
import java.util.List;

public class Node {
	List<Edge> edges;
	int nodeId;

	public void addEdge(Edge e) {
		if (edges == null)
			edges = new ArrayList<>();
		edges.add(e);
	}
}
