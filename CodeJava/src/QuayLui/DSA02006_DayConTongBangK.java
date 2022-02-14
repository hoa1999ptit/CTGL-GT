/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QuayLui;

import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author nhokt
 */
public class DSA02006_DayConTongBangK {

    static int[] A = new int[50];
    static int[] B = new int[50];
    static int N, K, test, mark;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            test = 0;
            N = in.nextInt();
            K = in.nextInt();
            for (int i = 1; i <= N; i++) {
                A[i] = in.nextInt();
            }
            for (int i = 1; i <= N; i++) {
                for (int j = i + 1; j <= N; j++) {
                    if (A[i] > A[j]) {
                        // If arr[i] > arr[j], swap the value of arr[i] and arr[j]
                        int temp = A[i];
                        A[i] = A[j];
                        A[j] = temp;
                    }
                }
            }
            quaylui(1);
            if (test == 0) {
                System.out.print("-1");
            }
            System.out.println();
        }
    }

    public static void quaylui(int i) {
        for (int j = 1; j >= 0; j--) {
            B[i] = j;
            if (i == N) {
                if (check() == true) {
                    output();
                }
            } else {
                quaylui(i + 1);
            }
        }
    }

    public static boolean check() {
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += A[i] * B[i];
        }
        if (sum == K) {
            return true;
        } else {
            return false;
        }

    }

    public static void output() {
        test++;
        for (int i = N; i >= 1; i--) {
            if (B[i] == 1) {
                mark = i;
                break;
            }
        }
        System.out.print("[");
        for (int i = 1; i <= N; i++) {
            if (B[i] != 0) {
                System.out.print(A[i]);
                if (i != mark) {
                    System.out.print(" ");
                }
            }
        }
        System.out.print("] ");
    }
}
/*
2
5 50
5  10 15 20  25
8  53
15  22  14  26  32  9  16  8
 */
