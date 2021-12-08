/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuyHoachDong;

import java.util.*;

/**
 *
 * @author nhokt
 */
public class DSA05005_SoBuocItNhat {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t, n;
        int[] a = new int[1001];
        t = in.nextInt();
        while (t-- > 0) {
            n = in.nextInt();
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            System.out.println(quyhoachdong(a, n));
        }
    }

    static int quyhoachdong(int arr[], int n) {
        int i, j, res = 0;
        int[] F = new int[1005];
        for (i = 0; i < n; i++) {
            F[i] = 1;
            for (j = 0; j < i; j++) {
                if (arr[j] <= arr[i]) {
                    F[i] = Math.max(F[i], F[j] + 1);
                }
            }
            res = Math.max(res, F[i]);
        }
        return n - res;
    }
}
/*

Input
1
7
2 3 5 1 4 7 6
OUTPUT
3

 */
