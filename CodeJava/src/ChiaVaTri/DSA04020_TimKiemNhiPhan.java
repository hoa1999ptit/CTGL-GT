/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChiaVaTri;

import java.util.Scanner;

/**
 *
 * @author nhokt
 */
public class DSA04020_TimKiemNhiPhan {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int k = in.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
            int result = binarySearch(arr, 0, n - 1, k);
            if (result == 0) {
                System.out.println("NO");
            } else {
                System.out.println(result + 1);
            }
        }

    }

    public static int binarySearch(int arr[], int l, int r, int x) {
        if (l > r) {
            return 0;
        } else {
            int mid = (l + r) / 2;
            if (arr[mid] == x) {
                return mid;
            }

            if (arr[mid] > x) {
                return binarySearch(arr, l, mid - 1, x);
            }

            return binarySearch(arr, mid + 1, r, x);
        }

    }

}
/*
2

5 3

1 2 3 4 5

6 5

0 1 2 3 9 10
 */
