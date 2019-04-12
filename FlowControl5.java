public class MyClass {
    public static void main(String args[]) {
    
   char a=' ';
   
   if((int)a >=48 && (int)a <=57)
     System.out.print("Digit");
   else if(((int)a>=65&&(int)a<=90)||((int)a>=97&&(int)a<=122))
     System.out.print("Alphabet");
   else
     System.out.print("Special Character");
}
}
