import java.lang.String;
public class dulplicatestring {
    public static void main(String[] args){
        String[] arr={"Mehala","Swetha","Bhuvii","THrani","Mehala","Swetha"};
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if((arr[i]==arr[j])&&(i!=j)){
                    System.out.println("duplicate Strings are:"+arr[j]);
                }
            }
        }
    }
}
