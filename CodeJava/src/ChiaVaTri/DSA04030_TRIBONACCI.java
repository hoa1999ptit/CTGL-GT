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
public class DSA04030_TRIBONACCI {

    public static int mod = (int) 1e15 + 7;
    public static long n;

    public static class Matrix {

        long[][] A = new long[5][5];

        public Matrix() {
            A[0][0] = 0;
            A[0][1] = 1;
            A[0][2] = 0;
            A[0][3] = 0;
            A[0][4] = 0;
            A[1][0] = 0;
            A[1][1] = 0;
            A[1][2] = 1;
            A[1][3] = 0;
            A[1][4] = 0;
            A[2][0] = 0;
            A[2][1] = 0;
            A[2][2] = 0;
            A[2][3] = 1;
            A[2][4] = 0;
            A[3][0] = 0;
            A[3][1] = 1;
            A[3][2] = 1;
            A[3][3] = 1;
            A[3][4] = 0;
            A[4][0] = 0;
            A[4][1] = 0;
            A[4][2] = 0;
            A[4][3] = 1;
            A[4][4] = 1;
        }
    }

    public static long mulmod(long a, long b) {
        if (b == 0) {
            return 0;
        }
        if (b == 1) {
            return a % mod;
        }
        long tmp = mulmod(a, b / 2);
        if (b % 2 == 0) {
            return (tmp + tmp) % mod;
        } else {
            return (((tmp + tmp) % mod) + a) % mod;
        }
    }

    public static Matrix multiply(Matrix a, Matrix b) {
        Matrix res = new Matrix();
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= 4; j++) {
                res.A[i][j] = 0;
                for (int k = 0; k <= 4; k++) {
                    res.A[i][j] = (res.A[i][j] + mulmod(a.A[i][j], b.A[i][j])) % mod;
                }
            }
        }
        return res;
    }

    public static Matrix power(Matrix a, long k) {
        if (k == 1) {
            return a;
        }
        Matrix x = power(a, k / 2);
        x = multiply(x, x);
        if (k % 2 == 1) {
            x = multiply(x, a);
        }
        return x;

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            n = in.nextLong();
            if (n == 1) {
                System.out.println("1");
            } else if (n == 2) {
                System.out.println("3");
            } else if (n == 3) {
                System.out.println("6");
            } else {
                Matrix a = new Matrix();
                a = power(a, n - 3);
                long[] b = {1, 2, 3, 6, 6};
                long[] c = new long[4];
                for (int i = 0; i <= 4; i++) {
                    long tmp = 0;
                    for (int j = 0; j <= 4; j++) {
                        tmp = (tmp + (a.A[i][j] * b[j]) % mod) % mod;

                    }
                    c[i] = tmp;

                }
                System.out.println(c[4]);
            }
        }
    }
}
