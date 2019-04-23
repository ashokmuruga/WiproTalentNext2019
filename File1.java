import java.io.*;
import java.util.Scanner;


public class file1 {
    public static void main(String[] args)throws IOException
    {

        String fileName = "C:\\Users\\TCS\\eclipse-workspace\\Twest\\src\\one.txt";
        String line = "";
        Scanner scanner = new Scanner(new FileReader(fileName));
        try
        {
            int counter = 0;
            while ( scanner.hasNextLine() )
            {
              line = scanner.nextLine();
              for( int i=0; i<line.length(); i++ )
              {
                if( line.charAt(i) == 'a' )
                {
                    counter++; 

                } 
              }

             System.out.println(counter);   
          }
        }
        finally
        {

          scanner.close();
        }
        }
    }
