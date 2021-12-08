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
// Giống bài số nguyên lớn
public class DSA05001_XauConChungDaiNhat {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            String a = in.next();
            String b = in.next();

            System.out.println(quyhoachdong(a, b));
        }
    }

    static int quyhoachdong(String a, String b) {
        int c[][] = new int[a.length() + 1][b.length() + 1];
        for (int i = 1; i < a.length() + 1; i++) {
            for (int j = 1; j < b.length() + 1; j++) {
                if (a.charAt(i - 1) == b.charAt(j - 1)) {
                    c[i][j] = c[i - 1][j - 1] + 1;
                } else {
                    c[i][j] = Math.max(c[i][j - 1], c[i - 1][j]);
                }
            }
        }
        return c[a.length()][b.length()];
    }
}
/*
2
AGGTAB
GXTXAYB
AA
BB
OUTPUT
4
0
*/