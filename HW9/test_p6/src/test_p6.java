public class test_p6{
    public static void main(String[] args)
    {
        RacingCar rccar1 = new RacingCar(1234,20.5,5);
    }
}
class car
{
    private int Num;
    private double gas;
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
    public void show()
    {
        System.out.println("車號為"+Num);
        System.out.println("汽油量為"+gas);
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
}
