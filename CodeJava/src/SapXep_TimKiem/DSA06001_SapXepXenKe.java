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
public class DSA06001_SapXepXenKe {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int test = in.nextInt();
        while (test-- > 0) {
            int n = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            Arrays.sort(a);
            if (n % 2 == 0) {
                for (int i = n - 1; i > n / 2 - 1; i--) {
                    System.out.print(a[i] + " " + a[n - 1 - 1] + " ");
                }
                System.out.println();
            } else {
                for (int i = n - 1; i > n / 2 - 1; i--) {
                    if (i == n / 2) {
                        System.out.print(a[i] + " ");
                    } else {
                        System.out.print(a[i] + " " + a[n - i - 1] + " ");
                    }
                }
                System.out.println();
            }
        }
    }

}
/*
2
7
7 1 2 3 4 5 6
8
1 6 9 4 3 7 8 2
 */
