package Ch01;

import java.util.Scanner;

public class ch1_Q12_13_14 {

    static void Q12() {
        System.out.print("  |");
        for(int i=1; i<=9; i++) {
            System.out.print("  " + i);
        }
        System.out.println();
        System.out.println("---+----------------------------");
        for(int i=1; i <= 9; i++) {
            System.out.print(i + " |");
            for(int j=1; j<=9; j++) {
                System.out.print("  " + i*j);
            }
            System.out.println();
        }
    }

    static void Q13() {
        System.out.print("  |");
        for(int i=1; i<=9; i++) {
            System.out.print("  " + i);
        }
        System.out.println();
        System.out.println("---+----------------------------");
        for(int i=1; i <= 9; i++) {
            System.out.print(i + " |");
            for(int j=1; j<=9; j++) {
                System.out.print("  " + (i+j));
            }
            System.out.println();
        }
    }

    static void Q14() {
        Scanner sc = new Scanner(System.in);
        System.out.println("사각형을 출력합니다.");
        System.out.print("단 수 : ");
        int n = sc.nextInt();

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Q12();
        Q13();
        Q14();
    }
}
