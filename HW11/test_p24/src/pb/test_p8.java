package pb;


public class test_p8 {
	public static void main(String[] args )
	{
		try {
		int[] test;
		test = new int[5];
		System.out.println("�N����w��test[10]");
		test[10]=80;
		System.out.println("�N80���w��test[10]");
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("�W�L�d��");
		}
		finally
		{
			System.out.println("�̫�@�w����");
		}
		System.out.println("���\");
	}

}
