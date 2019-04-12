public class MyClass {
    public static void main(String args[]) {
   
    String str1=args[0];
    char s=str1.charAt(0);
    
    switch(s)
    {
        case 'R':
            System.out.print("Red");
            break;
        case 'B':
            System.out.print("Blue");
            break;
        case 'G':
            System.out.print("Green");
            break;
        case 'O':
            System.out.print("Orange");
            break;
        case 'Y':
            System.out.print("Yellow");
            break;
        case 'W':
            System.out.print("White");
            break;
        default:
            System.out.print("Invalid Code");
            break;
    }
   
}
}
