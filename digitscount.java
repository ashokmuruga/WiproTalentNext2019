import java.io.*;
import  java.util.*;

// Read only region start
class UserMainCode
{

	public int allDigitsCount(int input1){
		// Read only region end
		// Write code here...
		int count=0;  
	while(input1 != 0)
        {
            // num = num/10
            input1 /= 10;
            ++count;
        }
    return count;

		
	}
}
