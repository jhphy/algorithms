package com.algorithms.graph;

import java.util.*;

public class Graph {
    public Map<Integer, List<Integer>> graph;

    public void addEdge(int from, int to) {
        if(!graph.containsKey(from)) {
            graph.put(from, new ArrayList<>());
        }
        graph.get(from).add(to);
    }

    public Set<Integer> getAllVertex() {
        return graph.keySet();
    }

}
