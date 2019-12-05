package test_p44;

public class test_p44 {
	public static void main(String[] args)
	{
	Car car1 = new Car("1號車");
	Thread rh1 = new Thread(car1);
	rh1.start();
	for(int i=0;i<5;i++)
	{
		System.out.println("正在進行main的處裡工作");
			
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
				System.out.println("正在進行"+name+"的處裡工作");
			
		}
	}
	}
	
