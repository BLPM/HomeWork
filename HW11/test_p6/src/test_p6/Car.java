package test_p6;

public class Car {
private int num;
private double gas;
public Car()
{
	num=0;
	gas=0.0;
	System.out.println("已生產車");
	}
public void setCar(int n,double g)
{
	num = n;
	gas = g;
	System.out.println("將車號設為:"+num+"汽油量設為"+g);
	
}
public void show()
{
	System.out.println("車號是"+num);
	System.out.println("汽油量為"+gas);
	}
}
