import java.io.*;
import  java.util.*;
import java.math.*;

// Read only region start
class UserMainCode
{

	public int NthPrime(int input1){
		// Read only region end
		// Write code here...
		BigInteger prime = BigInteger.valueOf(0);
for (int i = 0; i < input1; i++)
    prime = prime.nextProbablePrime();
int r=prime.intValue();
	return r;
		
	}
}
