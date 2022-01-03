package Ch01;
import java.util.Scanner;

public class ch1_Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int i = 0;
        while(i <= n) {
            i++;
            System.out.println("i의 값 : " + i);
        }
    }
}
