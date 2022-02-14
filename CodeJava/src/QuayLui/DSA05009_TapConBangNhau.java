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
public class DSA05009_TapConBangNhau {

    static int a[] = new int[105];
    static int b[] = new int[105];

    static int n, sum, printed;
    static boolean check = false;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            printed = 0;
            sum = 0;
            n = in.nextInt();
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
                sum += a[i];
            }
            if (sum % 2 == 1) {
                System.out.print("NO");
            } else {
                quaylui(1);
                if (check == true) {
                    System.out.print("YES");
                } else {
                    System.out.print("NO");
                }
            }
        }
    }

    public static boolean check() {
        int tmp = 0;
        for (int i = 1; i <= n; i++) {
            tmp += a[i] * b[i];
        }
        if (tmp == sum / 2) {
            return true;
        } else {
            return false;
        }
    }

    public static void quaylui(int i) {
        if (printed == 0) {
            return;
        }
        for (int j = 1; j >= 0; j--) {
            if (printed == 0) {
                return;
            }
            b[i] = j;
            if (i == n) {
                if (check()) {
                    printed++;
                    return;
                }
            } else {
                quaylui(i + 1);
            }

        }
    }
}
