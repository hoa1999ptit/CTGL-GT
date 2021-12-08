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
public class DSA04002_LuyThuaDao {

    static int mod = (int) 1e9 + 7;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            long n = in.nextLong();
            // System.out.println(dao(n));
            System.out.println(luythuadao(n, dao(n)));
        }
    }

    public static long luythuadao(long n, long k) {
        if (k == 0) {
            return 1;
        }
        long x = luythuadao(n, (k / 2));
        if (k % 2 == 0) {
            return x * x % mod;
        }
        return n * (x * x % mod) % mod;
    }

    public static long dao(long n) {
        long inverse_num = 0;
        while (n > 0) {
            inverse_num = n % 10 + inverse_num * 10;
            n = n / 10;
        }
        return inverse_num;
    }
}
