package Practice;

import java.util.Scanner;

public class SwapNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("Enter Numbers");
	
	Scanner sc = new Scanner(System.in);
	int no1 = sc.nextInt();
	int no2 = sc.nextInt();
	
	System.out.println("Before swapping no1 = "+ no1 +", no2 = " +  no2);
	
	int  temp = no1;
	no1 = no2;
	no2 = temp;
	
	System.out.println("After swapping no1 = " + no1 + ", no2 = "+no2 );
	}
	
}
