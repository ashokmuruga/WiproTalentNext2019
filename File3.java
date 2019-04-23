import java.io.*;
import java.util.*;
public class data {

	public static void main(String[] args) {
		
				try{
					
					
					//Creating the BufferedReader to read the file
					File textFile = new File("C:\\Users\\TCS\\eclipse-workspace\\Twest\\src\\one.txt");
					BufferedReader input = new BufferedReader(new FileReader(textFile));
					
					//Creating the Map to store the words and their occurrences
					TreeMap<String, Integer> frequencyMap = new TreeMap<String, Integer>();
					String currentLine = null;
					
					//Reading line by line from the text file
					while((currentLine = input.readLine()) != null){
						
						//Parsing the words from each line
						StringTokenizer parser = new StringTokenizer(currentLine, " \t\n\r\f.,;:!?'\""); 
						while(parser.hasMoreTokens()){
							String currentWord = parser.nextToken();
							
							Integer frequency = frequencyMap.get(currentWord); 
							if(frequency == null){
								frequency = 0;						
							}
							//Putting each word and its occurrence into Map 
							frequencyMap.put(currentWord, frequency + 1);
						}
						
					}
					
					//Displaying the Result
					System.out.println(frequencyMap);
					
				}catch(IOException ie){
					ie.printStackTrace();
					System.err.println("Your entered path is wrong");
				}		
				
	}

}
