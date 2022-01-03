public class ch1_Q1_2_3 {
    static int max4(int a, int b, int c, int d) {
        int max = a;
        if(b > max) max = b;
        if(c > max) max = c;
        if(d > max) max = d;

        return max;
    }

    static int min3(int a, int b, int c) {
        int min = a;
        if(b < min) b = min;
        if(c < min) c = min;

        return min;
    }

    static int min4(int a, int b, int c, int d) {
        int min = a;
        if(b < min) b = min;
        if(c < min) c = min;
        if(d < min) d = min;

        return min;
    }

    public static void main(String[] args) {
        int a = 1, b = 3, c = 5, d = 2;

        System.out.println("max4(1, 3, 5, 2) = " + max4(a, b, c, d));
        System.out.println("min3(1, 3, 5) = " + min3(a, b, c));
        System.out.println("min4(1, 3, 5, 2) = " + min4(a, b, c, d));
    }
}
