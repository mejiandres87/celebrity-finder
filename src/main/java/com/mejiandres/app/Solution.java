package com.mejiandres.app;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static class Graph {
        
        
        public Graph(int size) {
            
        }

        public void addEdge(int first, int second) {
            
        }
        
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
    	// and then the program shall print it, if no node (person) fulfills the requirement -1
    	// should be printed
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
