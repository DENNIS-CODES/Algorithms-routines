//Depth-first search
//Idea. Mimic maze exploration.
public class Path {
    path(Graph G, int s)  //find paths in G from source s

    boolean hasPathTo(int v) //is there a path from s to v?

    Iterable<Integer> pathTo(int v) //path from s to v; null if no such path
}


/* 
 Paths paths = new Paths(G, s);
 for (int v = 0; v < G.V(); v++) //print all vertices connected to s 
 if (paths.hasPathTo(v))
 StdOut.println(v);

 */

/*Algorithm.
・Use recursion (ball of string).
・Mark each visited vertex (and keep track of edge taken to visit it).
・Return (retrace steps) when no unvisited options.
Data structures.
・ boolean[] marked to mark visited vertices.
・ int[] edgeTo to keep tree of paths.
(edgeTo[w] == v) means that edge v-w taken to visit w for first time*/

public class DepthFirstPaths
{
 private boolean[] marked;    //marked[v] = true if v connected to s
 private int[] edgeTo;        //edgeTo[v] = previous vertex on path from s to v
 private int s;

 public DepthFirstPaths(Graph G, int s)
 {
 ...                            //initialize data structures
 dfs(G, s);                     //find vertices connected to s
 }

 private void dfs(Graph G, int v)   //recursive DFS does the work
 {
 marked[v] = true;
 for (int w : G.adj(v))
 if (!marked[w])
 {
 dfs(G, w);
 edgeTo[w] = v;
 }
 }
}