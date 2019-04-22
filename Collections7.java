import java.util.*;

public class Employee
{  
    int empId;
    String empName;
    String email;
    String gender;
    float salary;
    
    Employee(int empId,String empName,String email,String gender,float salary)
    {
        this.empId=empId;
        this.empName=empName;
        this.email=email;
        this.gender=gender;
        this.salary=salary;
    }
 
 public static void main(String args[])
 {  
  //Creating user-defined class objects  
  Employee s1=new Employee(101,"Sonoo","sonoo@gmail.com","Female",35000);  
  Employee s2=new Employee(102,"Anu","anu@gmail.com","Female",35020);
  
  //creating arraylist  
  Vector<Employee> al=new Vector<Employee>();  
  al.add(s1);//adding Student class object  
  al.add(s2);  
  //al.add(s3);  
  //Getting Iterator  
  Iterator itr=al.iterator();  
  //traversing elements of ArrayList object  
  while(itr.hasNext())
  {  
    Employee st=(Employee)itr.next();  
    System.out.println(st.empId+" "+st.empName+" "+st.email+" "+st.gender+" "+st.salary);  
  }  
 }  
}  
 
