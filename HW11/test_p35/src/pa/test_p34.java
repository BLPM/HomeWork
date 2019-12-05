package pa;
import java.io.*;

public class test_p34 {
	public static void main(String[] args)
	{
		
		try 
		{
			FileWriter fw = new FileWriter("test.txt");
			PrintWriter pw =new PrintWriter(new BufferedWriter(fw));
			pw.println("GG大");
			pw.close();
			System.out.println("寫入");
		} 
		catch(IOException e)
		{
			System.out.println("輸入輸出有誤");
		}
		
	}
}
