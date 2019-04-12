public class MyClass {
    public static void main(String args[]) {
   
   char chr='A';
   
   if( (int)chr >=65 && (int)chr <=90 )
       System.out.print(chr+"->"+Character.toLowerCase(chr));
   else
       System.out.print(chr+"->"+Character.toUpperCase(chr));
   
}
}
