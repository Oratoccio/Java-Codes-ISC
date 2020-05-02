//Program to rearrange a String
import java.util.*;
public class Rearrange
{
    Scanner sc=new Scanner(System.in);
    String Txt,Cxt;
    int len;
    public Rearrange()
    {
        Txt=null;
        Cxt=null;
        len=0;
    }
    public void readword()
    {
        System.out.println("Enter the word in UPPERCASE:");
        Txt=sc.nextLine();
        len=Txt.length();
    }
    public void convert()
    {
        int f=-1;char c;
        for(int i=0;i<len;i++)
        {
            c=Txt.charAt(i);
            if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
            {
                f=i;
                break;
            }
        }
        if(f==-1)
           Cxt=Txt+"N";
        else if(f==0)
           Cxt=Txt+"Y";
        else
        {
            String d=Txt.substring(f,len);
            String e=Txt.substring(0,f);
            Cxt=d+e+"C";
        }
    }
    public void display()
    {
        System.out.println("Original word= "+Txt);
        System.out.println("Changed word= "+Cxt);
    }
    public static void main(String args[])
    {
        Rearrange x=new Rearrange();
        x.readword();
        x.convert();
        x.display();
    }
}