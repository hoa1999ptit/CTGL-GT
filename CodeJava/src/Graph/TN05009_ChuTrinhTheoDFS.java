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
public class TN05009_ChuTrinhTheoDFS {

//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int t = in.nextInt();
//        while (t-- > 0) {
//            int n = in.nextInt();
//            int m = in.nextInt();
//            List<Integer>[] list = (List<Integer>[]) new List[1005];
//            for (int i = 0; i < list.length; i++) {
//                list[i] = new ArrayList<Integer>();
//
//            }
//            for (int i = 0; i < m; i++) {
//                int u = in.nextInt();
//                int v = in.nextInt();
//                list[u].add(v);
//                list[v].add(u);
//            }
//            
//        }
//    }
    static int numberOfCycles(int N, int E,
            int edges[][]) {
        @SuppressWarnings("unchecked")
        Vector<Integer>[] graph = new Vector[N];
        for (int i = 0; i < N; i++) {
            graph[i] = new Vector<Integer>();
        }

        for (int i = 0; i < E; i++) {
            graph[edges[i][0]].add(edges[i][1]);
            graph[edges[i][1]].add(edges[i][0]);
        }

        // Return the number of cycles
        return (E - N) + 1;
    }

// Driver Code
    public static void main(String[] args) {
        int N = 6;
        int E = 9;
        int edges[][] = {{0, 1},
        {1, 2},
        {2, 0},
        {5, 1},
        {5, 0},
        {3, 0},
        {3, 2},
        {4, 2},
        {4, 1}};

        int k = numberOfCycles(N, E, edges);

        System.out.print(k + "\n");
    }
}
/*
1 2 
1 3 
2 3 
2 5 
3 4 
3 5 
4 5 
4 6 
5 6
 */
