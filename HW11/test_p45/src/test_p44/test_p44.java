package test_p44;

public class test_p44 {
	public static void main(String[] args)
	{
	Car car1 = new	Car("1號車");
	car1.start();
		
	Car car2 = new Car("2car");
	car2.start();
	for(int i=0;i<5;i++)
	{
		System.out.println("正在進行main的處裡工作");
	}
	}

}
class Car extends Thread
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