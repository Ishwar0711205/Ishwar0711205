import java.util.*;
public class Factorial1 {
//    static int factorial(int n) {
//
//        if (n == 0 || n == 1) {
//            return 1;
//        } else {
//        return n=n*factorial(n-1);
//        }
//
//    }

    static int factorial_literate(int n) {

        if (n == 0 || n == 1) {
            return 1;
        } else {
//            return n=n*factorial(n-1);

            int product=1;
            for(int i =1;i<=n;i++){
                product*=i;
            }
            return product;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.println("enter the value you want factorial ");
        x= sc.nextInt();
        System.out.println("the factorial of"+x+"is  "+factorial_literate(x));
    }
}