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
public class DSA05018_XauConDoiXungDaiNhat {

    static int[][] F = new int[1005][1005];

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            String s = in.next();
            System.out.println(qhd(s)
            );
        }
    }

    static int qhd(String s) {
        int i, j, k;
        int res = 1;

        for (i = 0; i < s.length(); i++) {
            F[i][i] = 1;
        }
        for (k = 1; k <= s.length() - 1; k++) {
            for (i = 0; i <= s.length() - k - 1; i++) {
                j = i + k;
                if (s.charAt(i) == s.charAt(j) && k != 1) {
                    F[i][j] = F[i + 1][j - 1];
                } else if (s.charAt(i) == s.charAt(j) && k == 1) {
                    F[i][j] = 1;
                } else {
                    F[i][j] = 0;
                }

                if (F[i][j] == 1) {
                    res = Math.max(res, j - i + 1);
                }

            }
        }
        return res;

    }
}
