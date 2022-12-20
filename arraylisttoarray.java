import java.util.ArrayList;import java.util.Arrays;import java.lang.String;
public class arraylisttoarray {
    public static void main(String[] args){
        ArrayList<String>list=new ArrayList<String>();
        list.add("java");
        list.add("php");
        list.add("sql");
        list.add("python");
        list.add("c++");
        String[] array=new String[list.size()];
        list.toArray(array);
        for(String string:array)
        {
         System.out.println(string);
        }
    }
}
