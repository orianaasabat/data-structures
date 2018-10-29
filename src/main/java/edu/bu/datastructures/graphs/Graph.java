package edu.bu.datastructures.graphs;

import java.util.List;

public interface Graph {
	public void addEdge(int source, int destination,boolean biDirectional);

	public List<Edge> getEdges(int node);

	int getNumberOfNodes();
}
