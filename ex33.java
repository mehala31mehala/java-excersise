import java.lang.String;import java.util.Arrays;
public class ex33 {
    public static void main(String[] args) {
        int[] array = {20,20,30,40,50,50,50};
        System.out.println("oringinal array length:" + (array.length));
        System.out.println("array elements are:"+Arrays.toString(array));
        System.out.println("new length of the array:"+result(array));

    }

    static int result(int[] array) {
        int newindex = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] != array[i]) {
                array[newindex] = array[i];
                newindex++;
            }
        }
        return newindex;

    }
}