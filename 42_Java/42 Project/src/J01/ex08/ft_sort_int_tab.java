package J01.ex08;

public class ft_sort_int_tab {
    public static void sort_int_tab(int[] tab, int size){
        int temp;
        for (int j = 0; j < size - 1; j++) {
            for(int i = 0; i < size - j - 1; i++){
                if(tab[i] > tab[i + 1]){
                    temp = tab[i];
                    tab[i] = tab[i + 1];
                    tab[i + 1] = temp;
                }
            } 
        }
        
    }
    public static void main(String[] args) {
        int[] tab = {123, 2 , 3, 4, 5, 6, 71233};
        sort_int_tab(tab, 7);
        for (int i = 0; i < tab.length; i++)
            System.out.println(tab[i]);
    }
}
