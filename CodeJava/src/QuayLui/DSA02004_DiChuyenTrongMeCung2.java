/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuayLui;

import java.util.*;

/**
 *
 * @author nhokt
 */
public class DSA02004_DiChuyenTrongMeCung2 {

    static Vector<String> possiblePaths = new Vector<>();
    static String path = "";
    static final int MAX = 5;

    static boolean isSafe(int row, int col, int m[][],
            int n, boolean visited[][]) {
        if (row == -1 || row == n || col == -1
                || col == n || visited[row][col]
                || m[row][col] == 0) {
            return false;
        }

        return true;
    }

    static void printPathUtil(int row, int col, int m[][],
            int n, boolean visited[][]) {

        // This will check the initial point
        // (i.e. (0, 0)) to start the paths.
        if (row == -1 || row == n || col == -1
                || col == n || visited[row][col]
                || m[row][col] == 0) {
            return;
        }

        // If reach the last cell (n-1, n-1)
        // then store the path and return
        if (row == n - 1 && col == n - 1) {
            possiblePaths.add(path);
            return;
        }

        // Mark the cell as visited
        visited[row][col] = true;

        // Try for all the 4 directions (down, left,
        // right, up) in the given order to get the
        // paths in lexicographical order
        // Check if downward move is valid
        if (isSafe(row + 1, col, m, n, visited)) {
            path += 'D';
            printPathUtil(row + 1, col, m, n,
                    visited);
            path = path.substring(0, path.length() - 1);
        }

        // Check if the left move is valid
        if (isSafe(row, col - 1, m, n, visited)) {
            path += 'L';
            printPathUtil(row, col - 1, m, n,
                    visited);
            path = path.substring(0, path.length() - 1);
        }

        // Check if the right move is valid
        if (isSafe(row, col + 1, m, n, visited)) {
            path += 'R';
            printPathUtil(row, col + 1, m, n,
                    visited);
            path = path.substring(0, path.length() - 1);
        }

        // Check if the upper move is valid
        if (isSafe(row - 1, col, m, n, visited)) {
            path += 'U';
            printPathUtil(row - 1, col, m, n,
                    visited);
            path = path.substring(0, path.length() - 1);
        }

        // Mark the cell as unvisited for
        // other possible paths
        visited[row][col] = false;
    }

    static void printPath(int m[][], int n) {
        boolean[][] visited = new boolean[n][MAX];

        // Call the utility function to
        // find the valid paths
        printPathUtil(0, 0, m, n, visited);

        // Print all possible paths
        for (int i = 0; i < possiblePaths.size(); i++) {
            System.out.print(possiblePaths.get(i) + " ");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();

            int[][] m = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    m[i][j] = in.nextInt();
                }
            }
            printPath(m, n);
            System.out.println();
        }

    }
}
/*
2
4
1  0  0  0 
1  1  0  1  
0  1  0  0  
1  1  1  1 
5 
1 0 0 0 0 
1 1 1 1 1 
1 1 0 0 1 
0 1 1 1 1 
0 0 0 1 1 
OUTPUT
DRDDRR
DDRDRRDR DDRDRRRD DRDDRRDR DRDDRRRD DRRRRDDD
 */
