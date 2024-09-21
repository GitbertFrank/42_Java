package J01.ex03;
public class ft_div_mod{
    public static void div_mod(int a, int b, int div, int mod){
        div = a / b;
        mod = a % b;
        System.out.println(div);
        System.out.println(mod);
    }
    public static void main(String[] args) {
        div_mod(2, 4, 0, 0);
    }
}
