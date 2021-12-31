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

    static String str;
    static int[] a = new int[100];
    static boolean check[] = new boolean[100];

    static void quaylui(int i) {
        for (int j = 0; j < str.length(); j++) {
            if (!check[j]) {
                a[i] = j;
                check[j] = true;
                if (i == str.length()) {
                    for (int k = 1; k <= str.length(); k++) {
                        System.out.print(str.charAt(a[k]));
                    }
                    System.out.print(" ");
                } else {
                    quaylui(i + 1);
                }
                check[j] = false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            char tempArray[] = s.trim().toCharArray();
            Arrays.sort(tempArray);
            str = new String(tempArray);
            quaylui(1);
            System.out.println();
        }
    }
}
