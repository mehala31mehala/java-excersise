import java.lang.String;
public class diffmaxminex28 {
    public static void main(String[] args){
    int[] array={1,3,5,6,8,9,2};
    int max=array[0];
    int min=array[0];
    for(int i=1;i<array.length;i++){
    if(array[i]>max)
   max= array[i];
    else if(array[i]<min)
    min= array[i];
    }

    System.out.println("difference of largest and smallest number:"+(max-min));
    }
}
