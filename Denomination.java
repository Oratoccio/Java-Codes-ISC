//Program to print denomination of currency
import java.io.*;
public class Denomination
{
    public static void main(String args[])throws Exception
     {
         BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));
         System.out.print("Enter the amount:");
         int amt=Integer.parseInt(stdin.readLine());
         String s=""+amt;
         int l=s.length();
         if(l>5)
           System.out.println("INVALID AMOUNT");
           else
           {
               int n=amt;
               int rev=0,total=0,totaln=0,div;
               String word[]={"ZERO","ONE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE"};
               int notes[]={1000,500,100,50,20,10,5,2,1};
               while(n>0) //reverses the number
               {
                   rev=(rev*10)+(n%10);
                   n=n/10;
                }
                while(rev>0) //to print the number in words
                {
                    System.out.print(word[rev%10]+" ");
                    rev=rev/10;
                }
               System.out.println();
                System.out.println("DENOMINATION:");
                for(int i=0;i<9;i++) //to display denomination
                 {
                     div=amt/notes[i];
                     amt=amt%notes[i];
                     if(div>0)
                      {
                        System.out.println(notes[i]+"\tX\t"+div+"\t=\t"+(notes[i]*div));
                        total+=notes[i]*div;
                        totaln+=div;
                    }
                }
                 System.out.println("TOTAL="+total);
                  System.out.println("TOTAL NUMBER OF NOTES="+totaln);
          }
    }
 }