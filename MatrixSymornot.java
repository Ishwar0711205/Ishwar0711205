import java.util.*;
public class MatrixSymornot {


//    39) Symmetric or not
//
//import java.util.*;
//    class Lab4b
//    {
//        public static void main(String args[])
//        {
//            Scanner sc = new Scanner(System.in);
//            int i, j, r, c, d =1;
//            System.out.println("Enter the number of rows of the matrix:");
//            r = sc.nextInt();
//            System.out.println("Enter the number of columns of the matrix:");
//            c = sc.nextInt();
//            int mat[][] = new int[r][c];
//
//            System.out.println("Enter the elements of the matrix:");
//            for (i = 0; i < r; i++)
//            {
//                for (j = 0; j < c; j++)
//                {
//                    mat[i][j] = sc.nextInt();
//                }
//            }
//
//            System.out.println("The original matrix:");
//            for (i = 0; i < r; i++)
//            {
//                for (j = 0; j < c; j++)
//                {
//                    System.out.print(mat[i][j] + " ");
//                }
//                System.out.println();
//            }
//
//            System.out.println("Transpose of the matrix:");
//            for (i = 0; i < c; i++)
//            {
//                for (j = 0; j < r; j++)
//                {
//                    System.out.print(mat[j][i] + " ");
//                }
//                System.out.println();
//            }
//
//            if (r == c)
//            {
//                for (i = 0; i < r; i++)
//                {
//                    for (j = 0; j < c; j++)
//                    {
//                        if (mat[i][j] != mat[j][i])
//                        {
//                            d = 0;
//                            break;
//                        }
//                    }
//                    if (d == 0)
//                    {
//                        break;
//                    }
//                }
//            }
//
//            if (d == 1)
//            {
//                System.out.println("Symmetric matrix");
//            }
//            else
//            {
//                System.out.println("Not a symmetric matrix");
//            }
//        }
//    }
//
//
//
//
//












    public static void main(String [] args ){
    int i,j,r,c,d=1;

    Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of rows matrix");
    r= sc.nextInt();
        System.out.println("Enter no of columns of matrix");
    c= sc.nextInt();
    int mat[][]=new int[r][c];

        System.out.println("enter elements of matrix");
    for(i=0;i< r;i++){
        for (j=0;j<c;j++){
            mat[i][j]=sc.nextInt();
        }
    }
        System.out.println("the original matrix is");
        for(i=0;i< r;i++){
            for (j=0;j<c;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("the transpot of matrix is ");
        for(i=0;i< c;i++){
            for (j=0;j<r;j++){
                System.out.print( mat[j][i]+" ");
            }
            System.out.println();
        }

//        System.out.println("reverse of matrix");
//        for(i=0;i< r;i++){
//            for (j=0;j<c;j++){
//                int temp;
//                System.out.println( " ");
//                temp =mat[i][j];
//                mat[i][j]=mat[j][i];
//                mat[j][i]=
//                temp;
//            }
//        }


        if(r==c){
            for(i=0;i<r;i++) {
                for (j = 0; j < c; j++) {
                    if (mat[i][j] != mat[j][i]) {
                        d = 0;
                        break;
                    }
                }

                if (d == 0) {
                    break;
                }
            }
        }
        if (d==1){
            System.out.println("matrix is symmertric");
        }
        else{
            System.out.println("matrix os not symmetric");
        }
    }
}