/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChiaVaTri;

import java.util.*;

/**
 *
 * @author nhokt
 */
public class DSA04018_DemSo0 {

    static int answer;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int N = in.nextInt();
            for (int i = 1; i <= N; i++) {
                int tmp = in.nextInt();
                if (tmp == 0) {
                    answer = i;
                }
            }
            System.out.println(answer);
        }
    }
}
