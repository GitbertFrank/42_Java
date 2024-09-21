package J02.ex01;
public class ft_strncpy {
    public static char[] strncpy(char[] dest, char[] src, int n){
        int i = 0;
        while(i < src.length && i < n) {
            dest[i] = src[i];
            i++;
        }
        while(i <= n)
        {
            dest[i] = '\0';
            i++;
        }
        return dest;
    }    
    public static void main(String[] args) {
        char[] result = strncpy(new char[10], new char[]{'H', 'E', 'L', 'L', 'O'}, 8);
        System.out.println(result);
    }
}
