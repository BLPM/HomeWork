package test_p44;

public class test_p44 {
	public static void main(String[] args)
	{
	Car car1 = new Car("1����");
	Thread rh1 = new Thread(car1);
	rh1.start();
	for(int i=0;i<5;i++)
	{
		System.out.println("���b�i��main���B�̤u�@");
			
	}

	}
}
	class Car implements Runnable
	{
		private String name;
		public Car(String nm)
		{
			name=nm;
		}
		public void run() {
			for(int i=0;i<5;i++)
			{
				System.out.println("���b�i��"+name+"���B�̤u�@");
			
		}
	}
	}
	
