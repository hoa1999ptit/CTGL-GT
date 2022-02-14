/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graph;

import java.util.*;

/**
 *
 * @author nhokt
 */
public class DSA09003_BieuDienDoThiCoHuong {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int V = in.nextInt();
            int E = in.nextInt();
            List<Integer>[] list = (List<Integer>[]) new List[1005];
            for (int i = 0; i < list.length; i++) {
                list[i] = new ArrayList<Integer>();
            }
            for (int i = 0; i < E; i++) {
                int u = in.nextInt();
                int v = in.nextInt();
                list[u].add(v);
            }
            for (int i = 1; i <= V; i++) {
                System.out.print(i + ": ");
                for (int j = 0; j < list[i].size() ;j++) {
                    System.out.print(list[i].get(j) + " ");

                }
                System.out.println();

            }
        }
    }
}
