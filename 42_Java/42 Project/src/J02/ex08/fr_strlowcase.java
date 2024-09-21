package J02.ex08;

public class fr_strlowcase {
    public static char[] strlowcase(char[] str){
        int i = 0;
        while(i < str.length) {
            if('A' <= str[i] && str[i] <= 'Z')
                str[i] += 32;
            i++;
        }
        return str;
    }
    public static void main(String[] args) {
        System.out.println(strlowcase(new char[]{'A', 'B', 'C', 'D', 'E', 'F', '1'}));
    }
}
