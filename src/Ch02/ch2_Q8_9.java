package Ch02;

public class ch2_Q8_9 {
    static int[][] mdays = {
            {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
            {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
    };

    static int isLeap(int year) {
        return (year % 4 == 0 && year % 100 != 0 || year % 400 ==0) ? 1 : 0;
    }

    static int Q8(int y, int m, int d) {
        while(--m != 0) {
            d+=mdays[isLeap(y)][m-1];
        }
        return d;
    }

    static int Q9(int y, int m, int d) {
        int leftDays = 0;

        for(int i=m; i<12; i++) {
            leftDays+=mdays[isLeap(y)][i];
        }

        leftDays+=mdays[isLeap(y)][m-1] - d;

        return leftDays;
    }

    public static void main(String[] args) {
        System.out.println(Q9(2020, 1, 1));
    }
}
