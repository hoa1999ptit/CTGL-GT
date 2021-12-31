/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuyHoachDong;

import java.util.Scanner;

/**
 *
 * @author nhokt
 */
public class DSA05027_CaiTui {

    static int c[][];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(), v = sc.nextInt();
            int a[] = new int[n + 1], b[] = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 1; i <= n; i++) {
                b[i] = sc.nextInt();
            }
            System.out.println(qhd(a, b, n, v));
        }
    }

    private static int qhd(int[] a, int[] b, int n, int v) {
        c = new int[n + 1][v + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= v; j++) {
                c[i][j] = c[i - 1][j];
                if (j >= a[i]) {
                    c[i][j] = Math.max(c[i][j], c[i - 1][j - a[i]] + b[i]);
                }
            }
        }
        return c[n][v];
    }
}
/*
1
15 10
5 2 1 3 5 2 5 8 9 6 3 1 4 7 8
1 2 3 5 1 2 5 8 7 4 1 2 3 2 1
OUTPUT
15

 */
