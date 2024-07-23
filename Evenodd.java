import java.util.Scanner;

public class Evenodd {
    public static void main(String[] args){
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no you want :");
        num=sc.nextInt();
        if(num%2==0)
        {
            System.out.println("Number is even ");
        }
        else
        {
            System.out.println("Number is odd ");
        }
    }
}
