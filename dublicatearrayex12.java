import java.lang.String;
public class dublicatearrayex12 {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 5, 6, 7, 7, 8, 5, 1};
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if ((array[i] == array[j]) && (i != j)) {
                    System.out.println("dublicates are:" + array[j]);
                }
            }
        }
    }
}