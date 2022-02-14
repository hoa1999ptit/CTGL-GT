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
public class DSA05029_GiaiMa {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while (t-- > 0) {
            String str = in.nextLine();
            if (str.charAt(0) == '0') {
                System.out.println(0);
                continue;
            }
            int n = str.length();
            int[] dp = new int[n + 5];
            dp[0] = 1;
            dp[1] = 1;
            for (int i = 2; i <= n; i++) {
                dp[i] = 0;
                if(str.charAt(i - 1) > '0'){
                    dp[i] = dp[i - 1];
                }
                if(str.charAt(i - 2) == '1' || str.charAt(i - 2) == '2' && str.charAt(i - 1) < '7'){
                    dp[i] += dp[i - 2];
                }
            }
            System.out.println(dp[n]);
        }
    }
}
