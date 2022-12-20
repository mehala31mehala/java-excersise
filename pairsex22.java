import java.util.Arrays;import java.lang.String;
public class pairsex22 {
    static void pairsvalue(int inputarr[],int inputnum) {
        System.out.println("pairs of elements and their sum");
        for (int i = 0; i < inputarr.length; i++) {
        for (int j = i + 1; j < inputarr.length; j++) {
        if (inputarr[i] + inputarr[j] == inputnum) {
        System.out.println(inputarr[i] + " +" + inputarr[j] + "=" + inputnum);
        }
        }
        }
        }
        public static void main(String[] args){
        pairsvalue( new int[] {2, 7, 4, -5, 11, 5, 20}, 15);
        }
    }

