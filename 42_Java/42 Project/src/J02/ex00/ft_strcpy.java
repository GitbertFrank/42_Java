package J02.ex00;
public class ft_strcpy {
    public static char[] strcpy(char[] dest, char[] src){
        for (int i = 0; i < src.length; i++) {
            dest[i] = src[i];
        }
        return dest;
    }    
    public static void main(String[] args) {
        char[] result = strcpy(new char[5], new char[]{'H', 'E', 'L', 'L', 'O'});
        System.out.println(result);
    }
}
