package com.mejiandres.app;

import org.junit.Test;

import com.mejiandres.app.Solution.Graph;

import static org.junit.Assert.assertEquals;

public class SolutionTest {
	
	@Test
	public void trivialTestCaseOneCelebrity1()
	{
		Graph g = new Graph(2);
		g.addEdge(0, 1);
		
		assertEquals(1, g.findCelebrity());
	}
	
	@Test
	public void trivialTestCaseOneCelebrity2()
	{
		Graph g = new Graph(2);
		g.addEdge(1, 0);
		
		assertEquals(0, g.findCelebrity());
	}
	
	@Test
	public void trivialCaseNoCelebrities1() {
		Graph g = new Graph(4);
		
		assertEquals(-1, g.findCelebrity());
	}
	
	@Test
	public void trivialCaseMoreThanOneCelebrity1() {
		Graph g = new Graph(3);
		
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 1);
		
		assertEquals(-1, g.findCelebrity());
	}
	
	@Test
	public void nonTrivialTestOneCelebrity1() {
		Graph g = new Graph(4);
		
		g.addEdge(0, 3);
		g.addEdge(0, 2);
		g.addEdge(0, 1);
		g.addEdge(1, 0);
		g.addEdge(1, 3);
		g.addEdge(2, 3);
		
		assertEquals(3, g.findCelebrity());
		
	}
	
	@Test
	public void nonTrivialTestMoreThanOneCelebrity1() {
		Graph g = new Graph(4);
		
		g.addEdge(0, 3);
		g.addEdge(0, 2);
		g.addEdge(0, 1);
		g.addEdge(1, 0);
		g.addEdge(1, 3);
		g.addEdge(2, 3);
		g.addEdge(1, 2);
		g.addEdge(3, 2);
		
		assertEquals(-1, g.findCelebrity());
		
	}

}
