package com.mejiandres.app;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


/**
 * Implementation of a class that models the problem <code>find the celebrity </code>
 * Structure for the problem model and solution was taken from:
 * https://www.hackerrank.com/challenges/ctci-bfs-shortest-reach/problem
 * 
 *  @author Andrés Felipe Mejía
 *
 */
public class Solution {
	
	/**
	 * Class that models a group of people and the relationships between them in terms of
	 * a knows b as a Graph implemented as a List of adjacency. Every node a in the graph
	 * will have a list of people they know
	 * @author Andrés Felipe Mejía
	 *
	 */
    public static class Graph {
    	
    	LinkedList<Integer> graph[];
        
        /**
         * Construct the graph with the number of people on the group
         * @param size
         */
        public Graph(int size) {
            graph = new LinkedList[size];
            for(int i=0 ; i<size; i++) {
            	graph[i] = new LinkedList<Integer>();
            }
        }

        /**
         * Adds a relationship between nodes (people) in the form
         * first knows second
         * @param first
         * @param second
         */
        public void addEdge(int first, int second) {
            if(first < graph.length && first >= 0) {
            	graph[first].add(second);
            }
        }
        
        /**
         * Returns the number of nodes (people) in the graph
         * @return total number of nodes
         */
        public int numVertex() {
        	return graph == null ? 0 : graph.length;
        }
        
        /**
         * Returns the total number of relationships on the group
         * @return total number of edges
         */
        public int numEdges() {
        	if(graph == null) return 0;
        	int edges = 0;
        	for(LinkedList<Integer> list: graph) {
        		edges += list.size();
        	}
        	return edges;
        }
        
        /**
         * Finds the unique index of the node that fulfills the condition u is known by
         * everybody, meaning u is in everyone else's list, and u's list is empty
         * 
         * @return the index of the node that complies the requirement of celebrity
         */
        public int findCelebrity() { 
            return -1;
        }
    }
    
    public static void main(String[] args) {
    	// This program will read an input in the next format:
    	// first there will be an integer t, representing the number of tests to do
    	// for the next t sets there will be two integers: n and m
    	// n representing the number of nodes (people) in the group, they will be numbered
    	// from 0 to n-1
    	// m representing a number of relationships between people on that group
    	// for the following m lines there will be a pair of integers u v that represent 
    	// a relationship between those two people in the form u knows v
    	// After reading the input the program will ask the Graph class to find the celebrity c
    	// among the group which complies with the condition (everybody knows c and c knows nobody)
    	// and then the program shall print it, if no node (person) or more than one fulfills the 
    	// requirement -1 should be printed
        Scanner scanner = new Scanner(System.in);
      
        int queries = scanner.nextInt();
        
        for (int t = 0; t < queries; t++) {
            
            // reads the total number of people
            Graph graph = new Graph(scanner.nextInt());
            int m = scanner.nextInt();
            
            // read and set edges
            for (int i = 0; i < m; i++) {
                int u = scanner.nextInt() - 1;
                int v = scanner.nextInt() - 1;
                
                // add each edge to the graph
                graph.addEdge(u, v);
            }
            
            // finds the celebrity
            int c = graph.findCelebrity();
            
            // prints the celebrity node
            System.out.println(c);
                       
        }
        
        scanner.close();
    }
}
