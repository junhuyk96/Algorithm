package Ch02;

public class ch2_Q2_3 {

    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1]; a[idx1] = a[idx2]; a[idx2] = t;
    }

    static void reverse(int[] a) {
        for(int i=0; i <= a.length/2; i++) {
            for(int j=0; j<a.length; j++) {
                System.out.print(a[j] + " ");
            }
            System.out.println();
            System.out.println("a[" + i + "]과(와) a[" + (a.length-i-1) + "]를 교환합니다.");
            swap(a, i, a.length - i - 1);
        }
    }

    static void Q2(int a[]) {
        reverse(a);
    }

    static void Q3(int a[]) {
        int sum=0;
        for(int i=0; i<a.length; i++) sum+=a[i];

        System.out.println(sum);
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        Q2(a);
        Q3(a);
    }
}
