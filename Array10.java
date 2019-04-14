
import java.util.*;
public class MyClass {
    public static void main(String args[]) {
         int[][] arr= new int[3][3];
         
         for(int i=0;i<3;i++)
          for(int j=0;j<3;j++)
             arr[i][j]=Integer.parseInt(args[3*i+j]);
         
         
          int max=0;
         for(int i=0;i<3;i++)
          for(int j=0;j<3;j++)
             if(arr[i][j] > max)
                 max=arr[i][j];
        
        
        System.out.print(max);
          
        
         
       
}
}
