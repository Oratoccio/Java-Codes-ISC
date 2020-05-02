//Program to check validity of date
import java.util.*;
public class Validation
{
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       int i,d,m,y,f=1,s=0;
       int nod[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
       System.out.println("Enter your date of birth in dd, mm, yyyy format");
       d=sc.nextInt();
       m=sc.nextInt();
       y=sc.nextInt();
       if(m>12)
           f=0;
       if(m==2)
       {
           if(y%4==0)
             if(d>29)
                f=0;
             else
                   if(d>28)
                   f=0;
           }
           if(m==1||m==3||m==5||m==8||m==10||m==12)
           {
               if(d>31)
                 f=0;
           }
           else
           {
               if(d>30)
                 f=0;
           }
           if(f==1)
           {
               System.out.println("Date is valid");
               i=1;
               while(i<m)
               {
                   s=s+nod[i];
                   i++;
               }
               s=s+d;
               System.out.println("Day of the year:"+s);
           }
           else
           System.out.println("Invalid date");
   }
}
