
import java.lang.String;
public class indexofarray {
    public static void main(String[] args) {
        int[] num = {10, 20, 30, 60, 80, 100};
        int index = 0,sum=0;
        double avg;
        for (int i = 0; i < num.length; i++) {
            sum=sum+num[i];
                if (num[i] == 80) {
                    index = i;
                }
            }
             avg=sum/num.length;
            System.out.println("average of an array elements:"+avg);
            System.out.println("position of 80 is :" + index);

        }
    }


