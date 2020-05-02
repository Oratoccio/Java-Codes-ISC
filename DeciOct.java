import java.util.*;
public class DeciOct
{
    int n,oct;
    static Scanner sc=new Scanner(System.in);
    public DeciOct()
    {
        n=0;oct=0;
    }
    public void getnum(int nn)
    {
        n=nn;
    }
    public void deci_oct()
    {
        int c;
        if(n!=0)
        {
            c=n%8;
            n=n/8;
            deci_oct();
            oct=(oct*10)+c;
        }
    }
    public void show()
    {
        System.out.println("Decimal number="+n);
        deci_oct();
        System.out.println("Octal equivalent="+oct);
    }
    public static void main(String args[])
    {
        System.out.println("Enter a decimal:");
        int v=sc.nextInt();
        DeciOct x=new DeciOct();
        x.getnum(v);
        x.show();
    }
}