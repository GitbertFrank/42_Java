package J02.ex05;

public class ft_str_is_uppercase {
    public static int str_is_uppercase(char[] str){
        int i = 0;
        while(i < str.length) {
            if('A'<= str[i] && str[i]<= 'Z') 
                i++;
            else 
                return 0;
        }
        return 1;
    }
    public static void main(String[] args) {
        System.out.println(str_is_uppercase(new char[]{'A', 'B', 'C', 'D', 'E', 'f'}));
    }
}
