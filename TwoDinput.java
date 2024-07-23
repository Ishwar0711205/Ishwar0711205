import java.util.*;
public class TwoDinput
{ public static void main(String args[])
{
    int a[][] = new int[100][100];
    int r,c,i,j,t;
    Scanner sc = new Scanner(System.in);
    System.out.println(" Enter number of rows and columns: ");
    r = sc.nextInt();
    c = sc.nextInt();
    System.out.println(" Enter of elements of the matrix ");
    for (i = 0; i < r; i++)
    {
        for (j = 0; j < c; j++)
        {
            a[i][j] = sc.nextInt();
        }
    }
    System.out.println(" The matrix: ");
    for (i = 0; i < r; i++)
    {
        for (j = 0; j < c; j++)
        {
            System.out.print(a[i][j] + " \t");
        }
        System.out.println();
    }
}
}
