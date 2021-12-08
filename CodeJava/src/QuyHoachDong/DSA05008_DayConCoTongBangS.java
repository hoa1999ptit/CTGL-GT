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
public class DSA05008_DayConCoTongBangS {

    static int n, s;
    static int[] a = new int[202];
    static int[] c = new int[40001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            n = sc.nextInt();
            s = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                a[i] = sc.nextInt();
            }
            if (check() == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    static int check() {
        int i, j;
        int[] F = new int[40001];
        F[0] = 1;
        for (i = 1; i <= n; i++) {
            for (j = s; j >= a[i]; j--) {
                if (F[j] == 0 && F[j - a[i]] == 1) {
                    F[j] = 1;
                }
            }
        }
        return F[s];
    }
}
/*
2
5 6
1 2 4 3 5
10 15
2 2 2 2 2 2 2 2 2 2
OUTPUT
YES
NO

 */
