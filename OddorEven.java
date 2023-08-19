package Practice;

import java.util.Scanner;

public class OddorEven {
	public static void main(String[] args) {
		int x ;
		System.out.println("Enter the Number to check odd or even");
		
		Scanner in = new Scanner (System.in);
		x = in.nextInt();
		
		if (x %2 == 0)
		System.out.println("You entered Even Number");
		else
			System.out.println("You entered Odd Number");
	}
}
