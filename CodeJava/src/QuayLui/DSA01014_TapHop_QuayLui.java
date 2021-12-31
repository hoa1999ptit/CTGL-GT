/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuayLui;

import java.util.*;

/**
 *
 * @author nhokt
 */
public class DSA01014_TapHop_QuayLui {

    static int[] b = new int[30];
    static int n, k, s, dem;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            n = in.nextInt();
            k = in.nextInt();
            s = in.nextInt();
            if (n == 0 && s == 0 && k == 0) {
                break;
            }
            dem = 0;
            quaylui(1);
            System.out.println(dem);

        }
    }

    static void in() {
        int sum = 0;// gán tổng =0
        for (int i = 1; i <= k; i++) {
            sum += b[i];
        }
        if (sum == s) {
            dem++;
        }
        //System.out.println();
    }

    static void quaylui(int i) {
        int j;
        for (j = b[i - 1] + 1; j <= n - k + i; j++) {
            b[i] = j;
            if (i == k) {
                in();
            } else {
                quaylui(i + 1);
            }
        }
    }
}
/*
9 3 23
9 3 22
10 3 28
16 10 107
20 8 102
20 10 105
20 10 155
3 4 3
4 2 11
0 0 0
OUTPUT
1
2
0
20
1542
5448
1
0
0
 */
