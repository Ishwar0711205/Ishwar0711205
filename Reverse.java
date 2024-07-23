package RAYS;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		int a,temp=1,rev=1,t=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check if its palindrome ");
		a = sc.nextInt();
		temp=a;
		while (temp>0)
		{
			rev=temp%10;
			
			temp=temp/10;		
		}
		System.out.println("The number is reversed: "+rev);
	}

}
