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
public class DSA01006_HoanViNguoc {

    static int[] b = new int[15], a = new int[15];
    static int n;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            n = in.nextInt();
            quaylui(1);
            System.out.println();
        }
    }

    static void in() {
//        ArrayList<String> list = new ArrayList<>();
//        list.add("");
//        for (int i = 1; i <= n; i++) {
//            String tmp = "";
//            tmp = tmp + a[i];
//            //System.out.print(a[i]);
//            list.add(tmp);
//        }
//        //System.out.print(" ");
//        Collections.reverse(list);
//        for (String tmp : list) {
//            System.out.print(tmp );
//        }
        for (int i = 1; i <= n; i++) {
            System.out.print(a[i]);
        }
        System.out.print(" ");
    }

    static void quaylui(int i) {
        /*
        for các giá trị từ 1 đến n
        
         */
        for (int j = n; j >= 1; j--) {
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
/*
2 
2 
3 
OUTPUT
21 12 
321 312 231 213 132 123   
 */
