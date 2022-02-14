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
public class DSA07021_DayNgoacDungDaiNhat {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soLuongTest = Integer.parseInt(scanner.nextLine());
        while (soLuongTest --> 0) {
            String s = scanner.nextLine();
            System.out.println(tinhDoDai(s));
        }
    }

    private static int tinhDoDai(String s) {
        int doDai = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (!stack.isEmpty()) {
                    doDai = Math.max(doDai, i - stack.peek());
                } else stack.push(i);
            }
        }
        return doDai;
    }

}
/*
3
((()
)()())
()(()))))
*/