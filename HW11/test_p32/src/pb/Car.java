package pb;

public class Car {
private int num;
private double gas;
public Car()
{
	num=0;
	gas=0.0;
	System.out.println("�w�Ͳ���");
	}
public void setCar(int n,double g) throws CarException
{
	if(g<0)
	{
		CarException e = new CarException();
		throw e ;
	}else
	{num = n;
	gas = g;
	System.out.println("�N�����]��:"+num+"�T�o�q�]��"+g);
	}
}
public void show()
{
	System.out.println("�����O"+num);
	System.out.println("�T�o�q��"+gas);
	}
}