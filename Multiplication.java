//Program to perform matrix multiplication
import java.util.*;
public class Multiplication
{
    public static void main(String args[])
    {
        int m[][]=new int[4][4];
        int n[][]=new int[4][4];
        int p[][]=new int[4][4];
        int i,j,k;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements in the first array of 4x4 matrix:");
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            {
                m[i][j]=sc.nextInt();
            }
        }
        System.out.println("The elements in the first array of 4x4 matrix are:");
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            {
                System.out.print("\t"+m[i][j]);
            }
            System.out.println();
        }
        System.out.println("Enter the elements in the second array of 4x4 matrix:");
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            {
                n[i][j]=sc.nextInt();
            }
        }
        System.out.println("The elements in the second array of 4x4 matrix are:");
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            {
                System.out.print("\t"+n[i][j]);
            }
            System.out.println();
        }
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            {
                p[i][j]=0;
                for(k=0;k<4;k++)
                    p[i][j]=p[i][j]+m[i][k]*n[k][j];
            }
        }
        System.out.println("The product of two matrices are:");
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            {
                System.out.print("\t"+p[i][j]);
            }
            System.out.println();
        }
    }
}
