import java.util.*;
public class Largest {
    public static void main(String[] args)
    {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt() ;
        if (a>b && a>c)
        {
            System.out.println("Largest number ;"+a);
        }
        else if(b>a && b>c)
        {
            System.out.println("Largest number ;"+b);
        }
        else
        {
            System.out.println("Largest number ;"+c);
        }
    }
}
