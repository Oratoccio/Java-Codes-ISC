//Program to print telephone details
class Detail
{
    String name,address;
    int telno;
    double rent;
    Detail(String n,String a,int t,double r)
    {
        name=n;
        address=a;
        telno=t;
        rent=r;
    }
    void show()
    {
        System.out.println("Name:"+name);
        System.out.println("Address:"+address);
        System.out.println("Telephone Number:"+telno);
        System.out.println("Monthly Rent:"+rent);
    }
}
public class Bill extends Detail
{
    int n;
    double amt;
    Bill(String b,String a,int t,double r,int y)
    {
        super(b,a,t,r);
        n=y;
        amt=0.0;
    }
    void cal()
    {
        if(n>=1&&n<=100)
           amt=rent;
        else if(n>=101&&n<=200)
           amt=(n-100)*.6+rent;
        else if(n>=201&&n<=300)
           amt=(100*.6)+(n-200)*.8+rent;
        else if(n>300)
           amt=(100*.6)+(100*.8)+(n-300)*1.0+rent;
    }
    void show()
    {
        super.show();
        System.out.println("Number of calls="+n);
        System.out.println("Amount to pay="+amt);
    }
}
