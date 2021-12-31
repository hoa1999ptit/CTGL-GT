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
public class DSA06011_TongGan0Nhat {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int test = in.nextInt();
        while (test-- > 0) {
            int n = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            in(a, n);
        }
    }

    /*
    Gán tổng nhỏ nhất cho 2 phần tử đầu tiên của mảng
    chạy vòng lặp for từ phần tử đầu và p/tử 2
    gán tổng = p/tử thứ i + p/tử thứ j
    nếu tổng min ban đầu > tổng mới
    gán tổng
    thay vị trí i,j
     */
    public static void in(int a[], int n) {
        int i, j, tongMin = a[0] + a[1];
        int tong, iMin = 0, jMin = 1;
        for (i = 0; i < n; i++) {
            for (j = i + 1; j < n; j++) {
                tong = a[i] + a[j];
                if (Math.abs(tongMin) > Math.abs(tong)) {
                    tongMin = tong;
                    iMin = i;
                    jMin = j;

                }
            }
        }
        System.out.println(a[iMin] + a[jMin]);
    }
}
/*
2
3
-8 -66 -60
6
-21 -67 -37 -18 4 -65

OUTPUT
-68
-14
 */
