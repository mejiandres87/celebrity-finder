package com.mejiandres.app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.mejiandres.app.Solution.Graph;

public class GraphTest {
	
	@Test
	public void shouldReturnAnEmptyGraph() {
		Graph g = new Graph(0);
		
		assertEquals(0, g.numVertex());
	}
	
	@Test
	public void shouldReturnNonEmptyGraph() {
		Graph g = new Graph(4);
		
		assertEquals(4, g.numVertex());
	}
	
	@Test
	public void shouldReturnZeroEdges() {
		Graph g = new Graph(3);
		
		assertEquals(0, g.numEdges());
	}
	
	@Test
	public void shouldReturnNonZeroEdges() {
		Graph g = new Graph(3);
		
		g.addEdge(1, 2);
		g.addEdge(0, 2);
		
		assertEquals(2, g.numEdges());
	}
	
	@Test
	public void shouldIgnoreNonExistentNodes() {
		Graph g = new Graph(3);
		
		g.addEdge(-1, 0);
		g.addEdge(3, 2);
		
		assertEquals(0, g.numEdges());
	}

}
