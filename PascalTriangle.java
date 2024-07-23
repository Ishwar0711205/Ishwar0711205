import java.util.*;

public class PascalTriangle {

//    public static void main(String[] args)
//    {
//        int rows,i,j,k,x =1;
//        Scanner sc = new Scanner(System.in);
//        System.out.println(" Enter the number of rows ");
//        rows = sc.nextInt();
//        for (i = 1; i <= rows; i++)
//        {
//            for (j = 1; j <= rows -1; j++)
//            {
//                System.out.print("  ");
//            }
//            x = 1;
//            for (k = 1; k <= i; k++)
//            {
//                System.out.print(x +" ");
//                x = x*(i-k)/k;
//            }
//            System.out.println();
//        }
//    }}
//
//    public static void main(String[] args) {
//
//
//        int rows, i, j, k, x = 1;
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("enter roes you want ");
//        rows=sc.nextInt();
//
//        for(i=1;i<=rows;i++){
//            for ( j=1;j<=rows;j++){
//                System.out.print(" ");
//            }
//
//        }
//
//         x=1;
//        for (k=1;k<=i;k++){
//            System.out.print(x+" ");
//            x=x*(i-k)/k;
//        }
//        System.out.println();
//
//    }

//
//
//


    public static void main(String[] args) {
        int n, i, j, k, x = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no you want ");

        n = sc.nextInt();
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n - 1; j++) {
                System.out.print(" ");
            }


            x = 1;
            for (k = 1; k <= i; k++) {
                System.out.print(x + " ");
                x = x * (i - k) / k;
            }
            System.out.println();
        }
    }

}



