package pa;
import java.io.*;

public class test_p34 {
	public static void main(String[] args)
	{
		if(args.length!=1)
		{
			System.out.println("請指定正確的檔案名稱");
			System.exit(1);
		}
		try 
		{	BufferedReader br = new BufferedReader (new FileReader(args[0]));
			String str1;
			while((str1=br.readLine())!=null)
			{
			System.out.println(str1);
			}
			br.close();
		} 
		catch(IOException e)
		{
			System.out.println("輸入輸出有誤");
		}
		
	}
}
