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
public class DSA05019_HinhVuongLonNhat {

    static int n, m;
    static int a[][] = new int[505][505];
    static int b[][] = new int[505][505];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            n = in.nextInt();
            m = in.nextInt();
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= m; j++) {
                    a[i][j] = in.nextInt();
                }
            }
            System.out.println(qhd());
        }
    }

    public static int qhd() {
        for (int i = 1; i <= m; i++) {
            b[1][i] = a[1][i];
        }

        for (int i = 1; i <= n; i++) {
            b[i][1] = a[i][1];
        }
        int result = 0;

        for (int i = 2; i <= n; i++) {
            for (int j = 2; j <= m; j++) {
                if (a[i][j] == 1) {
                    b[i][j] = Math.min(
                            Math.min(b[i - 1][j], b[i][j - 1]),
                            b[i - 1][j - 1]) + 1;
                } else {
                    b[i][j] = 0;
                }

                result = Math.max(result, b[i][j]);
            }
        }
        return result;

    }
}
/*
2

6 5

0 1 1 0 1

1 1 0 1 0

0 1 1 1 0

1 1 1 1 0

1 1 1 1 1

0 0 0 0 0

2 2

0 0

0 0
*/
