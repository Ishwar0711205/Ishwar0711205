import java.util.*;
public class Butterflypattern {
    public static void main(String[] args) {

//
//
////
////        Enter no you want
////        10
////                *                  *
////**                **
////***              ***
////****            ****
////*****          *****
////******        ******
////*******      *******
////********    ********
////*********  *********
////********************
////********************
////*********  *********
////********    ********
////*******      *******
////******        ******
////*****          *****
////****            ****
////***              ***
////**                **
////*                  *
////
////
////
////
////
////
////
////
//
////
////
////
//
//
//
//        int n ;
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter no you want ");
//        n = sc.nextInt();
////        for upper part
////        starting star
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            int spaces = 2 * (n - i);
//            for (int j = 1; j <= spaces; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        for (int i = n; i >= 1; i--) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            int spaces = 2 * (n - i);
//            for (int j = 1; j <= spaces; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//
//
////////
//////
//////        int n;
//////        Scanner sc = new Scanner(System.in);
//////        System.out.println("enter no you want ");
//////        n = sc.nextInt();
//////
//////
//////        for (int i = 1; i <= n; i++) {
//////            for (int j = 1; j <= i; j++) {
//////                System.out.print("*");
//////            }
//////            int space = 2 * (n - i);
//////            for (int j = 1; j <= space; j++) {
//////                System.out.print(" ");
//////            }
//////            for (int j = 1; j <= i; j++) {
//////                System.out.print("*");
//////            }
//////            System.out.println();
//////        }
//////
//////        for (int i = n; i >= 1; i--) {
//////            for (int j = 1; j <= i; j++) {
//////                System.out.print("*");
//////            }
//////            int space = 2 * (n - i);
//////            for (int j = 1; j <= space; j++) {
//////                System.out.print(" ");
//////            }
//////            for (int j = 1; j <= i; j++) {
//////                System.out.print("*");
//////            }
//////            System.out.println();
//////        }
//////int n=5;
//////
//////        for (int i = 1; i <= n; i++) {
//////
//////                int space = (n - i);
//////                for (int j = 1; j <= space; j++) {
//////                    System.out.print(" ");
//////                }  for (int j = 1; j <= n; j++) {
//////
//////                System.out.print("*");
//////            }
//////
//////            System.out.println();
//////        }
//////
////
////
////
////
//////
///////question
//////
//////        for otput
////
////
//////
//////        1
//////        2 2
//////        3 3 3
//////        4 4 4 4
//////        5 5 5 5 5
////
////
////
//////
//////
//////
//////
//////
//////        int n=5;
//////
//////        for (int i = 1; i <= n; i++) {
//////
//////            int space = (n - i);
//////            for (int j = 1; j <= space; j++) {
//////                System.out.print(" ");
//////            }  for (int j = 1; j <= i; j++) {
//////
//////                System.out.print(i+" ");
//////            }
//////
//////            System.out.println();
//////        }
////
////
////
////
////
//////
///////question
//////
//////        for otput
////
////
////
////
//////        1
//////        2 2
//////        3 3 3
//////        4 4 4 4
//////        5 5 5 5 5
////
////
////
////
//////        for(int i =1;i<=n;i++){
//////            for (int j=1; j<=n-i;j++){
//////                System.out.print(" ");
//////            }
//////            for (int j=1;j<=i;j++){
//////                System.out.print(i+" ");
//////            }
//////            System.out.println();
//////        }
////
////
////
////
////
////
//////
///////question
//////
//////        for otput
////
////
//////        1
//////        212
//////        32123
//////        4321234
//////        543212345
////
////
////
////
//////        for(int i =1;i<=n;i++){
//////            for (int j=1; j<=n-i;j++){
//////                System.out.print(" ");
//////            }
//////            for (int j=i;j>=1;j--){
//////                System.out.print(j);
//////            }
//////            for (int j=2;j<=i;j++){
//////                System.out.print(j);
//////            }
//////            System.out.println();
//////        }
//////
////
//////question
//////
//////        for otput
//////
//////        11
//////        2112
//////        321123
//////        43211234
//////        5432112345
//////
//////        for(int i =1;i<=n;i++){
//////            for (int j=1; j<=n-i;j++){
//////                System.out.print(" ");
//////            }
//////            for (int j=i;j>=1;j--){
//////                System.out.print(j);
//////            }
//////            for (int j=1;j<=i;j++){
//////                System.out.print(j);
//////            }
//////            System.out.println();
//////        }
////
////
////
////
////
////
////
////
////
////
////
////
////
////
////        int n ;
////        Scanner sc = new Scanner(System.in);
////
////        System.out.println("Enter no you want ");
////        n = sc.nextInt();
//////        for upper part
//////        starting star
////        for (int i = 1; i <= n; i++) {
////            int spaces = (n - i);
////            for (int j = 1; j <= spaces; j++) {
////                System.out.print(" ");
////            }
////            for (int j = 1; j <= i; j++) {
////                System.out.print("*");
////            }
////            for (int j=2;j<=i;j++){
////              System.out.print("*");
////            }
////
////            System.out.println();
////        }
////
////        for (int i = n; i >= 1; i--) {
////            int spaces =  (n - i);
////            for (int j = 1; j <= spaces; j++) {
////                System.out.print(" ");
////            }
////            for (int j = 1; j <= i; j++) {
////                System.out.print("*");
////            }
////            for (int j=2;j<=i;j++){
////                System.out.print("*");
////           }
////
////            System.out.println();
////        }
////
////
////
////        for (int i =1; i<=n;i++){
////            for (int j=1;j<=n-1 ;j++){
////                System.out.print(" ");
////            }
////            for (int j=1;j<=2*i-1;j++){
////                System.out.print("*");
////            }
////            System.out.println();
////        }
////        for (int i =n; i>=1;i++){
////            for (int j=1;j<=n-1 ;j++){
////                System.out.print(" ");
////            }
////            for (int j=1;j<=2*i-1;j++){
////                System.out.print("*");
////            }
////            System.out.println();
////        }
//    }
//}
//

Scanner sc=new Scanner (System.in);
int n=sc.nextInt();


        for (int i = n; i >= 1; i--) {
           for (int j = 1; j <= i; j++) {
             System.out.print("*");
            }   System.out.println();
        }



        for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i; j++) {
        System.out.print("*");
            }

                    System.out.println();
        }


//
//                for (int i = n; i <= 1; i++) {
//        for (int j = 1; j <= i; j++) {
//        System.out.print("*");
//            }System.out.println();
//        }


                }
                }
