/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuyHoachDong;

import java.util.Scanner;

/**
 *
 * @author nhokt
 */
public class DSA05026_XemPhim {

    static int w[][];
    static int n, c;
    static int[] a = new int[105];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        c = sc.nextInt();
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(tinh());
    }

    static int tinh() {
        w = new int[n + 1][c + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= c; j++) {
                if (j >= a[i] && w[i - 1][j - a[i]] + a[i] > w[i - 1][j]) {
                    w[i][j] = w[i - 1][j - a[i]] + a[i];
                } else {
                    w[i][j] = w[i - 1][j];
                }
            }
        }
        return w[n][c];
    }
}
/*
259 5 
81 
58 
42 
33 
61 
OUTPUT
242

 */
