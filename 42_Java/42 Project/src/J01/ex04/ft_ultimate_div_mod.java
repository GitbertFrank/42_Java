package J01.ex04;
public class ft_ultimate_div_mod {
    public static void ultimate_div_mod(int a, int b){
        int temp = a;
        a = a / b;
        b = temp % b;
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String[] args) {
        ultimate_div_mod(4, 2);
    }
}
