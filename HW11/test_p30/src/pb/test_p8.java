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
			System.out.println("�W�L�d��");
			System.out.println("�o�ͤF"+e+"�ҥ~");
		
		}
		finally
		{
			System.out.println("�̫�@�w����");
		}
		System.out.println("���\");
	}

}
