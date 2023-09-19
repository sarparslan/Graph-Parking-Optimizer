
//-----------------------------------------------------
//Title: Q1 class
//Author: Sarp ARSLAN - 11458145526 - Section03
//Burak SAĞLAM – 13760307838 - Section02
//Description: Main Class of the program
//-----------------------------------------------------

import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int M = scan.nextInt();
        int F = scan.nextInt();

        int[] capacity = new int[N+1];
        for(int i=1; i<=N; i++) {
            capacity[i] = scan.nextInt();
        }

        EdgeWeightedDigraph graph = new EdgeWeightedDigraph(N+1);
        for(int i=0; i<M; i++) {
            int u = scan.nextInt();
            int v = scan.nextInt();
            int w = scan.nextInt();
            graph.addEdge(new DirectedEdge(u, v, w));
        }

        int K = scan.nextInt();
        int[] parkedCars = new int[N+1]; // Tracks the number of parked cars at each slot
        DijkstraSP shortestPath = new DijkstraSP(graph, 1);

        for(int k=1; k<=K; k++) {
            int minCost = Integer.MAX_VALUE;
            int bestSlot = -1;

            // Find the parking slot with the smallest total cost where there is still space left
            for(int i=1; i<=N; i++) {
                if(parkedCars[i] < capacity[i]) {
                    int pathCost = (int) shortestPath.distTo(i);
                    int totalCost = pathCost + F;
                    if(totalCost < minCost) {
                        minCost = totalCost;
                        bestSlot = i;
                    }
                }
            }

            if(bestSlot == -1) {
                System.out.println("-1");
            } else {
                parkedCars[bestSlot]++;
                System.out.println(minCost);
            }
        }

        scan.close();
    }
}
