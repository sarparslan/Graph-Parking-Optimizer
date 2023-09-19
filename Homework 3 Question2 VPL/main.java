
//-----------------------------------------------------
//Title: main class
//Author: Sarp ARSLAN - 11458145526 - Section03
//Burak SAĞLAM – 13760307838 - Section02
//Description: Main Class of the program
//-----------------------------------------------------

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter:");

        String[] firstLine = scan.nextLine().split(" ");
        int N = Integer.parseInt(firstLine[0]);//8
        int M = Integer.parseInt(firstLine[1]);//4

        EdgeWeightedDigraph graph = new EdgeWeightedDigraph(N + 1);
        for (int i = 0; i < M; i++) {
            String[] otherLines = scan.nextLine().split(" ");
            /*System.out.println();
            for(String a : otherLines) {
            	System.out.print(a+" ");
            }
            System.out.println("Length"+otherLines.length);*/
            int numVerticesInLine = Integer.parseInt(otherLines[0]);

          
          
            for (int j = 1; j <= numVerticesInLine; j++) {  // Start from index 1
                int fromVertex = Integer.parseInt(otherLines[j]);
                int toVertex;
                if(fromVertex==Integer.parseInt(otherLines[numVerticesInLine])) {
                	toVertex = Integer.parseInt(otherLines[1]);
                }
                else {
                	toVertex = Integer.parseInt(otherLines[j+1]); //Connecting last station to first station
                }
                
                int weight = 1; // Travel time between each station is 1
               // System.out.println("\nFrom=> "+fromVertex+" To=> "+toVertex);
                if (fromVertex == 1) {
                    // Calculate the time it would take for this bus to come back to station 1
                    weight += (j - 1);
                }
                else if(numVerticesInLine==2) {
                	weight = 2;
                }
              
               
              
                //System.out.print(" Weight:"+weight);


                DirectedEdge edge = new DirectedEdge(fromVertex,toVertex,weight);

//                System.out.println();
//                System.out.println("From Vertex : "+fromVertex);
//                System.out.println("To Vertex :"+toVertex);
//                System.out.println("Edge : "+edge);
                
                graph.addEdge(edge);
              
                
            }
        }
        	//System.out.println(graph.toString());
        
        
        DijkstraSP sp = new DijkstraSP(graph, 1);

        StringBuilder output = new StringBuilder();
        // Calculate the minimum time needed to reach each station
        for (int t = 2; t <= N; t++) {
            if (sp.hasPathTo(t)) {
                output.append((int) sp.distTo(t)).append(" ");
            } else {
                output.append("-1 ");
            }
        }

        System.out.println(output.toString().trim());

        scan.close();
    }
}




//8 4
//2 5 4
//3 6 1 2
//4 4 2 1 3
//2 7 8
