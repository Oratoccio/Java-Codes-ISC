//To display the elements of a square matrix in circular fashion
import java.util.*;
public class Matrix
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,r1,r2,c1,c2,k=1,i,j;
        System.out.println("Enter the size of the matrix:");
        n=sc.nextInt();
        int a[][]=new int[n][n];
        c1=0;c2=n-1;r1=0;r2=n-1;
        do
        {
            for(i=c1;i<=c2;i++)
            {
                a[r1][i]=k;
                k++;
            }
            for(j=r1+1;j<=r2;j++)
            {
                a[j][c2]=k;
                k++;
            }
            for(i=c2-1;i>=c1;i--)
            {
                a[r2][i]=k;
                k++;
            }
            for(j=r2-1;j>=r1+1;j--)
            {
                a[j][c1]=k;
                k++;
            }
            c1++;c2--;r1++;r2--;
        }while(k<=n*n);
        System.out.println("Circular matrix is listed below:");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
                System.out.print(a[i][j]+"\t");
            System.out.println();
        }
    }
}
