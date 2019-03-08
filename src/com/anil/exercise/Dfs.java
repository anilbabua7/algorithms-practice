package com.anil.exercise;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Dfs {

	private List<Integer>[] adj;
	int V;
	public Dfs(int V) {
		this.V = V;
		this.adj = new LinkedList[V];
		for(int i=0 ; i<V ; i++) {
			adj[i] = new LinkedList<Integer>();
		}
	}
	
	public void addEdge(int u, int v) {
		adj[u].add(v);
	}
	
	public void dfsUtil(int v, boolean[] visited) {
		
		visited[v] = true;
		System.out.print(v+"  ");
		Iterator<Integer> it = adj[v].iterator();
		
		while(it.hasNext()) {
			int next = it.next();
			if(!visited[next]) {
				dfsUtil(next, visited);
			}
		}
	}
	
	public void dfs() {
		boolean visited[] = new boolean[V];
		dfsUtil(2, visited);
	}
	
	public static void main(String[] args) {
		int V = 4;
		Dfs graph = new Dfs(V);
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(2, 0);
		graph.addEdge(2, 3);
		graph.dfs();
	}

}
