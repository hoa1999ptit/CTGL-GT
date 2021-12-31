/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuayLui;

import java.util.Scanner;

/**
 *
 * @author nhokt
 */
public class DSA02006_DayConTongBangK {

    static int[] A;
    static int N, K;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            N = in.nextInt();
            K = in.nextInt();
            for (int i = 0; i < N; i++) {
                A[i] = in.nextInt();
            }
            
        }
    }
}
