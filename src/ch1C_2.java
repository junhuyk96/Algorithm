import java.util.Arrays;
import java.util.Scanner;

public class ch1C_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no;

        System.out.println("2자리의 정수를 입력하세요.");

        do {
            System.out.print("입력 : ");
            no = sc.nextInt();
        } while(no < 10 || no >99);

        System.out.println("변수 no의 값은 " + no + "가(이) 되었습니다.");
    }
}
