//Breadth-first search properties

/* Proposition. BFS computes shortest paths (fewest number of edges)
from s to all other vertices in a graph in time proportional to E + V.
Pf. [correctness] Queue always consists of zero or more vertices of
distance k from s, followed by zero or more vertices of distance k + 1.
Pf. [running time] Each vertex connected to s is visited once.
*/

public class BreadthFirstPaths
{
    private boolean[] marked;
    private int[] edgeTo;
 …

 private void bfs(Graph G, int s)
 {
     Queue<Integer> q = new Queue<Integer>();
     q.enqueue(s);
     marked[s] = true;
     while (!q.isEmpty())
     {
         int v = q.dequeue();
         for (int w : G.adj(v))
         {
             if (!marked[w])
             {
                 q.enqueue(w);
                 marked[w] = true;
                 edgeTo[w] = v;
                }
            }
        }
    }
}

//APPLICATION OF BFS
routing : Fewest number of hops in a communication network.
Kevin Bacon numbers : Include one vertex for each performer and one for each movie.
                     ・Connect a movie to all performers that appear in that movie.
                     ・Compute shortest path from s = Kevin Bacon.