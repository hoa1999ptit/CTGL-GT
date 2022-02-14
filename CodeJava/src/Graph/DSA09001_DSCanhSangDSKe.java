/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graph;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author nhokt
 */
public class DSA09001_DSCanhSangDSKe {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int v = in.nextInt();
            int e = in.nextInt();
            List<Integer>[] danhsachcanh = (List<Integer>[]) new List[1005];
            for (int i = 0; i < danhsachcanh.length; i++) {
                danhsachcanh[i] = new ArrayList<Integer>();
            }
            for (int i = 0; i < e; i++) {
                int u = in.nextInt();
                int k = in.nextInt();
                danhsachcanh[u].add(k);//do do thi vo huong
                danhsachcanh[k].add(u);
            }
            for (int i = 1; i <= v; i++) {
                System.out.print(i + ": ");
                for (int j = 0; j < danhsachcanh[i].size(); j++) {
                    System.out.print(danhsachcanh[i].get(j) + " ");
                }
                System.out.println();
            }
        }
    }
}
/*
1
6  9
1  2
1  3 
2  3
2  5
3  4
3  5
4  5
4  6
5  6
*/