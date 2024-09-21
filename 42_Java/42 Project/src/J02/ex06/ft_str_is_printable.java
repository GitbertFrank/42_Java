package J02.ex06;

public class ft_str_is_printable {
    public static int str_is_printable(char[] str){
        int i = 0;
        while(i < str.length) {
            if(32 <= str[i] && str[i]<= 126 ) 
                i++;
            else 
                return 0;
        }
        return 1;
    }
    public static void main(String[] args) {
        System.out.println(str_is_printable(new char[]{'\0', 'B', 'C', 'D', 'E', 'f'}));
    }
}
