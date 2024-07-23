package RAYS;

import java.util.Scanner;

public class Greatest {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number to check greatest Number ");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		if (a>b && a>c)
		{
			System.out.println(a+" is the greatest");
		}
		else if (b>a && a>c)
		{
			System.out.println(b+" is the greatest");
		}
		else
		{
			System.out.println(c+" is the greatest");
		}
	}

}
