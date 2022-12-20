import java.util.Scanner; import java.lang.String;
public class countvowels {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String line=input.nextLine();
        System.out.println("enter the string:");
        System.out.println("number of vowels:"+countvowels(line));
    }
       static int countvowels(String line){
        int count=0;
        for(int i=0;i<line.length();i++){
            if(line.charAt(i)=='a'||line.charAt(i)=='e'||line.charAt(i)=='i'||line.charAt(i)=='o'||line.charAt(i)=='u'){
                count++;
            }
        }return count;
    }
}
