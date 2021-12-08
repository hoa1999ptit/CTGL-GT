/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuayLui;

import java.util.Scanner;

/**
 *
 * @author nhokt
 */
public class DSA01016_PhanTichSo1_QuayLui {

    static int n;
    static int[] a = new int[15];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            quaylui(1, n, 0);//tổng ban đầu =0/ s=0
            System.out.println();
        }
    }

    public static void quaylui(int i, int j, int s) {
        int k;
        for (k = j; k >= 1; k--) {
            if (s + k <= n) {
                a[i] = k;// gán a[i] =k
                s = s + k;// gán tổng = tổng + k
                if (s == n) {// nếu tổng = n ban đầu
                    in(i);
                } else {//nếu tổng khác n ban đầu
                    quaylui(i + 1, k, s);///quay lui vị trí tiếp theo
                }
                s = s - k;
            }
        }
    }

    public static void in(int m) {
        System.out.print("(");
        for (int i = 1; i < m; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.print(a[m] + ") ");
        System.out.println();

    }
}
