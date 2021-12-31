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
public class DSA04006_DemSoBit1 {

    static long N, L, R;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            N = in.nextLong();
            L = in.nextLong();
            R = in.nextLong();
            long a = doDai(N);
            System.out.println(demSoBit1(N, 1, a));
        }
    }

    static long doDai(long n) { //  do dai day sau khi bien doi N thanh` { [N/2] , n%2 , [N/2] }
        if (n == 0 || n == 1) {
            return 1;
        }
        long tmp = doDai(n / 2);
        return 2 * tmp + 1;
    }

    static long demSoBit1(long n, long l, long r) {
        if (l > R || r < L) {
            return 0;
        }
        if (L <= l && r <= R) {
            return n;
        }
        long mid = (l + r) / 2;
        if (mid >= L && mid <= R) {
            return demSoBit1(n / 2, l, mid - 1) + demSoBit1(n / 2, mid + 1, r) + n % 2;
        }
        return demSoBit1(n / 2, l, mid - 1) + demSoBit1(n / 2, mid + 1, r);
    }
}
