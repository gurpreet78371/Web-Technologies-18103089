package com.company;
import java.util.*;
import java.lang.*;
class Graph{
    static class edge {
        int src, dest, wt;
        edge() {
            src = dest = wt = 0;
        }
    }
    int V, E;
    edge edges[];
    Graph(int v, int e) {
        V = v;
        E = e;
        edges = new edge[e];
        for(int i=0;i<e;i++) {
            edges[i] = new edge();
        }
    }
    void ShortestPath(Graph graph, int src, int dest) {
        int V = graph.V;
        int E = graph.E;
        int dist[] = new int[V];

        for(int i=0;i<V;i++) {
            dist[i] = Integer.MAX_VALUE;
        }
        dist[src] = 0;
        for(int i=1;i<V;i++) {
            for(int j=0;j<E;j++) {
                int u = graph.edges[j].src;
                int v = graph.edges[j].dest;
                int wt = graph.edges[j].wt;
                if(dist[u]!=Integer.MAX_VALUE && dist[u]+wt<dist[v]) {
                    dist[v] = dist[u] + wt;
                }
            }
        }
        for(int j=0;j<E;j++) {
            int u = graph.edges[j].src;
            int v = graph.edges[j].dest;
            int wt = graph.edges[j].wt;
            if(dist[u]!=Integer.MAX_VALUE && dist[u]+wt<dist[v]) {
                System.out.println("Graph contains negative cycle");
                return;
            }
        }
        System.out.println("Vertex Distance from Source to destination is " + dist[dest]);
    }
    public static void main(String[] args) {
        int v, e;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of vertices");
        v = sc.nextInt();
        System.out.println("Enter number of edges");
        e = sc.nextInt();
        Graph graph = new Graph(v, e);
        for(int i=0;i<e;i++) {
            int src, dest, wt;
            System.out.println("Enter source, dest and weight of edge" + (i+1));
            src = sc.nextInt();
            dest = sc.nextInt();
            wt = sc.nextInt();
            graph.edges[i].src = src;
            graph.edges[i].dest = dest;
            graph.edges[i].wt = wt;
        }
        System.out.println("Enter two nodes in which you want to  check path");
        int src = sc.nextInt();
        int dest = sc.nextInt();
        graph.ShortestPath(graph, src, dest);
    }
}



