import java.util.*;

public class ArraySum {
    public static void main(String[] args){
        int [][] m =new int[10][10];
        int i,j,r,c,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of matrix ");
        r=sc.nextInt();
        c=sc.nextInt();
        System.out.println("Enter element of matrix ");

        for (i=0;i<r;i++)
        {
            for (j=0;j<c;j++){
                m[i][j]=sc.nextInt();   //executed r*c
            }
        }
        System.out.println("Matrix");

        for(i=0;i<r;i++) {
            for (j = 0; j < c; j++) {
                System.out.println(m[i][j] + "\t");
                System.out.println("  sum " + m[i][j]);



            System.out.println("sum=" + sum);
            }
        }


            }
        }

