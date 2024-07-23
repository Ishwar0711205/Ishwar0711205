import java.util.*;
public class MatMultiplication {
//
//    public static void main(String[] args)
//    {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the dimensions of the first matrix: ");
//        int m1 = sc.nextInt();
//        int n1 = sc.nextInt();
//        System.out.println("Enter the dimensions of the second matrix: ");
//        int m2 = sc.nextInt();
//        int n2 = sc.nextInt();
//        if (n1 != m2)
//        {
//            System.out.println("Matrix multiplication is not possible.");
//            sc.close();
//            return;
//        }
//        System.out.println("Enter the elements of the first matrix: ");
//        int[][] a = new int[m1][n1];
//        for (int i = 0; i < m1; i++)
//        {
//            for (int j = 0; j < n1; j++)
//            {
//                a[i][j] = sc.nextInt();
//            }
//        }
//        System.out.println("Enter the elements of the second matrix: ");
//        int[][] b = new int[m2][n2];
//        for (int i = 0; i < m2; i++)
//        {
//            for (int j = 0; j < n2; j++)
//            {
//                b[i][j] = sc.nextInt();
//            }
//        }
//
//        for (int i = 0; i < m1; i++)
//        {
//            for (int j = 0; j < n1; j++)
//            {
//                System.out.print(a[i][j]+" " );
//            }
//            System.out.println();
//        }
//
//        for (int i = 0; i < m2; i++)
//        {
//            for (int j = 0; j < n2; j++)
//            {
//                System.out.print(b[i][j] +" ");
//            }
//            System.out.println();
//        }
//        int[][] c = new int[m1][n2];
//        for (int i = 0; i < m1; i++)
//        {
//            for (int j = 0; j < n2; j++)
//            {
//                for (int k = 0; k < n1; k++)
//                {
//                    c[i][j] += a[i][k] * b[k][j];
//                }
//            }
//        }
//        System.out.println("Result of matrix multiplication:");
//        for (int i = 0; i < m1; i++)
//        {
//            for (int j = 0; j < n2; j++)
//            {
//                System.out.print(c[i][j] + " ");
//            }
//            System.out.println();
//        }
//    }


    public static void main(String[] args) {
        int i,j,m1,m2,n1,n2;
            Scanner sc=new Scanner(System.in);
        System.out.println("enter the dimmenssion of matrix a");
        m1=sc.nextInt();
        n1=sc.nextInt();
        System.out.println("enter the dimmenssion of matrix b");
        m2=sc.nextInt();
        n2=sc.nextInt();


        if (n1!=m2){
            System.out.println("the matrix is not posiible to multiplication");
            sc.close();
            return;
        }
        System.out.println("give the elements of matrix a");
            int [][]a= new int  [m1][n1];
            for (i=0;i<m1;i++){
                for (j=0;j<n1;j++){
                    a[i][j]=sc.nextInt();
                }
            }

        System.out.println("give the elements of matrix b");
        int [][]b= new int  [m2][n2];
        for (i=0;i<m2;i++){
            for (j=0;j<n2;j++){
                b[i][j]=sc.nextInt();
            }
        }
        int[][] c = new int[m1][n2];
        for ( i = 0; i < m1; i++)
        {
            for (j = 0; j < n2; j++)
            {
                for (int k = 0; k < n1; k++)
                {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        System.out.println("Result of matrix multiplication:");
        for (i = 0; i < m1; i++)
        {
            for (j = 0; j < n2; j++)
            {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

    }















}
