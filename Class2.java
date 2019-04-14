public class MyClass {
    public static void main(String args[]) {
        int r1=powerInt(2,3);
        System.out.println(r1);
        double r2=powerDouble(2.2,3);
        System.out.println(r2);
}
 
 
  public static int powerInt(int num1,int num2)
  {
      return ((int)Math.pow(num1,num2));
  }
  public static double powerDouble(double num1,int num2)
  {
      return (Math.pow(num1,num2));
  }
}
