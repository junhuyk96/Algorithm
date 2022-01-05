package Ch02;

public class ch2_Q4_5 {

    static void Q4(int[] a, int[] b) {
        for(int i=0; i<a.length; i++) {
            b[i]=a[i];
        }

        for(int i=0; i<b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();
    }

    static void Q5(int[] a, int[] b) {
        for(int i=0; i<b.length; i++) {
            a[b.length - i - 1] = b[i];
        }

        for(int i=0; i<a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = new int[5];

        Q4(a, b);
        Q5(a, b);
    }
}
