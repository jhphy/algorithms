package com.algorithms.graph;
import java.util.*;

public class CycleUndirectedGraph {
    public boolean hasCycleDFS(Graph graph) {
        Set<Integer> visited = new HashSet<>();
        for(Integer vertex: graph.getAllVertex()) {
            if (!dfs(graph,visited, vertex)) {
                return false;
            }
        }
        return true;
    }

    private boolean dfs(Graph graph, Set<Integer> visited, int vertex) {
        if(visited.contains(vertex)) {
            return false;
        }else{
            visited.add(vertex);
        }
        int len = map.containsKey(course)? map.get(course).size(): 0;
        for(int i = 0; i < len; i++){
            if(!dfs(map, visited, map.get(course).get(i))) {
                return false;
            }
        }
        visited.remove(vertex);
        return true;
    }

    public static void main(String[] args) {
        CycleUndirectedGraph cycle = new CycleUndirectedGraph();
        Graph graph = new Graph();
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(0, 3);
        graph.addEdge(3, 4);
        graph.addEdge(4, 5);
        graph.addEdge(5, 1);
        boolean isCycle = cycle.hasCycleDFS(graph);
    }


}
