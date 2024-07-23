import java.util.*;
public class Function1 {
//    public static void printMyName(String name ){
//        System.out.println(name);
//        return;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter your name ");
//     String name =sc.next();
//
//     printMyName(name);//call lyu function ko
//    }

//    public static int additionOfNumber(int a, int b) {
//        int sum = a + b;
//
//        return sum;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a;
//        int b;
//        System.out.println("enter two number you want ");
//        a = sc.nextInt();
//        b = sc.nextInt();
//        int sum = additionOfNumber(a, b);
//        System.out.println("the sum of two no is " + sum);


//    public static int multiplication(int a, int b) {
//        int multply = a * b;
//
//        return multply;
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a;
//        int b;
//        System.out.println("enter two number you want ");
//        a = sc.nextInt();
//        b = sc.nextInt();
//        int multply = multiplication(a, b);
//        System.out.println("the multplication of two no is " + multply);


    public static void  factorial(int n){
        if (n<0) {
            System.out.println("invalid");

            return;
        }
        int fact =1;
        for (int i=n;i>=1;i--){
            fact =fact*i;

        }
        System.out.println(fact);

    return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter number you want to find factorial ");
        n=sc.nextInt();

        factorial(n);




    }
}









