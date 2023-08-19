package Practice;

import java.math.BigInteger;
import java.util.Scanner;

public class BigFactorial {
	public static void main(String[] args) {
		
		//Factorial formula = n! = n × (n-1) × (n-2) × … × 1
	int n, c;
	
	BigInteger inc = new BigInteger("1");
	BigInteger fact = new BigInteger("1");
	
	Scanner sc = new Scanner(System.in);

	n = sc.nextInt();
	
	for (c = 1; c<=n; c++) {
		fact = fact.multiply(inc);
	inc = inc.add(BigInteger.ONE);

	}
	System.out.println(n + "! = " + fact);
	}
}