import java.lang.String;
public class recursfact {
    public static void main(String[] args) {
        int n = 8;
        System.out.println(n);
        System.out.println(fact(n));
    }

    static int fact(int n) {
        for (int i = 1; i <n; i++) {
            return n * (n - 1);
        }
        return 0;
    }
    }