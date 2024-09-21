package J02.ex03;

public class ft_str_is_numeric {
    public static int str_is_numeric(char[] str){
        int i = 0;
        while(i < str.length) {
            if('0'<= str[i] && str[i]<= '9') 
                i++;
            else 
                return 0;
        }
        return 1;
    }
    public static void main(String[] args) {
        System.out.println(str_is_numeric(new char[]{'1', '0', '0', '0', '0', '1'}));
    }
}
