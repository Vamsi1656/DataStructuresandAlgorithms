package com.java;

import java.util.*;

class Graph {
    private Map<String, Node> vertices;

    public Graph() {
        this.vertices = new HashMap<>();
    }

    public void addVertex(String name) {
        vertices.put(name, new Node(name));
    }

    public void addEdge(String source, String destination, int distance) {
        Node sourceNode = vertices.get(source);
        Node destinationNode = vertices.get(destination);
        sourceNode.addEdge(new Edge(destinationNode, distance));
    }

    public Map<String, Node> getVertices() {
        return vertices;
    }
}

class Node {
    private String name;
    private List<Edge> edges;
    private int heuristic; 
    private int distance;  
    private int cost;      
    private Node parent;   
    public Node(String name) {
        this.name = name;
        this.edges = new ArrayList<>();
    }

    public void addEdge(Edge edge) {
        edges.add(edge);
    }

    public String getName() {
        return name;
    }

    public List<Edge> getEdges() {
        return edges;
    }

    public int getHeuristic() {
        return heuristic;
    }

    public void setHeuristic(int heuristic) {
        this.heuristic = heuristic;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }
}

class Edge {
    private Node destination;
    private int distance;

    public Edge(Node destination, int distance) {
        this.destination = destination;
        this.distance = distance;
    }

    public Node getDestination() {
        return destination;
    }

    public int getDistance() {
        return distance;
    }
}

public class ShortestPath {
    public static void main(String[] args) {
       
        Graph graph = new Graph();

      
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");

       
        graph.addEdge("A", "B", 3);
        graph.addEdge("B", "C", 5);
        graph.addEdge("C", "D", 7);
        graph.addEdge("D", "A", 3);
        graph.addEdge("D", "E", 10);

       
        String source = "A";
        String destination = "E";

        
        PriorityQueue<Node> openSet = new PriorityQueue<>(Comparator.comparingInt(Node::getCost));
        Set<Node> closedSet = new HashSet<>();

     
        Node startNode = graph.getVertices().get(source);
        Node goalNode = graph.getVertices().get(destination);

        startNode.setDistance(0);
        startNode.setHeuristic(manhattanDistance(startNode, goalNode));
        startNode.setCost(startNode.getDistance() + startNode.getHeuristic());

        openSet.add(startNode);

        while (!openSet.isEmpty()) {
            Node current = openSet.poll();

            if (current == goalNode) {
              
                List<Node> path = reconstructPath(current);
                int cost = current.getCost();

                System.out.print("Path: ");
                for (Node node : path) {
                    System.out.print(node.getName() + " -> ");
                }
                System.out.println("\nCost: " + cost);

                return;
            }

            closedSet.add(current);

            for (Edge edge : current.getEdges()) {
                Node neighbor = edge.getDestination();

                if (closedSet.contains(neighbor)) {
                    continue; 
                }

                int newDistance = current.getDistance() + edge.getDistance();

                if (!openSet.contains(neighbor) || newDistance < neighbor.getDistance()) {
                    neighbor.setDistance(newDistance);
                    neighbor.setHeuristic(manhattanDistance(neighbor, goalNode));
                    neighbor.setCost(newDistance + neighbor.getHeuristic());
                    neighbor.setParent(current);

                    if (!openSet.contains(neighbor)) {
                        openSet.add(neighbor);
                    }
                }
            }
        }

        System.out.println("No path found");
    }

    private static int manhattanDistance(Node node1, Node node2) {
        
        return Math.abs(node1.getHeuristic() - node2.getHeuristic());
    }

    private static List<Node> reconstructPath(Node node) {
        List<Node> path = new ArrayList<>();
        while (node != null) {
            path.add(node);
            node = node.getParent();
        }
        Collections.reverse(path);
        return path;
    }
}
