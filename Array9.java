import java.util.*;
public class MyClass {
    public static void main(String args[]) {
         int[][] arr= new int[2][2];
         
         for(int i=0;i<2;i++)
          for(int j=0;j<2;j++)
             arr[i][j]=Integer.parseInt(args[2*i+j]);
         
         
        
        
         for(int j=1; j>=0; j--)
       {
           for(int i=1; i>=0; i--)
           {
               System.out.print(arr[j][i]+ "  ");
           }
           System.out.println();
       }
        
       
}
}
