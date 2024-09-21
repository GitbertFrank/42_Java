package J01.ex02;
public class ft_swap {
    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.print(a);
        System.out.print(b);
    }
    public static void main(String[] args) {
        swap(2, 4);
    }
}
