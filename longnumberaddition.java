import java.io.*;
import  java.util.*;

// Read only region start
class UserMainCode
{

	public String addNumberStrings(String input1,String input2){
		// Read only region end
		// Write code here...
			if (input1.length() > input2.length()){ 
		String t = input1; 
		input1 = input2; 
		input2 = t; 
	} 

	// Take an empty String for storing result 
	String str = ""; 

	// Calculate lenght of both String 
	int n1 = input1.length(), n2 = input2.length(); 

	// Reverse both of Strings 
	input1=new StringBuilder(input1).reverse().toString(); 
	input2=new StringBuilder(input2).reverse().toString(); 

	int carry = 0; 
	for (int i = 0; i < n1; i++) 
	{ 
		// Do school mathematics, compute sum of 
		// current digits and carry 
		int sum = ((int)(input1.charAt(i) - '0') + 
					(int)(input2.charAt(i) - '0') + carry); 
		str += (char)(sum % 10 + '0'); 

		// Calculate carry for next step 
		carry = sum / 10; 
	} 

	// Add remaining digits of larger number 
	for (int i = n1; i < n2; i++) 
	{ 
		int sum = ((int)(input2.charAt(i) - '0') + carry); 
		str += (char)(sum % 10 + '0'); 
		carry = sum / 10; 
	} 

	// Add remaining carry 
	if (carry > 0) 
		str += (char)(carry + '0'); 

	// reverse resultant String 
	str = new StringBuilder(str).reverse().toString(); 

	return str; 
	}
}
