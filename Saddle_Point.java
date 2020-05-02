//Program to find saddle point and sort the matrix diagonally
import java.util.*;
public class Saddle_Point
{
    static int arr[][];
    void print()
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[i].length;j++)
                System.out.print("\t"+arr[i][j]);
            System.out.println();
        }
    }
    void saddle()
    {
        int n1=0,n2=0,k=0;
        for(int i=0;i<arr.length;i++)
        {
            n1=arr[i][0];
            for(int j=0;j<arr.length;j++)
               if(n1>arr[i][j])
                  n1=arr[i][k=j];
            n2=n1;
            for(int j=0;j<arr.length;j++)
               if(n2<arr[j][k])
                  n2=arr[j][k];
            if(n1==n2)
            {
                System.out.println("Saddle Point "+n1);
                n1=-1;break;
            }
        }
        System.out.print((n1!=-1)?"No Saddle Point \n":"");
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Saddle_Point ob=new Saddle_Point();
        System.out.println("Enter the value of n ?");
        int n=sc.nextInt();
        arr=new int[n][n];
        System.out.println("Enter the matrix elements:");
        for(int i=0;i<n;i++)
           for(int j=0;j<n;j++)
               arr[i][j]=sc.nextInt();
        System.out.println("Matrix A[][]");
        ob.print();
        ob.saddle();
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-1;j++)
                if(i==j)
                     if(arr[i][j]>arr[i+1][j+1])
                     {
                         int tmp=arr[i][j];
                         arr[i][j]=arr[i+1][j+1];
                         arr[i+1][j+1]=tmp;
                     }
        }
        System.out.println("Matrix after sorting the principal diagonals :");
        ob.print();
    }
}
