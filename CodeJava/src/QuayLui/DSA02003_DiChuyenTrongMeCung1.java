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
public class DSA02003_DiChuyenTrongMeCung1 {

    static int n, a[][];
    static ArrayList<String> kq;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            n = in.nextInt();
            a = new int[n][n];
            kq = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = in.nextInt();
                }
            }
            quaylui(0, 0, "");
            if (kq.size() == 0 || a[0][0] == 0) {
                System.out.print(-1);
            } else {
                for (String s : kq) {
                    System.out.print(s + " ");
                }
            }
            System.out.println();
        }
    }

    public static void quaylui(int i, int j, String s) {
        if (i == n - 1 && j == n - 1 && a[i][j] == 1) {
            kq.add(s);
        }
        if (i < n - 1 && a[i + 1][j] == 1) {
            quaylui(i + 1, j, s + "D");
        }
        if (j < n - 1 && a[i][j + 1] == 1) {
            quaylui(i, j + 1, s + "R");
        }
    }
}
