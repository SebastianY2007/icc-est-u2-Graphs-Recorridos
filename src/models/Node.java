package models;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private int value;
    private List<Node> neighbors;

    public Node(int value){
        this.value = value;
        this.neighbors = new ArrayList<>(); 
    }

    public int getValue(){
        return value; 
    }

    public List<Node> getNeighbors(){
        return neighbors;
    }

    public void addNeighbor(Node neighbor){
        if (!this.neighbors.contains(neighbor)) {
            this.neighbors.add(neighbor);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node node = (Node) o;
        return value == node.value;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(value);
    }
}