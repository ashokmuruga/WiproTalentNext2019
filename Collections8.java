public class Sample1
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
}

import java.util.*;
public class Sample 
{
    public static void main(String[] args) 
    {
        HashSet<Sample1> customers = new HashSet<Sample1>();
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
