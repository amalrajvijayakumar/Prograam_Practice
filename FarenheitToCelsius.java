package Practice;

import java.util.Scanner;

public class FarenheitToCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter temprature");
		float temprature = sc.nextInt();
		
		temprature = ((temprature-32)*5)/9;
		System.out.println("Temprature in Celsius " + temprature);
		}

}
