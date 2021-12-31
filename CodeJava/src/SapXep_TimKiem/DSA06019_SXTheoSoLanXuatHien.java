/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SapXep_TimKiem;

import java.util.*;

/**
 *
 * @author nhokt
 */
public class DSA06019_SXTheoSoLanXuatHien {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int test = in.nextInt();
        while (test-- > 0) {
            int n = in.nextInt();
            int x = in.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            if (dem(a, n, x) == 0) {
                System.out.println("-1");
            } else {
                System.out.println(dem(a, n, x));
            }

        }
    }
    
    public static int dem(int a[], int n, int x) {
        int demx = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == x) {
                demx = demx + 1;
            }
        }
        return demx;
    }

}
/*
2
5
5 5 4 6 4
5
9 9 9 2 5
OUTPUT
4 4 5 5 6
9 9 9 2 5
 */
