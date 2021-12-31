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
public class DSA05042_DayConLienTiepTongBangK {

    static int mod = (int) 1e9 + 7;
    static int[] a;
    static int n, k;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while (t-- > 0) {

            n = in.nextInt();
            a = new int[n];
            k = in.nextInt();
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            if (kiemtra(a, k) == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    static int kiemtra(int[] a, int k) {
        int i, j;
        int[] F = new int[100000];
        F[0] = 0;
        for (i = 1; i <= n; i++) {
            for (j = k; j >= a[i]; j--) {
                if (F[j] == 0 && F[j - a[i]] == 1) {
                    F[j] = 1;
                }
            }
        }
        return F[k];
    }
}
