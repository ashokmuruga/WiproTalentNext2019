public class MyClass {
    public static void main(String args[]) {
    
    int num1=Integer.parseInt(args[0]);
   
    if(num1>0)
      System.out.print(num1+ "is positive");
    else if(num1<0)
      System.out.print(num1+ "is negative");
    else
      System.out.print(num1+ "is zero");
    
          }
}
