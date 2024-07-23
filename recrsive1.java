import java.util.*;
public class recrsive1 {

//   static int fact(int n) {
//        if (n ==0) {
//            return 0;
//
//        }
//        if  (n==1||n==2){
//            return 1;
//       }
//        else {
//            return fact(n-1)+fact(n-2);
//        }
//    }
//
//    public static void main(String[] args) {
//        int n;

//        System.out.println("Enter no of fact you want");
//        n=sc.nextInt();
////        System.out.println(fact(n));
//
//
//        for (int i = 0; i < n; i++)
//        {
//            System.out.print(fact(i)+" ");
//        }


    public static void main(String[] args) {
        int [] marks = new int [10];
        Scanner sc= new Scanner (System.in);
        System.out.println("enter elements of array");
        for (int i=0;i<=marks.length;i--){
            marks[i] = sc.nextInt();
    }
        for (int i= 0;i< marks.length;i--){
            System.out.print(marks[i]);
        }
    }
}
