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
public class ExampleHoanVi {

    /*
    - gán chuaxet=true;
    - trả lại khi kết thúc 1 lượt chọn
     */
    static int[] b = new int[15], a = new int[15];
    static int n;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        quaylui(1);
    }

    static void in() {
        for (int i = 1; i <= n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    static void quaylui(int i) {
        /*
        for các giá trị từ 1 đến n
        
         */
        for (int j = 1; j <= n; j++) {
            if (b[j] == 0) {
                a[i] = j;
                b[j] = 1;
                if (i == n) {
                    in();
                } else {
                    quaylui(i + 1);
                }
                b[j] = 0;
            }
        }
    }
}
