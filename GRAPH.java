//Addjacency-list graph representation: Java implementation
public class GRAPH                //adjacency lists ( using Bag data type )                                
{
    private final int V;
    private Bag<Integer>[] adj;  

    public GRAPH(int V){
        this.V = V;
        adj = (Bag<Integer>[]) new Bag[V]; //create empty graph with V vertices
        for (int v = 0; v < V; v++)
        adj[v] = new Bag<Integer>();
    }

    public void addEdge(int v, int W)
    {
        adj[v].add(w);                   //add edge V-w (parallel edges and self-loop allowed)
        adj[w].add(v);
    }

    public Iterable<Integer> adj(int v)  //iterator for vertices adjacent to v
    { return adj[v]; }
} 