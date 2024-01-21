package Practice;

import java.util.Scanner;

public class primeNumber {
	public static void main(String[] args) {
	
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter a number to check if it's prime: ");
		        int number = scanner.nextInt();

		        if (isPrime(number)) {
		            System.out.println(number + " is a prime number.");
		        } else {
		            System.out.println(number + " is not a prime number.");
		        }

		        scanner.close();
		    }

		    // Function to check if a number is prime
		    public static boolean isPrime(int n) {
		        if (n <= 1) {
		            return false;
		        }
		        for (int i = 2; i <=n/2; i++) {
		            if (n % i == 0) {
		                return false;
		            }
		        }
		        return true;
		    }
		}
