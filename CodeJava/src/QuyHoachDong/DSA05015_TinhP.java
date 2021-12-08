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
public class DSA05015_TinhP {// tính P(n,k)

    static int mod = (int) 1e9 + 7;
    int[][] c = new int[1005][1005];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            System.out.println(permutation(n, k));
        }
    }

    static long permutation(int n, int k) {
        long res = 1;
        for (int i = n; i >= n - k + 1; i--) {
            res = res * i % mod;
        }
        return res;
    }
}
/*
2
5 2
4 2
OUTPUT
20
12
 */
