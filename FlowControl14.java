public class MyClass {
    public static void main(String args[]) {
  
     int num=Integer.parseInt(args[0]);
    
    if(num==0 || num==1)
      System.out.print(num+"is neither prime nor composite");
    else
    {
     boolean flag = false;
        for(int i = 2; i <= num/2; ++i)
        {
            // condition for nonprime number
            if(num % i == 0)
            {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
    }
}
}
