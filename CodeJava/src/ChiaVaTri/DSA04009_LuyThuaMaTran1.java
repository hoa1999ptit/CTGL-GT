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
public class DSA04009_LuyThuaMaTran1 {

    static int mod = (int) 1e9 + 7;
    static int N;

    public static class Matrix {

        long[][] TMP = new long[11][11];

        public Matrix() {

        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            Matrix x = new Matrix();
            N = in.nextInt();
            long K = in.nextLong();
            long[][] A = new long[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    A[i][j] = in.nextLong();
                    x.TMP[i][j] = A[i][j];
                }
            }
            x = power(x, K);
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    System.out.print(x.TMP[i][j] + " ");
                }
                System.out.println();
            }
        }
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

    public static Matrix multiply(Matrix a, Matrix b) {
        Matrix res = new Matrix();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                res.TMP[i][j] = 0;
                for (int k = 0; k < N; k++) {
                    res.TMP[i][j] = (res.TMP[i][j] + a.TMP[i][k] * b.TMP[k][j]) % mod;
                }
            }
        }
        return res;
    }
}
/*
2
2 5
1 1
1 0
3 1000000000
1 2 3
4 5 6
7 8 9
OUTPUT
8 5
5 3
597240088 35500972 473761863
781257150 154135232 527013321
965274212 272769492 580264779
 */
