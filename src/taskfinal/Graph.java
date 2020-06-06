/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taskfinal;

import java.util.*;

/**
 *
 * @author youss
 */
public class Graph {
    

    private int V;   // No. of vertices 
  
    // Array  of lists for vertices and edges Representation 
    private LinkedList<Integer> adj[]; 
  
    
    Graph(int v) 
    { 
        V = v; 
        adj = new LinkedList[v]; 
        for (int i=0; i<v; ++i) 
            adj[i] = new LinkedList(); 
    } 
  
    //Function to add an edge into the graph 
    void addEdge(int v, int w) 
    { 
        adj[v].add(w);   
    } 
  
  
  
     
   void DFS(int v,LinkedList Discovered) 
    { 
         
         Discovered.add(v);
        // iterates for all the vertices adjacent to this vertex 
        Iterator<Integer> E = adj[v].listIterator(); 
        while (E.hasNext()) 
        { 
            int n = E.next(); 
            if (!Discovered.contains(n)) 
                DFS(n,Discovered); 
        } 
  
       
    }
  
}