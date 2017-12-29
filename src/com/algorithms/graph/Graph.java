package com.algorithms.graph;

import java.util.*;

public class Graph<E> {
    private  List<Edge<E>> allEdges;
    public Map<Long, Vertex<E>> allVertex;
    boolean isDirected = false;

    public Graph(boolean isDirected) {
        allEdges = new ArrayList<Edge<E>>();
        allVertex = new HashMap<Long, Vertex<E>>();
        this.isDirected = isDirected;
    }

    public void addEdge(long id1, long id2) {
        addEdge(id1, id2, 0);
    }

    public void addEdge(long id1, long id2, int weight) {
        Vertex<E> vertex1 = null;
        if(allVertex.containsKey(id1)) {
            vertex1 = allVertex.get(id1);
        }else{
            vertex1 = new Vertex<>(E)(id1);
            allVertex.put(id1, vertex1);
        }

        Vertex<E> vertex2 = null;
        if(allVertex.containsKey(id2)) {
            vertex2 = allVertex.get(id2);
        }else{
            vertex2 = new Vertex<>(E)(id2);
            allVertex.put(id2, vertex2);
        }

        Edge<E> edge = new Edge<>(vertex1, vertex2, isDirected, weight);
        allEdges.add(edge);
        vertex1.addAdjacentVertex(edge, vertex2);
        if(!isDirected){
            vertex2.addAdjacentVertex(edge, vertex1);
        }
    }

    public List<Edge<E>> getAllEdges() {
        return allEdges;
    }

    public void setDataForVertex(long id, E data){
        if(allVertex.containsKey(id)){
            Vertex<E> vertex = allVertex.get(id);
            vertex.setData(data);
        }
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

class Vertex<E> {
    long id;
    private E data;
    private List<Edge<E>> edges = new ArrayList<>();
    private List<Vertex<E>> adjacentVertex = new ArrayList<>();

    Vertex(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setData(E data) {
        this.data = data;
    }

    public E getData() {
        return data;
    }

    public void addAdjacentVertex(Edge<E> e, Vertex<E> v) {
        edges.add(e);
        adjacentVertex.add(v);
    }

    public List<Vertex<E>> getAdjacentVertex() {
        return adjacentVertex;
    }

    public List<Edge<E>> getEdges() {
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

class Edge<E> {
    private boolean isDirected = false;
    private Vertex<E> vertex1;
    private Vertex<E> vertex2;
    private int weight;

    Edge(Vertex<E> vertex1, Vertex<E> vertex2) {
        this.vertex1 = vertex1;
        this.vertex2 = vertex2;
    }

    Edge(Vertex<E> vertex1, Vertex<E> vertex2, boolean isDirected, int weight) {
        this.vertex1 = vertex1;
        this.vertex2 = vertex2;
        this.isDirected = isDirected;
        this.weight = weight;
    }

    Edge(Vertex<E> vertex1, Vertex<E> vertex2, boolean isDirected) {
        this.vertex1 = vertex1;
        this.vertex2 = vertex2;
        this.isDirected = isDirected;
    }

    Edge(Vertex<E> vertex1, Vertex<E> vertex2, int weight) {
        this.vertex1 = vertex1;
        this.vertex2 = vertex2;
        this.weight = weight;
    }


    Vertex<E> getVertex1() {
        return vertex1;
    }

    Vertex<E> getVertex2() {
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

