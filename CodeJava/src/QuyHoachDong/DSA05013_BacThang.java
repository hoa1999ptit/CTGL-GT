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
public class DSA05013_BacThang {

    static int mod = (int) 1e9 + 7;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int k = in.nextInt();
            System.out.println(quyhoachdong(n, k));
        }
    }

    static int quyhoachdong(int n, int k) {
        int[] F = new int[n + 1];
        int i, j;
        
        F[0] = 1;
        F[1] = 1;
        for (i = 2; i <= n; i++) {
            for (j = 1; j <= Math.min(i, k); j++) {
                F[i] = (F[i] + F[i - j]) % mod;
            }
        }
        return F[n];
    }
}
/*
Input
2
2 2
4 2
Output
2
5
 */
