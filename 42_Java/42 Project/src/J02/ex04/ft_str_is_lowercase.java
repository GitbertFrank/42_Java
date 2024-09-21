package J02.ex04;

public class ft_str_is_lowercase {
    public static int str_is_lowercase(char[] str){
        int i = 0;
        while(i < str.length) {
            if('a'<= str[i] && str[i]<= 'z') 
                i++;
            else 
                return 0;
        }
        return 1;
    }
    public static void main(String[] args) {
        System.out.println(str_is_lowercase(new char[]{'a', 'b', 'c', 'd', 'e', 'F'}));
    }
}
