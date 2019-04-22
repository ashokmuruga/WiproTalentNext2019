import java.util.*;
public class Sample 
{
    public static void main(String[] args) 
    {
        TreeSet<Sample1> customers = new TreeSet<Sample1>();
        customers.add(new Sample1("Rajeev"));
        customers.add(new Sample1("Sachin"));
        customers.add(new Sample1("Chris"));

        /*
          HashSet will use the `equals()` & `hashCode()` implementations 
          of the Customer class to check for duplicates and ignore them
        */
        customers.add(new Sample1("Rajeev1"));

        System.out.println(customers);
    }
}

public class Sample1 implements Comparable<Sample1>
{
	String name;
	
	Sample1(String name)
	{
		this.name=name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}

	@Override
    public String toString() 
	{
        return name; 
    }
	
	public int compareTo(Sample1 b)
	{  
		return this.getName().compareTo(b.getName());
	}
}
