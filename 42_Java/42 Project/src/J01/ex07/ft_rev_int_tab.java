package J01.ex07;

public class ft_rev_int_tab {
    public static void rev_int_tab(int[] tab, int size){
        int temp;
        int j;
        j = size - 1;
        for(int i = 0; i < size / 2; i++){
            temp = tab[i];
            tab[i] = tab[j];
            tab[j] = temp;
            j--;
        } 
        
    }
    public static void main(String[] args) {
        int[] tab = {123, 2 , 3, 4, 5, 6, 71233};
        rev_int_tab(tab, 7);
        for (int i = 0; i < tab.length; i++)
            System.out.println(tab[i]);
    }
}
