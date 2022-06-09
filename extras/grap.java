package extras;

import java.util.*;
import java.io.*;
import java.lang.*;

public class grap {

    private static LinkedList<Integer> adj[];

    // constructor
    public grap(int v) {
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<Integer>();
        }
    }

    public static void addEdge(int source, int destination) {
        adj[source].add(destination);
        adj[destination].add(source);
    }

    public static void bfs(int source, int destination) {
        Queue<Integer> q = new LinkedList<>();
        boolean visited[] = new boolean[adj.length];
        int parent[] = new int[adj.length];
        parent[source] = -1;
        q.add(source);
        while (!q.isEmpty()) {
            int curr = q.poll();
            visited[curr] = true;
            System.out.print(curr + " ");
            for (int neighbour : adj[curr]) {
                if (!visited[neighbour]) {
                    q.add(neighbour);
                    visited[neighbour] = true;
                    // addding the parent of the neighbours
                    // curr is the parent.
                    parent[neighbour] = curr;
                }
            }
        }

        int curr = destination;
        int dist = 0;
        System.out.println();
        while (parent[curr] != -1) {
            System.out.print(curr + " ");
            curr = parent[curr];
            dist++;
        }

        // yhan se yhan tak hai distance.
        System.out.println(curr);

        System.out.println(dist);
    }

    public static void dfs(int source, boolean visited[]) {
        visited[source] = true;
        System.out.print(source + " ");
        for (int neighbour : adj[source]) {
            if (!visited[neighbour]) {
                dfs(neighbour, visited);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int v = 5;
        int e = 6;

        grap g = new grap(v);

        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(0, 3);
        g.addEdge(3, 4);
        g.addEdge(0, 4);

        System.out.println("BFS results -------");
        g.bfs(0, 3);

        System.out.println("DFS results -------");

        g.dfs(0, new boolean[v]);

    }
}
