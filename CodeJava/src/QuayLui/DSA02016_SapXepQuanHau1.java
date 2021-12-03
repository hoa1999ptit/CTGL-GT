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
public class DSA02016_SapXepQuanHau1 {

    static boolean cot[] = new boolean[50];
    static boolean xuoi[] = new boolean[50];
    static boolean nguoc[] = new boolean[50];
    static int n, result;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            n = in.nextInt();
            result = 0;
            for (int i = 0; i <= n; i++) {
                cot[i] = true;
            }
            for (int j = 0; j <= 2 * n; j++) {
                xuoi[j] = true;
                nguoc[j] = true;
            }
            quaylui(1);
            System.out.println(result);
        }
    }

    static void quaylui(int i) {
        /*
        Nếu cột chưa bị chọn
        nếu xuôi tại (i-j+n) chưa đc chọn
            -> chọn xong đánh dấu
         */
        for (int j = 1; j <= n; j++) {
            if (cot[j] && xuoi[n + i - j] && nguoc[i + j]) {
                cot[j] = false;
                xuoi[n + i - j] = false;
                nguoc[i + j] = false;
                if (i == n) {
                    result++;
                } else {
                    quaylui(i + 1);
                }
                cot[j] = true;
                xuoi[n + i - j] = true;
                nguoc[i + j] = true;
            }
        }
    }
}
