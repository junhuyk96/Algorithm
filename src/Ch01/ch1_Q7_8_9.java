package Ch01;
public class ch1_Q7_8_9 {

    static int Q7(int n) {
        int sum=0;

        for(int i = 1; i <= n; i++) sum += i;

        return sum;
    }

    static int Q8(int n) {
        return (1 + n) * (n / 2);
    }

    static int Q9(int a, int b) {
        int sum = 0;

        if(a < b) {
            for(int i = a; i <= b; i++) sum += i;
        }
        else {
            for(int i = b; i <= a; i++) sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Q7 = " + Q7(7));
        System.out.println("Q8 = " + Q8(10));
        System.out.println("Q9 = " + Q9(10, 5));
    }
}
