import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Sample3_16 {
	public static void main(String[] args) throws IOException
	{
		System.out.println("請輸入一整數");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int num = Integer.parseInt(str);
		System.out.println("輸入的數字是"+num);

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
		name = "沒有名稱";
		sum++;
		System.out.println("生產了車子");
	}
	public Car(int n,double g)
	{	
		this();
		num=n;
		gas=g;
		System.out.println("生產了車號為"+num+"汽油量為"+gas+"的車子");
	}
	public void show()
	{
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
		System.out.println("名字是"+name);
	}
	public static void showSum()
	{
		System.out.println("車子總共有"+sum+"台");
	}
	public void showCar() {
		
		System.out.println("開始顯示車子的資料");
		this.show();
	}
	
	public void setNum(int n)
	{
		num = n;
		System.out.println("將車號設為"+num);
	}
	public void setGas(double g)
	{
		gas = g;
		System.out.println("將汽油量設為"+gas);
	}
	public void setNumGas(int n,double g)
	{
		if(g>0&&g<100)
		{
		num = n;
		gas = g;
		System.out.println("將車號設為"+num+"汽油量設為"+gas);
		}
		else
		{
			System.out.println(g+"不是正確的汽油量");
			System.out.println("更改失敗");
		}
			
	}
	public void setName(String nm)
	{
		System.out.println("將名字設為"+nm);
		name=nm;
		
	}
	public int getNum()
	{
		System.out.println("調查車號");
		return num;
	}
	public double getGas()
	{
		System.out.println("調查汽油量");
		return gas;
	}
	public void setCar(int n,double g)
	{
		num=n;
		gas =g;
		System.out.println("車號是"+num);
		System.out.println("汽油量是"+gas);
	}
	public void setCar(int n)
	{
		num=n;
		System.out.println("車號是"+num);

	}
	public void setCar(double g)
	{
		gas =g;
		System.out.println("汽油量是"+gas);
	}
	
	
}