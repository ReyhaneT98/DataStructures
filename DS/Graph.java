package term3_37;

import java.util.*;

public class Graph {
	
	private int V;   
	 
    
    private LinkedList<Integer> adj[];
 
    
    Graph(int v)
    {
        V = v;
        adj = new LinkedList[v];
        for (int i=0; i<v; ++i)
            adj[i] = new LinkedList();
    }
 
    
    void addEdge(int v, int w)
    {
        adj[v].add(w);    
    }
 
    
    void DFSUtil(int v,boolean visited[])
    {
        
        visited[v] = true;
        System.out.print(v+" ");
 
        
        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext())
        {
            int n = i.next();
            if (!visited[n])
                DFSUtil(n,visited);
        }
    }
 
    
    void DFS()
    {
        
        boolean visited[] = new boolean[V];
 
        
        for (int i=0; i<V; ++i)
            if (visited[i] == false)
                DFSUtil(i, visited);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Graph g = new Graph(4);
		
		g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
 
        System.out.println("Following is Depth First Traversal");
 
        g.DFS();
    }
		

	}


