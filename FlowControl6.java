public class MyClass {
    public static void main(String args[]) {
    
    String str1=args[0];
    int age=Integer.parseInt(args[1]);
    
    if(str1.equals("Female")&&(age>=1)&&(age<=58))
      System.out.print("The percentage of interest is 8.2%");
    else if(str1.equals("Female")&&(age>=59)&&(age<=100))
      System.out.print("The percentage of interest is 9.2%");
    else if(str1.equals("Male")&&(age>=1)&&(age<=58))
      System.out.print("The percentage of interest is 8.4%");
    else
      System.out.print("The percentage of interest is 10.5%");
}
}
