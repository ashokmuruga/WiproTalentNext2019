import java.util.*;
public class MyClass {
    public static void main(String args[]) {
  
   int n, num = 1, c, d;
    Scanner in = new Scanner(System.in);
 
   
    n = in.nextInt();
 
    System.out.println("Floyd's triangle:");
 
    for (c = 1; c <= n; c++)
    {
      for (d = 1; d <= c; d++)
      {
        System.out.print("*"+" ");
        num++;
      }
 
      System.out.println(); // Moving to next row
    }
}
}
