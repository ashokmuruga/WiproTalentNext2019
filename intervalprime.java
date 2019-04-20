import java.io.*;
import  java.util.*;

// Read only region start
class UserMainCode
{

	public int countPrimesInRange(int input1,int input2){
		// Read only region end
		// Write code here...
		int c=0;
		 while (input1 < input2)
		 {
            boolean flag = false;

            for(int i = 2; i <= input1/2; ++i)
			{
                // condition for nonprime number
                if(input1 % i == 0)
				{
                    flag = true;
                    break;
                }
            }

            if (!flag)
                 ++c;
            ++input1;
        }
    return c;
	}
}
