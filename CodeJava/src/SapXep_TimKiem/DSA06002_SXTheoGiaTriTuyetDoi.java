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
public class DSA06002_SXTheoGiaTriTuyetDoi {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int test = in.nextInt();
        while (test-- > 0) {
            int n = in.nextInt();
            int x = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            bubbleSort(a, n, x);
            for (int i = 0; i < n; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }
    }

    public static void bubbleSort(int arr[], int n, int k) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (Math.abs(arr[j] - k) > Math.abs(arr[j + 1] - k)) {
                    //swap(arr[j], arr[j + 1]);
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }
}
/*
TEST
2
5 7
10 5 3 9 2
5 6
1 2 3 4 5
*/
