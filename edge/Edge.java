package src.edge;

import src.vertex.Vertex;

import java.util.Collection;
import java.util.List;
import java.util.Set;

public abstract class Edge {
    protected Collection<Vertex> vertices=null;
    private String label=null;
    private double weight=-1;

    public Edge(String label, double weight) {
        this.label = label;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public String getLabel() {
        return label;
    }

    abstract public boolean addVertices(List<Vertex> vertices);
    public boolean containVertex(Vertex v){
        if (vertices.contains(v)){
            return true;
        }
        return false;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    abstract Set<Vertex> sourceVertices();
    abstract Set<Vertex> targetVertices();
}