import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        int n, m, a = 0,x;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        m = n;
        while(n > 0)
        {
            x = n % 10;
            a = a * 10 + x;
            n = n / 10;
        }
        System.out.println(a);
    }
}
