/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuayLui;

import java.util.Scanner;

/**
 *
 * @author nhokt
 */
public class DSA02001_DaySo1 {

    static int N;
    static int[][] F;
    static int A[];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            N = in.nextInt();
            F = new int[N + 10][N + 10];
            for (int i = 1; i <= N; i++) {
                F[1][i] = in.nextInt();
            }
            quaylui(F, N);
        }
    }

    static void quaylui(int[][] a, int n) {
        int row = n - 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= row; j++) {
                a[i][j] = a[i - 1][j] + a[i - 1][j + 1];
            }
            row--;
        }
        row = n;
        for (int k = 1; k <= n; k++) {
            System.out.print("[");
            for (int l = 1; l < row; l++) {
                System.out.print(a[k][l] + " ");
            }
            System.out.print(a[k][row] + "]");
            row--;
            System.out.println();
        }
    }

}
