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
public class DSA02005_HoanViXauKyTu {

    static int[] b = new int[30];
    static int n;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            String str = in.nextLine();
            //String[] array = str.split("\\|");
            str.split("");
            quaylui(1);
        }
    }

    static void in() {
        for (int i = 1; i <= n; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();
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
