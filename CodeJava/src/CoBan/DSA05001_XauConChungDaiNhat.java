/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CoBan;

import java.util.*;

/**
 *
 * @author nhokt
 */
public class DSA05001_XauConChungDaiNhat {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while (t-- > 0) {
            String s1 = in.nextLine();
            String s2 = in.nextLine();
            char[] X1 = s1.toCharArray();// đưa các ký tự trong chuỗi s1 vào mảng ký tự x1
            char[] X2 = s2.toCharArray();//đưa các ký tự trong chuỗi s2 vào mảng ký tự x2
            int result = 0;
            // tạo mảng 2 chiều

            int[][] F = new int[s1.length() + 1][s2.length() + 1];
            for (int i = 1; i <= s1.length(); i++) {
                for (int j = 1; j <= s2.length(); j++) {
                    if (X1[i - 1] == X2[j - 1]) {
                        F[i][j] = F[i - 1][j - 1] + 1;
                    } else {
                        F[i][j] = Math.max(F[i - 1][j], F[i][j - 1]);
                    }
                    result = Math.max(result, F[i][j]);
                }
            }
            System.out.println(result);
        }
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
