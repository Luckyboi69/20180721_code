/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taskfinal;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author youss
 */
public class TaskFinal {

    
    public static void main(String[] args) {
       
     Scanner Scan = new Scanner(System.in);
     System.out.println("Enter Number of Guests");
     int V=Scan.nextInt();
     Graph G= new Graph(V);
     
     
     for(int i=0;i<V;i++){
     char confirm ='A';
     switch(confirm){
         case 'A':
         System.out.println("Please Enter The Guest Number Which Guest Number "+i+" Knows");
         int k=Scan.nextInt();
         G.addEdge(i, k);
         System.out.println("Does Guest Number " + i + " Knows Any Other Guests? Enter 0 for NO or 1 for Yes");
         int more=Scan.nextInt();
         if(more==1){
         i--;
         }
     }
     
     
     }  

     LinkedList discovered = new LinkedList(); 
     int t=0;
     
     for (int i=0;i<V;i++){
     if (!discovered.contains(i)){
      t=t+1;
     G.DFS(i,discovered);
     
     }
    
     }
     System.out.println("Tables Required Are " +t );
    
    
    }
    
}
