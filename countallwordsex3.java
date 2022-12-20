import java.util.Scanner;import java.lang.String;
public class countallwordsex3 {
    public static void main(String[] args){
        Scanner m=new Scanner(System.in);
        System.out.println("enter the string:");
        String x=m.nextLine();
        System.out.println(countwords(x));
    }
    static int countwords(String x ){
        int count=1;
        for(int i=0;i<x.length();i++){
            if(x.charAt(i)==' '){
                count++;

            }

        }
        return count;
    }
}
