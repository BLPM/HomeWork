public class test_p41{
    public static void main(String[] args)
    {
        car car1= new car();
        car1.vshow();
        car1.mShow();




    }
}
interface iVehicle
{
    void vshow();
}
interface iMaterial
{
    void mShow();
}
abstract class  Vehicle
{
    protected int speed;
    public void setSpeed(int s)
    {
        speed=s;
        System.out.println("將速度設為"+speed);
    }
    abstract void show();
}
class Plane implements   iVehicle
{
    private int flight;
    public Plane(int f)
    {
        flight=f;
        System.out.println("生產了"+flight+"班次的飛機");
    }
    public void vshow()
    {
        System.out.println("飛機的班次是"+flight);
    }
}
class car implements iVehicle,iMaterial
{
    protected int Num;
    protected double gas;
    public car()
    {
        Num=0;
        gas=0.0;
        System.out.println("生產了車子");
    }
    public car(int n,double g)
    {
        Num=n;
        gas=g;
        System.out.println("生產了一輛車號為"+Num+"汽油量為"+gas+"的車子");
    }
    public void setcar(int n,double g)
    {
        Num=n;
        gas=g;
        System.out.println("將車號設為"+Num+"汽油量設為"+gas);
    }
    public void vshow()
    {
        System.out.println("車號為"+Num);
        System.out.println("汽油量為"+gas);
    }
    public void mShow()
    {
        System.out.println("車子的材料是鐵");
    }
    public String toString()
    {
        String str = "車號"+Num+";汽油量" +gas;
        return str;
    }
}
class  RacingCar extends car
{
    private int course;
    public RacingCar()
    {
        super();
        course=0;
        System.out.println("生產了賽車");
    }
    public RacingCar(int n,double g,int c)
    {
        super(n,g);
        course=c;
        System.out.println("生產了一輛編號為"+course+"的賽車");
    }
    public void setCourse (int c )
    {
        course= c;
        System.out.println("將賽車編號改為"+course);
    }
    public void show()
    {
        System.out.println("車號為"+Num);
        System.out.println("汽油量為"+gas);
        System.out.println("賽車編號是"+course);
    }
}

