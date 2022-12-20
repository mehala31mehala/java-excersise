import java.lang.String;
public class commonex15 {
    public static void main(String[] args) {
        int[] a1 = {12, 13, 14, 15, 16, 25};
        int[] a2 = {12, 121, 32, 26, 21, 14, 15};
        for (int i = 0; i < a1.length; i++) {
        for (int j = 0; j < a2.length; j++) {
        if (a1[i] == a2[j]) {
        System.out.println("common integers:" + a1[i]);
        }
        }
        }
        }
        }