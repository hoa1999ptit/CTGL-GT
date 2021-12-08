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
public class DSA05025_ConEch {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long[] F = new long[55];
        F[1] = 1;
        F[2] = 2;
        F[3] = 4;
        for (int i = 4; i <= 50; i++) {
            F[i] = F[i - 1] + F[i - 2] + F[i - 3];
        }
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            System.out.println(F[n]);
        }
    }
}
/*
Input
2
1
5
Output
1
13
*/