/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack_Queue;

import java.util.*;

/**
 *
 * @author nhokt
 */
public class DSA08005_SoNhiPhan1DenN {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            generatePrintBinary(n);
            System.out.println(" ");
        }
    }

    static void generatePrintBinary(int n) {
        // Create an empty queue of strings
        Queue<String> q = new LinkedList<String>();

        // Enqueue the first binary number
        q.add("1");

        // This loops is like BFS of a tree with 1 as root
        // 0 as left child and 1 as right child and so on
        while (n-- > 0) {
            // print the front of queue
            String s1 = q.peek();
            q.remove();
            System.out.print(s1);

            // Store s1 before changing it
            String s2 = s1;

            // Append "0" to s1 and enqueue it
            q.add(s1 + "0");

            // Append "1" to s2 and enqueue it. Note that s2
            // contains the previous front
            q.add(s2 + "1");
            System.out.print(" ");
        }
    }
}
