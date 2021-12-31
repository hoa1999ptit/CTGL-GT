/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SapXep_TimKiem;

import java.util.Scanner;

/**
 *
 * @author nhokt
 */
public class DSA06014_TongCapSoNguyenTo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int test = in.nextInt();
        while (test-- > 0) {
            int n = in.nextInt();

        }
    }

    public static boolean isPrimeNumber(int n) {
        // so nguyen n < 2 khong phai la so nguyen to
        if (n < 2) {
            return false;
        }
        // check so nguyen to khi n >= 2
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
