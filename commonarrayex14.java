import java.lang.String;
public class commonarrayex14 {
    public static void main(String[] args){
        String[] arr1={"java","php","sql","javascript"};
        String[] arr2={"java","sql","python","angular","php"};
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if((arr1[i]==arr2[j])){
                    System.out.println("common elements:"+arr1[i]);
                }
            }
        }
    }
}
