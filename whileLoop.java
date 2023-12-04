package Practice;

import java.util.Scanner;

public class whileLoop {
	 public static void main(String[] args) {
		System.out.println("Input an integer");
		Scanner sc = new Scanner(System.in);
		int n;
		while( (n =  sc.nextInt() ) !=0) {
			System.out.println("You entered "+ n);
			System.out.println("Input an Integer");
		}
		System.out.println("Out of loop");
	}
}
