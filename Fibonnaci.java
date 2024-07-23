import java.util.*;
public class Fibonnaci {
    public static void main(String[] args){
        int i,n,a=1,b=1,next;
        Scanner sc=new Scanner(System.in);
        System.out.println("how many terms you want :");
        n=sc.nextInt();
        System.out.println("Fibonnaci series :");
        System.out.print(+a);
        System.out.print("\t"+b);
        for (i=1;i<=n-2;i++)
        {
            next=a+b;
            System.out.print("\t"+next);
            a=b;
            b=next;
        }
    }
}
