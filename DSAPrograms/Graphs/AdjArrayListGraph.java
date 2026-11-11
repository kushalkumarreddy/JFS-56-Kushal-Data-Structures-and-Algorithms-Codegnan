package DSAPrograms.Graphs;

import java.util.*;

public class AdjArrayListGraph {

    HashMap<Integer, ArrayList<Integer>> map;

    public Graph() {

        map = new HashMap<>();

    }

    // Add vertex
    public void addVertex(int v) {

        map.putIfAbsent(v, new ArrayList<>());

    }

    // Add edge
    public void addEdge(int source, int destination) {

        addVertex(source);

        addVertex(destination);

        map.get(source).add(destination);

        map.get(destination).add(source);

    }

    // Get source
    public Set<Integer> getSource() {

        return map.keySet();

    }

    // Get destination
    public ArrayList<Integer> getDestination(int source) {

        return map.get(source);

    }

    // Display graph
    public void display() {

        for(int source : map.keySet()) {

            System.out.println(source + " -> " + map.get(source));

        }

    }

    public static void main(String[] args) {

        Graph g = new Graph();

        g.addEdge(0, 1);

        g.addEdge(0, 2);

        g.addEdge(1, 3);

        g.addEdge(2, 3);

        g.addEdge(2, 4);

        System.out.println("Graph:");

        g.display();

        System.out.println("\nSource Vertices:");

        System.out.println(g.getSource());

        System.out.println("\nDestination of Source 2:");

        System.out.println(g.getDestination(2));

    }

}
