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
public class DSA01008_XauNhiPhanCoKBit1 {

    static int[] b = new int[30];
    static int n, k;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            n = in.nextInt();
            k = in.nextInt();
            quaylui(1);
        }
    }

    static void in() {
        int i, sum = 0;
        for (i = 1; i <= n; i++) {
            sum += b[i];
        }
        if (sum == k) {
            for (i = 1; i <= n; i++) {
                System.out.print(b[i]);
            }
            System.out.println();
        }
    }

    static void quaylui(int i) {
        int j;
        for (j = 0; j <= 1; j++) {
            b[i] = j;
            if (i == n) {
                in();
            } else {
                quaylui(i + 1);
            }
        }
    }
}
/*
2
4 2
3 2
OUTPUT
0011
0101
0110
1001
1010
1100
011
101
110
*/