//GRAPH API
public class Graph
             Graph(int V)         //create an empty graph with V vertices 

             Graph(In in)         //create a graph from input stream
 
        void addEdge(int v, int w)  //add an edge v-w

 Iterable<integer> adj(int v)      //vertices adjacent to v

                int V()           //number of vertices

                int E()           //number of edges

        String toString()          //string representation
        
        /* 
        In in = new In(args[0]);
        Graphs G = new Graph(in);   read graph from input stream

        for (int v = 0; v < G.V(); v++)
          for (int w : G>adj(v))         print out each edge(twice)
          stdOut.println(v + "-" + w); 
        */

        
public static int degree(Graph G, int v) //compute the degree of v
{
 int degree = 0;
 for (int w : G.adj(v)) degree++;
 return degree;
}

public static int maxDegree(Graph G) //compute maximum degree
{
 int max = 0;
 for (int v = 0; v < G.V(); v++)
 if (degree(G, v) > max)
 max = degree(G, v);
 return max;
}
public static double averageDegree(Graph G) //compute average degree
{ return 2.0 * G.E() / G.V(); }

public static int numberOfSelfLoops(Graph G) //count self-loops
{
 int count = 0;
 for (int v = 0; v < G.V(); v++)
 for (int w : G.adj(v))
 if (v == w) count++;
 return count/2; // each edge counted twice
}

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