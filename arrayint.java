import java.lang.String;
public class arrayint {
    public static void main(String[] args) {
        int[] numbers = {6, 7, 9, 12, 3, 5, 17, 28, 14, 45, 10, 1, 2, 31};
        int max = numbers[0], min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
        for (int j = 0; j < numbers.length; j++) {
           if (numbers[i] > max) {
                    max = numbers[i];
           }
           if (numbers[j] < min) {
                    min = numbers[j];

                }
            }

        }
        System.out.println("maximum element is:" + max);
            System.out.println("minimum element is:" + min);
        }
    }
