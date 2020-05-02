//A program to perform transpose of the given matrix
import java.util.*;
public class Tranarray
{ 
    int arr[][],m,n;
    Tranarray()
    {
        m=0;
        n=0;
    }
    Tranarray(int mm,int nn)
    {
        arr=new int[m=mm][n=nn];
    }
    void fillarray()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("       OUTPUT       ");
        System.out.println("Enter the matrix elements? ");
        arr=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
    }
    void transpose()
    {
        int c[][]=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                c[i][j]=arr[j][i];
            }
        }
        arr=c;
    }
    void disparray()
    {
        System.out.println("The transposed matrix is: ");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}