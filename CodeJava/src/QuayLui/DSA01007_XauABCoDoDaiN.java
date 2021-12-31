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
public class DSA01007_XauABCoDoDaiN {

    static int[] b = new int[30];
    static int n;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            n = in.nextInt();
            quaylui(1);
            System.out.println();
        }
    }

    static void in() {
        for (int i = 1; i <= n; i++) {
            System.out.print((char) ('A' + b[i]));//ep kieu
        }
        System.out.print(" ");
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
2
3
OUTPUT
AA AB BA BB
AAA AAB ABA ABB BAA BAB BBA BBB
 */
