import java.util.*;  
public class TreeSet1
{  
 public static void main(String args[])
 {  
  //Creating and adding elements  
  TreeSet<String> al=new TreeSet<String>();  
 
  System.out.println(al.isEmpty());
  al.add("Ravi");  
  al.add("Vijay");  
  al.add("Ravi");  
  al.add("Ajay");  
  //Traversing elements  
  Iterator<String> itr=al.iterator();  
  while(itr.hasNext())
  {  
   System.out.println(itr.next());  
  } 
   
   Iterator<String> itr1=al.descendingIterator();  
   while(itr1.hasNext())
   {  
   System.out.println(itr1.next());  
   }  
    System.out.println(al.isEmpty());
 }  
}  
