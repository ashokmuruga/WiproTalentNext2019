public class TestMultiNaming1 extends Thread
{  
  public void run()
  {  
   try
   {
   for(int i=1;i<=10;i++)
    {
        if(i==6)
           Thread.sleep(5000);
        System.out.println(i);   
    }
   }
   catch(Exception e)
   {
       System.out.println(e);
   }
  }  
 public static void main(String args[]) 
 {  
  TestMultiNaming1 t1=new TestMultiNaming1();  
  t1.start();  
  }  
}  
