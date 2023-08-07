package Practice;

import java.util.Scanner;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		int x, y, z;
		System.out.println("Enter Numbers");
		Scanner sc = new Scanner(System.in);
		
		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();
		
		if(x> y && x> z)
		
			System.out.println("First Number is Largest");
		else if (y > x && y > z)
			System.out.println("Second Number is Largest");
		else if (z > x && z > y)
			System.out.println("Third Number is Largest");
		else
			System.out.println("Enetered Number are not distinct");
		
	}
}
