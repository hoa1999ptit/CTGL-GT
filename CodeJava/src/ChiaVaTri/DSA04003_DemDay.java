/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChiaVaTri;

import java.util.*;

/**
 *
 * @author nhokt
 */
public class DSA04003_DemDay {
    
    static int mod = 123456789;
// có 2^(n-1)*n

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            final long n = in.nextLong();
            System.out.println(demday(2, n - 1));
        }
    }
    
    public static long demday(final long n, final long k) {
        if (k == 0) {
            return 1;
        }
        long x = demday(n, (k / 2));
        if (k % 2 == 0) {
            return x * x % mod;
        }
        return n * (x * x % mod) % mod;
    }
    
}
