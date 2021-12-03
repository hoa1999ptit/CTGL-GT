/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SapXep_TimKiem;

import java.util.*;

/**
 *
 * @author nhokt
 */
public class DSA06023_SXDoiChoTrucTiep {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
            if (!isSorted(arr)) {
                in(arr, i + 1);
            } else {
                in(arr, i + 1);
                break;
            }
        }
    }

    private static boolean isSorted(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                return false;
            }
        }
        return true;
    }

    private static void in(int[] a, int buoc) {
        System.out.format("Buoc %d: ", buoc);
        for (int i = 0; i < a.length; i++) {
            System.out.format("%d ", a[i]);
        }
        System.out.println();
    }
}
/*
4
5 7 3 2

 */
