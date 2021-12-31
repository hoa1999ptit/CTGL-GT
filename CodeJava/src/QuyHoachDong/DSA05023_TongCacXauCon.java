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
public class DSA05023_TongCacXauCon {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            String N = in.next();
            System.out.println(qhd(N));
        }
    }

    static long qhd(String s) {
        long tmp = (int) (s.charAt(0) - '0');
        long res = tmp;
        for (int i = 1; i < s.length(); i++) {
            tmp = (i + 1) * (int) (s.charAt(i) - '0') + 10 * tmp;
            res += tmp;
        }
        return res;
    }
}
