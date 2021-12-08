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
public class DSAKT053_SoNguyenLon {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            String a = in.next();
            String b = in.next();
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
            System.out.println(c[a.length()][b.length()]);
        }
    }
}
/*

Input
2
144615
4976135
44
88
OUTPUT
4
0

*/
