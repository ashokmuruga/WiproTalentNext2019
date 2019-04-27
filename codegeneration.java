import java.io.*;
import  java.util.*;

// Read only region start
class UserMainCode
{

	public int getCodeThroughStrings(String input1){
		// Read only region end
		// Write code here...
		String op=input1.replaceAll("[^a-zA-Z0-9]","");
        int m=op.length();
        int n,sum=0;
        while(m > 0)
        {
            n = m % 10;
            sum = sum + n;
            m = m / 10;
        }
		return sum;
		
	}
}
