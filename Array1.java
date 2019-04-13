public class MyClass {
    public static void main(String args[]) {
         int[] a={11,21,33,44,55};
        int sum=0;
        for(int i=0;i<5;i++)
           sum=sum+a[i];
        float avg1=(float)sum/5;
        System.out.println("Sum="+sum);
        System.out.println("Average="+avg1);
    }
}
