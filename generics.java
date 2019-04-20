class Test<T, U> 
{ 
    T obj1,obj3,obj4,obj5;  // An object of type T 
    U obj2;  // An object of type U 
  
    // constructor 
    Test(T obj1, U obj2) 
    { 
        this.obj1 = obj1; 
        this.obj2 = obj2; 
          this.obj3 = obj3; 
            this.obj4 = obj4; 
              this.obj5 = obj5; 
    } 
  
    // To print objects of T and U 
    public void print() 
    { 
        System.out.println(obj1); 
        System.out.println(obj2); 
        System.out.println(obj3); 
        System.out.println(obj4);
        System.out.println(obj5); 
        
    } 
} 
  
// Driver class to test above 
public class Main 
{ 
    public static void main (String[] args) 
    { 
        Test<String,String,Integer,String,String>  obj = 
            new Test<String,String,Integer,String,String> ("Ashok","Murugesan",766747,"ashok.m@ritchennai.edu.in","Chennai"); 
  
        obj.print(); 
    } 
}
