package Ch05;

import java.util.Scanner;
import java.util.Stack;

public class RecurX2 {
    static void recur(int n) {
        Stack<Integer> st = new Stack<>();

        while(true) {
            if(n>0) {
                st.push(n);
                n=n-1;
                continue;
            }
            if(!st.isEmpty()) {
                n = st.pop();
                System.out.println(n);
                n = n - 2;
                continue;
            }
            break;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요.: ");
        int x = sc.nextInt();

        recur(x);
    }
}
