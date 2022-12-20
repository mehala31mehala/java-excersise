import java.lang.String;
public class maxminofarr {
    public static void main(String[] args) {
        int a[]={1,6,7,8,9};
        int max=a[0];
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
               max=a[i];
                if (a[i] < min) {
                    min = a[i];
                }
            }
        }
        System.out.println("largest number:"+max);
        System.out.println("smallest number:"+min);
    }
}