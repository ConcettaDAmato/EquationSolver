package equation;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class TryBufferdReader {

	private static void usingBufferedReader()
	{
	  System.out.println("Name:");
	  try{
	     BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
	     String inputString = bufferRead.readLine();
	      

	     System.out.println("Name entered : " + inputString);
	 }
	 catch(IOException ex)
	 {
	    ex.printStackTrace();
	 }
	}  

	public static void main(String[] args) {
		

		usingBufferedReader();
		System.out.println("End Of Computation");

	}

}