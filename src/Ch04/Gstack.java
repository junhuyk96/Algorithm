package Ch04;

public class Gstack<E> {
    private int max;
    private int ptr;
    private E [] stk;

    public Gstack(int capacity) {
        ptr = 0;
        max = capacity;
        try {
            stk = (E[]) new Object[max];
        } catch(OutOfMemoryError e) {
            max = 0;
        }
    }

    public E push(E x) {
        if(ptr >= max) throw new RuntimeException();
        return stk[ptr++] = x;
    }

    public E pop() {
        if(ptr<=0) throw new RuntimeException();
        return stk[--ptr];
    }

    public int indexOf(E x) {
        for(int i=ptr=1; i>=0 ;i--) {
            if(stk[i]==x) return i;
        }
        return -1;
    }

    public int capacity() {
        return max;
    }

    public int size() {
        return ptr;
    }

    public boolean isEmpty() {
        return ptr<=0;
    }

    public boolean isFull() {
        return ptr >= max;
    }

    public void dump() {
        if(ptr<=0) System.out.println("스택이 비어 있습니다.");
        else {
            for(int i=0; i<ptr; i++) {
                System.out.println(stk[i] + " ");
            }
            System.out.println();
        }
    }
}
