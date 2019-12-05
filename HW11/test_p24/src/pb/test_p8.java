package pb;


public class test_p8 {
	public static void main(String[] args )
	{
		try {
		int[] test;
		test = new int[5];
		System.out.println("將質指定給test[10]");
		test[10]=80;
		System.out.println("將80指定給test[10]");
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("超過範圍");
		}
		finally
		{
			System.out.println("最後一定執行");
		}
		System.out.println("成功");
	}

}
