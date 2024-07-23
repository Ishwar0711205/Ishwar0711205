package RAYS;

import java.util.Scanner;

public class constructibility {

	public static void main(String[] args) {
			int a,b,c;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number to check greatest Number ");
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			if (a==b && a==c)
			{
				System.out.println("Triangle is equilateral");
			}
			else if (a==b || a==c)
			{
				System.out.println("Triangle is isocelces");
			}
			else
			{
				System.out.println("Triangle is scalene");
			}
		}


	}

