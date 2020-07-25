package dataStructure.graph.unWeightedGraph;

public class Edge {
    public int u;
    public int v;

    public Edge(int u, int v) {
        this.u = u;
        this.v = v;
    }

    public boolean equals(Object o){
        return u == ((Edge)o).u && v == ((Edge)o).v;
    }
    /*@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Edge edge = (Edge) o;
        return u == edge.u &&
                v == edge.v;
    }

    @Override
    public int hashCode() {
        return Objects.hash(u, v);
    }*/
}
