package Ch03;

public class ch3_Q1 {

    static int Q1(int[] a, int n, int key) {
        int i;

        a[n] = key; // 보초를 추가

        for (i = 0; a[i] != key; i++);

        return i == n ? -1 : i;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};

        System.out.println(Q1(a,6,4));
    }
}
