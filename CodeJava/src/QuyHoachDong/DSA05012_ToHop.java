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
public class DSA05012_ToHop {

    static int c[][];
    static int mod = (int) 1e9 + 7;

    public static void main(String[] args) {
        c = new int[1001][1001];
        for (int i = 0; i < 1001; i++) {
            for (int j = 0; j <= i; j++) {
                if (i == 0 || j == 0) {
                    c[i][j] = 1;
                } else {
                    c[i][j] = (c[i - 1][j] + c[i - 1][j - 1]) % mod;
                }
            }
        }
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            System.out.println(c[n][k]);
        }
    }
}
/*
2
5 2
10 3
OUTPUT
10
120
 */
