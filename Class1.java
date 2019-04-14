public class MyClass {
    public static void main(String args[]) {
        MyClass o=new MyClass(11.5,12.5,13.5);
        double v=o.volume();
        System.out.print(v);
}
   
  double length;
  double breadth;
  double height;
  
   MyClass(double w,double b,double h)
   {
      this.length=w;
       this.breadth=b;
       this.height=h;
       
   }
   public double volume()
   {
       return(this.length*this.breadth*this.height);
   }
}
