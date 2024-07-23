import java.util.*;
public class Triangle {
    public static void main(String[] args)
    {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the values of three sides of triangle  ");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if (a+b>c && b+c>a && a+c>b) {
            System.out.println("triangle is valid :");
            if (a == b && b == c && c == a) {
                System.out.println("Equalitral traingle ");
            } else if (a == b || b == c || c == a) {
                System.out.println(" Isosceles Traingle");
            } else {
                System.out.println("Scalene Triangle ");
            }

        }
    }

}
