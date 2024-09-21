package J02.ex02;

public class ft_str_is_alpha {
    public static int str_is_alpha(char[] str){
        int i = 0;
        while(i < str.length) {
            if('a'<= str[i] && str[i]<= 'z' || 'A'<= str[i] && str[i]<= 'Z') 
                i++;
            else 
                return 0;
        }
        return 1;
    }
    public static void main(String[] args) {
        System.out.println(str_is_alpha(new char[]{'H', 'E', 'L', 'L', 'O', '!'}));
    }
}
