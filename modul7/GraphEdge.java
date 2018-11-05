package modul7;

import java.util.ArrayList;

public class GraphEdge {
    GraphNode src;
    GraphNode dst;
    double distance;
    
    public GraphEdge(GraphNode src, GraphNode dst, double distance){
        this.src = src;
        this.dst = dst;
        this.distance = distance;
    }
}
