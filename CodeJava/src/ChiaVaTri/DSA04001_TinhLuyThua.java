/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChiaVaTri;

import java.util.Scanner;

/**
 *
 * @author nhokt
 */
public class DSA04001_TinhLuyThua {

    static int mod = (int) 1e9 + 7;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            long n = in.nextLong();
            long k = in.nextLong();
            System.out.println(luythua(n, k));
        }
    }

    public static long luythua(long n, long k) {
        if (k == 0) {
            return 1;
        }
        long x = luythua(n, (k / 2));
        if (k % 2 == 0) {
            return x * x % mod;
        }
        return n * (x * x % mod) % mod;
    }
}
/*
2
2 3
4 2
OUTPUT
8
16
 */
