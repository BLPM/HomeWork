package pb;


public class test_p8 {
	public static void main(String[] args )
	{
		Car car1;
		car1 = new Car();
		try {
			car1.setCar(1234, -10);
			
		
		}
		catch (CarException e)
		{
			System.out.println("超過範圍");
			System.out.println("發生了"+e+"例外");
		
		}
		finally
		{
			System.out.println("最後一定執行");
		}
		System.out.println("成功");
	}

}
