package Ch01;

public class ch1_Q15_16_17 {

    static void Q15(int n) {
        for(int i=0; i<n; i++) {
            for(int j=0; j<=i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        for(int i=0; i<n; i++) {
            for(int j=n; j>i; j--) {
                System.out.print('*');
            }
            System.out.println();
        }

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                if(j >= i) System.out.print('*');
                else System.out.print(' ');
            }
            System.out.println();
        }

        for(int i=0; i<n; i++) {
            for(int j=n-1; j>=0; j--) {
                if(i >= j) System.out.print('*');
                else System.out.print(' ');
            }
            System.out.println();
        }
    }

    static void Q16(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i; j++) {
                System.out.print(' ');
            }
            for(int j=1; j<=2*i-1; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    static void Q17(int n) {
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n-i; j++) {
                System.out.print(' ');
            }
            for(int j=1; j<=2*i-1; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Q15(5);
        Q16(5);
        Q17(5);
    }
}
