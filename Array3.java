import java.util.*;

public class MyClass {
    public static void main(String args[]) {
        int a[]={1,4,34,56,7};
        int present=0,absent=0;
        Scanner inp=new Scanner(System.in);
        int num=inp.nextInt();
        
        for(int i=0;i<5;i++)
        {
            if(a[i]==num)
               present=i;
            else
               absent++;
        } 
        
        if(present>0)
           System.out.println(present);
        else
           System.out.println("-1");    
    }
}
