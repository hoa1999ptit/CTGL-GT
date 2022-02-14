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
public class DSA02013_SoNguyenTo {

    static int a[] = new int[500];
    static int s, p, n;
    static int testCase, run;
    static int result[] = new int[200];

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {

            testCase = 0;
            run = 1;
            s = in.nextInt();
            p = in.nextInt();
            n = in.nextInt();
            a = new int[s];

            a[0] = p + 1;
            quaylui(1);
            System.out.println(testCase);
            if (testCase != 0) {
                output();
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void quaylui(int i) {
        for (int j = a[i - 1] + 1; j <= s - n + i; j++) {
            while (!isPrime(j) && j <= s - n + i) {
                j++;
            }
            a[i] = j;
            if (i == n) {
                if (checkSum()) {
                    testCase++;
                    write();
                }
            } else {
                quaylui(i + 1);
            }
        }

    }

    public static boolean checkSum() {
        int temp = 0;
        for (int i = 1; i <= n; i++) {
            temp += a[i];
        }
        if (temp == s) {
            return true;
        }
        return false;
    }

    public static void write() {
        for (int i = 1; i <= n; i++) {
            result[run] = a[i];
            run++;
        }
    }

    public static void output() {
        for (int i = 1; i < run; i++) {
            System.out.print(result[i] + " ");
            if (i % n == 0) {
                System.out.println();
            }
        }
    }
}
/*
2
2  7  28
3  2  23
*/