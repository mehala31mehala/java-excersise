import java.util.Arrays;
import java.util.ArrayList;import java.lang.String;
public class arraytoarrlistex20 {
    public static void main(String[] args) {
        String[] arr = {"java", "php", "sql"};
        ArrayList<String> list = new ArrayList<String>(Arrays.asList(arr));

        System.out.println(list);
    }
}