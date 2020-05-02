//Program to calculate an employee's salary
class Worker
{
    protected String Name;
    protected double Basic;
    public Worker(String z,double k)
    {
        Name=z;
        Basic=k;
    }
    public void display()
    {
        System.out.println("Name: "+Name);
        System.out.println("Basic Pay: "+Basic);
    }
}
public class Wages extends Worker
{
    int hrs;
    double rate,wage;
    public Wages(String a,double b,int c,double d)
    {
        super(a,b);
        hrs=c;
        rate=d;
        wage=0.0;
    }
    public double overtime()
    {
        return(rate*hrs);
    }
    public void display()
    {
        double x=overtime();
        wage=x+Basic;
        super.display();
        System.out.println("Wage= "+wage);
    }
}
