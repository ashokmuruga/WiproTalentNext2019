import java.io.*;
import  java.util.*;

// Read only region start
class UserMainCode
{

	public int findStringCode(String input1){
		// Read only region end
		// Write code here...
		String words[] = input1.split(" ");
    String result = "";

    for(String word : words)
    {
      result += String.valueOf(countSum(word));
    }

    //System.out.println("Sum for " + sentence + " is " + result);
      int r=Integer.parseInt(result);	
		return r;  
	}
	public static int countSum(String word)
 {

  String input = word.toLowerCase();
  int sum = 0;

  for( int i = 0; i < input.length()/2; i++)
  {
      int s = (input.charAt(i) - 'a') - (input.charAt(input.length() - 1 - i) - 'a');
      sum += Math.abs(s);
  }

  if(input.length()%2!=0)
  {
    sum += input.charAt(input.length()/2) - 'a' + 1;
  }

  return sum;

 }
	
}
