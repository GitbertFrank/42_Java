package J00.ex04;

public class ft_is_negative {
    public static void is_negative(int n){
        if (n < 0) System.out.print("N");
        else System.out.print("P");
    }
    public static void main(String[] args) {
        is_negative(-1);
        is_negative(0);
        is_negative(2345678);
    }
}
