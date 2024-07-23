
package RAYS;
import java.util.*;

public class OddEven {

	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		a = sc.nextInt();
		if (a%2==0)
		{
			System.out.println("Number "+a+" is Even");
		}
		else
		{
			System.out.println("Number "+a+" is Odd");
		}
		
	}

}
