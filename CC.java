//connected components Def. A connected component is a maximal set of connected vertices.

/* Def. Vertices v and w are connected if there is a path between them.
Goal. Preprocess graph to answer queries of the form is v connected to w?
in constant time.
*/

/* Connected Components
Initialize all vertices v as unmarked.
For each unmarked vertex v, run DFS to identify all
vertices discovered as part of the same component.
*/

public class CC
        CC(Graph G)   //find connected components in G

   boolean connected(int v, int w)  //are v and w connected?

       int count()                   //number of connected components

       int id(int v)                 //component identifier for v


       public class CC
       {
           private boolean[] marked;

           private int[] id;           //id[v] = id of component containing v

           private int count;         //number of components

           public CC(Graph G)
           {
               marked = new boolean[G.V()];
               id = new int[G.V()];
               for (int v = 0; v < G.V(); v++)
               {
                   if (!marked[v])
                   {
                       dfs(G, v);                  //run DFS from one vertex in
                       each component
                       count++;
                     }
                }
            }
            public int count()        //number of components
            { return count; }

            public int id(int v)      //id of component containing v
            { return id[v]; }

            private void dfs(Graph G, int v)       //all vertices discovered in same call of dfs have same id
            {
                marked[v] = true;
                id[v] = count;
                for (int w : G.adj(v))
                   if (!marked[w])
                      dfs(G, w);
            }
