package pa;
import java.io.*;

public class test_p34 {
	public static void main(String[] args)
	{
		
		try 
		{
			FileWriter fw = new FileWriter("test.txt");
			PrintWriter pw =new PrintWriter(new BufferedWriter(fw));
			pw.println("GG�j");
			pw.close();
			System.out.println("�g�J");
		} 
		catch(IOException e)
		{
			System.out.println("��J��X���~");
		}
		
	}
}
