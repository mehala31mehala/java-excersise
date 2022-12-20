import java.util.Arrays;import java.lang.String;

public class additionmatrixex18 {
    public static void main(String[] args){
        int m1[][]={{1,2,3,4},{3,6,4,1},{6,7,9,1},{3,1,5,7}};
        int m2[][]={{2,3,1,5},{1,4,2,1},{3,6,0,1},{2,9,7,5}};
        int sum[][]=new int[4][4];
        int i,j;
        System.out.println("Elements of first matrix:");
        for(i=0;i<4;i++)
        {
        for(j=0;j<4;j++)
        {
        System.out.println(m1[i][j] + " ");
        }
        System.out.println();
        }
        System.out.println("elements of second matrix:");
        for(i=0;i<4;i++)
        {
        for(j=0;j<4;j++)
        {
        System.out.println(m2[i][j] + " ");
        }
         System.out.println() ;
         }
         System.out.println("addition of matrices:");
         for(i=0;i<4;i++)
         {
         for(j=0;j<4;j++)
         {
         sum[i][j]=m1[i][j]+m2[i][j];
         }
         }
         for(i=0;i<4;i++)
         {
         for(j=0;j<4;j++)
         {
         System.out.println(sum[i][j] + " ");
         }
         System.out.println();
         }

         }
         }

