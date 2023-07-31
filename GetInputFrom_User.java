package Practice;

import java.util.Scanner;

public class GetInputFrom_User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a; 
		float b;
		String c;
		
		Scanner sc  = new Scanner (System.in);
		
		System.out.println("Enter a String"); //String
		c = sc.nextLine();
		System.out.println("You Entered the String "  + c);
		
//		System.out.println("Enter the Float value ");
//		b = sc.nextFloat();
//		System.out.println("You Entered "  + b);
//		
//		System.out.println("Enter the Integer value ");
//		a = sc.nextInt();
//		System.out.println("You Entered "  + a);
		}

}
