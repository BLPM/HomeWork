package pa;
import java.io.*;

public class test_p34 {
	public static void main(String[] args)
	{
		
		try 
		{
			BufferedReader br = new BufferedReader (new FileReader("..\\test_p35\\test.txt"));
			String str1=br.readLine();
			System.out.println(str1);
			br.close();
		} 
		catch(IOException e)
		{
			System.out.println("¿é¤J¿é¥X¦³»~");
		}
		
	}
}
