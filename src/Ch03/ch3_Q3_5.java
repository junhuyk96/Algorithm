package Ch03;

public class ch3_Q3_5 {

    static int Q3(int[] a, int n, int key, int[] idx) {
        int x=0;
        int cnt=0;

        for(int i=0; i<a.length; i++) {
            if(a[i]==key) {
                idx[x++] = i;
                cnt++;
            }
        }

        return cnt;
    }

    static int Q5(int[] a, int n, int key) {
        int pl = 0;
        int pr = n-1;
        int pc = (pl + pr) / 2;
        do {
            if(a[pc]==key) break;
            else if(a[pc] > key) pr = pc -1;
            else pl = pc + 1;
        }while(pl<=pr);

        while(pc!=0) {
            if(a[pc]==key) pc--;
            else break;
        }

        return pc;
    }
}
