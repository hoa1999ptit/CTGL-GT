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

    static int n;
    static int[][] matrix = new int[100][100];
    static boolean[][] check = new boolean[100][100];
    static ArrayList<String> result = new ArrayList<>();

    static void solve(int i, int j, String str) {
        if (matrix[1][1] == 0 || matrix[n][n] == 0) {
            return;
        }
        if (i == n & j == n) {
            result.add(str);
        }
        if (matrix[i + 1][j] == 1 && i != n && !check[i + 1][j]) {
            check[i][j] = true;
            solve(i + 1, j, str + "D");
            check[i][j] = false;
        }
        if (matrix[i][j + 1] == 1 && j != n && !check[i][j + 1]) {
            check[i][j] = true;
            solve(i, j + 1, str + "R");
            check[i][j] = false;
        }
        if (matrix[i - 1][j] == 1 && i != 1 && !check[i - 1][j]) {
            check[i][j] = true;
            solve(i - 1, j, str + "U");
            check[i][j] = false;
        }
        if (matrix[i][j - 1] == 1 && j != 1 && !check[i][j - 1]) {
            check[i][j] = true;
            solve(i, j - 1, str + "L");
            check[i][j] = false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            result.clear();
            n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    matrix[i][j] = sc.nextInt();
                    check[i][j] = false;
                }
            }
            solve(1, 1, "");
            if (result.size() == 0) {
                System.out.print(-1);
            } else {
                Collections.sort(result);
                for (int i = 0; i < result.size(); i++) {
                    System.out.print(result.get(i) + " ");
                }
            }
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
