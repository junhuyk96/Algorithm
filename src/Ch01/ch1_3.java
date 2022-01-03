package Ch01;
import java.sql.SQLOutput;
import java.util.Scanner;

public class ch1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("정수를 입력하세요. : ");
        int n = sc.nextInt();

        if(n > 0) System.out.println("이 수는 양수입니다.");
        else if(n < 0) System.out.println("이 수는 음수입니다.");
        else System.out.println("이 수는 0입니다.");
        
        // 조건 연산자
        int c = 0;
        System.out.println((c==0) ? "c는 0" : "c는 0이 아님");
    }
}
