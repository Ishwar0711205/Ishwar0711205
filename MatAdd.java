import java.util.*;
public class MatAdd {
    public static void main(String args[]) {
        int a[][] = new int[10][10];
        int b[][] = new int[10][10];
        int c[][] = new int[10][10];

        int i, j, r1, c1, r2, c2;
        int r3, c3, k;
        //k is requird incase of multiplication .

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of matrix 1 :");
        r1 = sc.nextInt();
        c1 = sc.nextInt();

        System.out.println("Enter size of matrix 2:");
        r2 = sc.nextInt();
        c2 = sc.nextInt();

        if ((r1 == r2) && (c1 == c2)) {
            System.out.println("Enter elements of matrix 1:");
            for (i = 0; i < r1; i++) {
                for (j = 0; j < c1; j++) {
                    a[i][j] = sc.nextInt();
                }
            }

            System.out.println("Enter elements of matrix 2:");
            for (i = 0; i < r2; i++) {
                for (j = 0; j < c2; j++) {
                    b[i][j] = sc.nextInt();
                }
            }

            r3=sc.nextInt();
            c3=sc.nextInt();
            System.out.println("Result:");
            for (i = 0; i < r3; i++) {
                for (j = 0; j < c3; j++) {
                    System.out.print(c[i][j] + "\t");

                }
                System.out.println(" ");
            }
        }
        else {
            System.out.println("operation invalid");
        }
        }
    }
