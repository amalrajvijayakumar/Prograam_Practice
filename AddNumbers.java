package Practice;

import java.math.BigInteger;
import java.util.Scanner;

public class AddNumbers {

	public static void main(String[] args) {
		AddNumbers an = new AddNumbers();
		an.addnumbers();
		an.addOfBigNumbers();
		}
		

	private void addOfBigNumbers() {
		// TODO Auto-generated method stub
		String num1, num2;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first Number");
		num1 = sc.nextLine();
		
		System.out.println("Enter Second Number");
		num2 =sc.nextLine();
		
		BigInteger first = new BigInteger(num1);
		BigInteger second = new BigInteger(num2);
		BigInteger sum;
		
		sum = first.add(second);
		
		System.out.println("Result " + sum);
	}


	private void addnumbers() {
		// TODO Auto-generated method stub
		int x, y, z;
		System.out.println("Enter Numbers");
		Scanner  sc = new Scanner(System.in);
		x =sc.nextInt();
		y= sc.nextInt();
		System.out.println("Sum of Eneterd numbers "+ (x + y) );
	}	
	
	
}
