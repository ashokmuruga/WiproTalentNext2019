import java.util.*;

public class Multi extends Thread
{  
public void run()
{  
 String colours[]={"white","blue","black","green","red","yellow"};
  /*Random r=new Random();
  int ra=r.nextInt(colours.length);
  System.out.print(colours[ra]);*/
 for(int i=0;i<colours.length;i++)
  {
      Random r=new Random();
  int ra=r.nextInt(colours.length);
  
  if(colours[ra].equals("red"))
      {
      System.out.println("Red captured");
      break;
      }
  else
    System.out.println(colours[ra]);
  }
}  

public static void main(String args[])
{  
Multi t1=new Multi();  
t1.start();  
 }  
}  
