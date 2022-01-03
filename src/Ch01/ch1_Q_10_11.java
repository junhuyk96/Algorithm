package Ch01;
import java.util.Scanner;

public class ch1_Q_10_11 {
    static Scanner sc = new Scanner(System.in);

    static void Q10() {
        System.out.print("a의 값 : ");
        int a = sc.nextInt();
        int b;
        do {
            System.out.print("b의 값 : ");
            b = sc.nextInt();
            if(b <= a) System.out.println("a보다 큰 값을 입력하세요!");
        } while(b <= a);
        System.out.println("b - a는 " + (b-a) + "입니다.");
    }

    static void Q11() {
        int i = 0;
        int n = sc.nextInt();

        do {
            i++;
            n /= 10;
        } while(n > 0);

        System.out.println("그 수는 " + i + "자리입니다.");
    }

    public static void main(String[] args) {
        Q10();
        Q11();
    }
}
