
public class Sample3_3 {
	public static void main(String[] args) {
		Car car1;
		car1 = new Car();
		car1.num = 1234;
		car1.gas = 20.5;

		Car car2;
		car2 = new Car();
		
		car2.num = 2345;
		car2.gas=30.5;
		
		System.out.println("car1�����O"+car1.num);
		System.out.println("car1�T�o�q�O"+car1.gas);

		System.out.println("car2�����O"+car2.num);
		System.out.println("car2�T�o�q�O"+car2.gas);

	}
}
class Car
{
	public static int sum=0;
	private int num;
	private double gas;
	private String name;
	public Car()
	{
		num=0;
		gas=0;
		name = "�S���W��";
		sum++;
		System.out.println("�Ͳ��F���l");
	}
	public Car(int n,double g)
	{	
		this();
		num=n;
		gas=g;
		System.out.println("�Ͳ��F������"+num+"�T�o�q��"+gas+"�����l");
	}
	public void show()
	{
		System.out.println("�����O"+num);
		System.out.println("�T�o�q�O"+gas);
		System.out.println("�W�r�O"+name);
	}
	public static void showSum()
	{
		System.out.println("���l�`�@��"+sum+"�x");
	}
	public void showCar() {
		
		System.out.println("�}�l��ܨ��l�����");
		this.show();
	}
	
	public void setNum(int n)
	{
		num = n;
		System.out.println("�N�����]��"+num);
	}
	public void setGas(double g)
	{
		gas = g;
		System.out.println("�N�T�o�q�]��"+gas);
	}
	public void setNumGas(int n,double g)
	{
		if(g>0&&g<100)
		{
		num = n;
		gas = g;
		System.out.println("�N�����]��"+num+"�T�o�q�]��"+gas);
		}
		else
		{
			System.out.println(g+"���O���T���T�o�q");
			System.out.println("��異��");
		}
			
	}
	public void setName(String nm)
	{
		System.out.println("�N�W�r�]��"+nm);
		name=nm;
		
	}
	public int getNum()
	{
		System.out.println("�լd����");
		return num;
	}
	public double getGas()
	{
		System.out.println("�լd�T�o�q");
		return gas;
	}
	public void setCar(int n,double g)
	{
		num=n;
		gas =g;
		System.out.println("�����O"+num);
		System.out.println("�T�o�q�O"+gas);
	}
	public void setCar(int n)
	{
		num=n;
		System.out.println("�����O"+num);

	}
	public void setCar(double g)
	{
		gas =g;
		System.out.println("�T�o�q�O"+gas);
	}
	
	
}
