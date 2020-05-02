//Program to interchange the 1st nd 4th row matrix elements
import java.util.*;
public class Interchange
{
   public static void main(String args[])
   {
        Scanner sc=new Scanner(System.in);
        int m[][]=new int[4][4];
        int i,j,t;
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
                System.out.print(m[i][j]+"\t");
            }
            System.out.println();
        }
        for(j=0;j<4;j++)
        {
            t=m[0][j];
            m[0][j]=m[3][j];
            m[3][j]=t;
        }
        System.out.println("The elements after swapping of matrix are:");
        for(i=0;i<4;i++)
        {
            for(j=0;j<4;j++)
            {
                System.out.print(m[i][j]+"\t");
            }
            System.out.println();
        }
   }
}
