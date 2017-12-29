package com.algorithms.graph;

import java.util.*;

public class Graph<T> {
    private  List<Edge<T>> allEdges;
    public Map<Long, Vertex<T>> allVertex;
    boolean isDirected = false;

    public Graph(boolean isDirected) {
        allEdges = new ArrayList<Edge<T>>();
        allVertex = new HashMap<Long, Vertex<T>>();
        this.isDirected = isDirected;
    }

    public void addEdge(long id1, long id2) {
        addEdge(id1, id2, 0);
    }

    public void addEdge(long id1, long id2, int weight) {
        Vertex<T> vertex1 = null;
        if(allVertex.containsKey(id1)) {
            vertex1 = allVertex.get(id1);
        }else{
            vertex1 = new Vertex<T>(id1);
            allVertex.put(id1, vertex1);
        }

        Vertex<T> vertex2 = null;
        if(allVertex.containsKey(id2)) {
            vertex2 = allVertex.get(id2);
        }else{
            vertex2 = new Vertex<T>(id2);
            allVertex.put(id2, vertex2);
        }

        Edge<T> edge = new Edge<>(vertex1, vertex2, isDirected, weight);
        allEdges.add(edge);
        vertex1.addAdjacentVertex(edge, vertex2);
        if(!isDirected){
            vertex2.addAdjacentVertex(edge, vertex1);
        }
    }

    public List<Edge<T>> getAllEdges() {
        return allEdges;
    }

    public void setDataForVertex(long id, T data){
        if(allVertex.containsKey(id)){
            Vertex<T> vertex = allVertex.get(id);
            vertex.setData(data);
        }
    }

    public Collection<Vertex<T>> getAllVertex(){
        return allVertex.values();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

class Vertex<T> {
    long id;
    private T data;
    private List<Edge<T>> edges = new ArrayList<>();
    private List<Vertex<T>> adjacentVertex = new ArrayList<>();

    Vertex(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void addAdjacentVertex(Edge<T> e, Vertex<T> v) {
        edges.add(e);
        adjacentVertex.add(v);
    }

    public List<Vertex<T>> getAdjacentVertexes() {
        return adjacentVertex;
    }

    public List<Edge<T>> getEdges() {
        return edges;
    }

    public int getDegree() {
        return edges.size();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}

class Edge<T> {
    private boolean isDirected = false;
    private Vertex<T> vertex1;
    private Vertex<T> vertex2;
    private int weight;

    Edge(Vertex<T> vertex1, Vertex<T> vertex2) {
        this.vertex1 = vertex1;
        this.vertex2 = vertex2;
    }

    Edge(Vertex<T> vertex1, Vertex<T> vertex2, boolean isDirected, int weight) {
        this.vertex1 = vertex1;
        this.vertex2 = vertex2;
        this.isDirected = isDirected;
        this.weight = weight;
    }

    Edge(Vertex<T> vertex1, Vertex<T> vertex2, boolean isDirected) {
        this.vertex1 = vertex1;
        this.vertex2 = vertex2;
        this.isDirected = isDirected;
    }

    Edge(Vertex<T> vertex1, Vertex<T> vertex2, int weight) {
        this.vertex1 = vertex1;
        this.vertex2 = vertex2;
        this.weight = weight;
    }


    Vertex<T> getVertex1() {
        return vertex1;
    }

    Vertex<T> getVertex2() {
        return vertex2;
    }

    int getWeight() {
        return weight;
    }

    public boolean isDirected() {
        return isDirected;
    }


    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

}

