//Program to display String Operations
import java.util.*;
public class StringOP
{
    String str,rev;
    StringOP()
    {
        str="";
        rev="";
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        str=sc.nextLine();
    }
    void process()
    {
        char b;
        int i,p;
        p=str.length();
        for(i=p-1;i>=0;i--)
        {
            b=str.charAt(i);
            rev=rev+b;
        }
        System.out.println("The reverse sentence: "+rev);
    }
    void find()
    {
        int w;
        StringTokenizer st=new StringTokenizer(str);
        w=st.countTokens();
        System.out.println("Number of words in sentence: "+w);
        System.out.println("Number of spaces in sentence: "+(w-1));
    }
    public static void main(String args[])
    {
        StringOP ob=new StringOP();
        ob.input();
        ob.process();
        ob.find();
    }
}
