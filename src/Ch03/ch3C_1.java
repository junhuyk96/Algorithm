package Ch03;

public class ch3C_1 {
    private static int counter = 0;
    private int id;

    public ch3C_1() {id=++counter;}
    public int getId() {return id;}
    public static int getCounter() {return counter;}

    public static void main(String[] args) {
        ch3C_1 a = new ch3C_1();
        ch3C_1 b = new ch3C_1();

        System.out.println("a의 아이디: " + a.getId());
        System.out.println("b의 아이디: " + b.getId());

        System.out.println("부여한 아이디의 개수 : " + ch3C_1.getCounter());
    }
}
