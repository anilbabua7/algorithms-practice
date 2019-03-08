package com.anil.exercise;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Bfs {
	
	private List<Integer>[] adj;
	int V;
	public Bfs(int V) {
		this.V = V;
		this.adj = new LinkedList[V];
		for(int i=0 ; i<V ; i++) {
			adj[i] = new LinkedList<Integer>();
		}
	}
	
	public void addEdge(int u, int v) {
		adj[u].add(v);
	}
	
	public void bfs(int s) {
		Queue<Integer> q = new LinkedList<Integer>();
		boolean[] visited = new boolean[V];
		visited[0] = true;
		q.add(s);
		while(!q.isEmpty()) {
			int temp = q.poll();
			System.out.print(temp+"  ");
			Iterator<Integer> it = adj[temp].iterator();
			while(it.hasNext()) {
				int next = it.next();
				if(!visited[next]) {
					q.add(next);
					visited[next] = true;
				}
			}
		}
	}

	public static void main(String[] args) {
		int V = 4;
		Bfs graph = new Bfs(V);
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(2, 0);
		graph.addEdge(2, 3);
		graph.addEdge(3, 3);
		
		graph.bfs(0);

	}

}
