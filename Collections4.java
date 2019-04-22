import java.util.*;
public class MyClass 
{
    public static void main(String args[]) 
    {
        Scanner scanner = new Scanner(System.in);
       // System.out.println("please enter an input");
        if(scanner.hasNextInt())
        {
        System.out.println("Entered input is integer");
        }
        else if(scanner.hasNext())
        {
         String string = scanner.nextLine();
         if(string.length()>1)
         {
            System.out.println("Entered input is String");
         }
        else
         {
          System.out.println("Entered input is Char");
         }
        }
        else
          System.out.print("NULL");
  }
}
    
