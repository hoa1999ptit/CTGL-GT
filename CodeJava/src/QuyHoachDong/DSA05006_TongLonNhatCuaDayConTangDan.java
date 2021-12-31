/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuyHoachDong;

import java.util.*;

/**
 *
 * @author nhokt
 */
public class DSA05006_TongLonNhatCuaDayConTangDan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int tongLonNhat;
        int b[], a[];
        while (t-- > 0) {
            int n = sc.nextInt();
            a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            b = new int[n];
            tongLonNhat = 0;
            for (int i = 0; i < n; i++) {
                b[i] = a[i];
                for (int j = 0; j < i; j++) {
                    if (a[i] > a[j]) {
                        b[i] = Math.max(b[i], b[j] + a[i]);
                    }
                }
                tongLonNhat = Math.max(tongLonNhat, b[i]);
            }
            System.out.println(tongLonNhat);
        }
    }
}
/*
3
7
1 101 2 3 100 4 5
3
10 7 5
4
1 2 3 5
OUPUT
106
10
11
 */
