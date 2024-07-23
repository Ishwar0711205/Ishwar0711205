package RAYS;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		int a,temp=1,rev=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check if its palindrome ");
		a = sc.nextInt();
		temp=a;
		while (temp>0)
		{
			rev=temp%10;
			temp=temp/10;		
		}
		if (a==rev)
		{
			System.out.println("Number "+a+"  is a palindrome");
		}
		else
		{
			System.out.println("Number "+a+"  is not a palindrome");
		}
	}


}
