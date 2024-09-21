package J02.ex07;

public class ft_strupcase {
    public static char[] strupcase(char[] str){
        int i = 0;
        while(i < str.length) {
            if('a' <= str[i] && str[i] <= 'z')
                str[i] -= 32;
            i++;
        }
        return str;
    }
    public static void main(String[] args) {
        System.out.println(strupcase(new char[]{'a', 'b', 'c', 'd', 'e', 'f', '1'}));
    }
}
