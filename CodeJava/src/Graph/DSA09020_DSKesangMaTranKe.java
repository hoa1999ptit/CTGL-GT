/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graph;

import java.util.*;

/**
 *
 * @author nhokt
 */
public class DSA09020_DSKesangMaTranKe {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer>[] adjList = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            insert(adjList, a, b);
        }
        

    }

    public static void insert(ArrayList<Integer> adj[],
            int u, int v) {

        // Insert a vertex v to vertex u
        adj[u].add(v);
        return;
    }

    public static void in(int[][] adj, int V) {
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                System.out.print(adj[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int[][] convert(ArrayList<Integer> adjList[], int n) {
// Initialize a matrix
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j : adjList[i]) {
                matrix[i][j] = 1;
            }
        }
        return matrix;
    }
}
