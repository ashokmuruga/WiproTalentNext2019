public class MyClass {
    public static void main(String args[]) {
        int a[]={67,101,72,113,74};
        int temp;
           
                    for(int i = 0; i < 5; i++)
                    {

                     for(int j = i + 1; j < 5; j++)

                      {

                        if(a[i] < a[j])

                       {

                         temp = a[i];

                         a[i] = a[j];

                         a[j] = temp;

                      }

                    }

                 }
    
   System.out.println("Descending Order");
   for(int i=0;i<5;i++)
     System.out.println(a[i]);
     
   System.out.println("Ascending Order");
   for(int i=4;i>=0;i--)
     System.out.println(a[i]);
    }
}
