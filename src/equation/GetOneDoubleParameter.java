package equation;
import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/** 
 * GetTwoDoubleParameters reads two double parameters from stIO. A very simple
 * class that uses a Buffered Reader.
 * 
 * @author Riccardo Rigon
 * @version 2/256 
 */

@SuppressWarnings("unused")
public class GetOneDoubleParameter {
	public double a;	
	/**
	 * set Parameter is used to get a parameter from StdIO. It uses the InputStreamReader
	 * and the Buffered Reader (a Decoration pattern) 
	 * 
	 * @param variableName
	 * @return doubleNumber
	 */
	public static double setParameterUsingBufferedReader(String name)
	{
	  System.out.println(name+": \n");
	  try{
	     BufferedReader bufferRead = new BufferedReader(
	    		 new InputStreamReader(System.in));
	     String inputString = bufferRead.readLine();
	     System.out.println(name+": " + inputString);
	     return Double.parseDouble(inputString);
	 }
	 catch(IOException ex)
	 {
	    ex.printStackTrace();
	 }
	 return 0.0;
	}  
			
	public static void main(String[] args) {
		double a;		
		System.out.println("This is the GetTwoDoubleParameters main( )");
		
		//Using BufferedReader v1
		System.out.println("Buffered reader v1");
		a= setParameterUsingBufferedReader("a");
		System.out.println("This is ends computation");

	}
}

