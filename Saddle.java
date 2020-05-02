//A program for saddle point number
import java.util.*;
public class Saddle
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,j,k,max,f=0,min,c;
        System.out.println("Enter matrix size ");
        n=sc.nextInt();
        int a[][]=new int[n][n];
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.println("Enter Value");
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix elements are:");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        for(i=0;i<n;i++)
        {
            min=a[i][0];
            c=0;
            for(j=0;j<n;j++)
            {
                if(a[i][j]>min)
                {
                    min=a[i][j];
                    c=j;
                }
            }
            max=a[0][c];
            for(k=0;k<n;k++)
            {
                if(a[k][c]<max)
                {
                    max=a[k][c];
                }
                if(max==min)
                {
                    System.out.println("Saddle Point No. "+max);
                    f=1;
                }
            }
            if(f==0)
                System.out.println("No Saddle Point No. in the Matrix ");
        }
    }
}
