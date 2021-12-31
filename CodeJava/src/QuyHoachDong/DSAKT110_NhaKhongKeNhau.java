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
public class DSAKT110_NhaKhongKeNhau {

    static int mod = (int) 1e9 + 7;
    static int a[];
    static int n;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- > 0) {
            n = in.nextInt();
            a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            in();
        }
    }

    static void in() {
        int i, j;
        int[] F = new int[100000];
        F[0] = a[0];
        F[1] = Math.max(a[0], a[1]);
        for (i = 2; i < n; i++) {
            F[i] = Math.max(F[i - 2] + a[i], F[i - 1]);
        }
        System.out.println(F[n - 1]);
    }
}
/*
2
6
5 5 10 100 10 5
4
3 2 7 10
Output
110
13
*/
