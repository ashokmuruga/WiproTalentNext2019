import java.util.*;
public class MyClass {
    public static void main(String args[]) 
    {
        Vector<String> arrlist1 = new Vector<String>(12);
        arrlist1.add("January");
        arrlist1.add("February");
        arrlist1.add("March");
        arrlist1.add("April");
        arrlist1.add("May");
        arrlist1.add("June");
        arrlist1.add("July");
        arrlist1.add("August");
        arrlist1.add("September");
        arrlist1.add("October");
        arrlist1.add("November");
        arrlist1.add("December");
        
        Iterator itr=arrlist1.iterator();
        while(itr.hasNext())
        {
         System.out.println(itr.next());
        } 
    }
}
