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
public class DSA04004_GapDoiDaySo {

    static long k;
    static int n;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            n = in.nextInt();
            k = in.nextLong();
            System.out.println(xuly(n, k));
        }
    }

    static int xuly(int n, final long k) {
        long x = (long) Math.pow(2, n - 1);
        if (k == x) {
            return n;
        }
        if (k < x) {
            return xuly(n - 1, k);

        }
        return xuly(n - 1, k - x);
    }
}
/*
2
3 2
4 8
OUTPUT
2
4
*/