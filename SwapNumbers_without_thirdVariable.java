package Practice;

import java.util.Scanner;

public class SwapNumbers_without_thirdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			System.out.println("Enter values");
			Scanner sc = new Scanner(System.in);
			int no1 = sc.nextInt();
			int no2 = sc.nextInt();
			
			System.out.println("Before Swapping no1 = " + no1 + ", no2 = " + no2);
			// no1 =10, no2 =2 
			no1 = no1 + no2;  //no1 =12
	
			no2 = no1 - no2; //no1 = 12, no2 = 2  -->no2 = 10
			no1 = no1 - no2; //no1 = 12, no2 = 10  --> no1 = 2
			
			System.out.println("After Swapping no1 = " + no1 + ", no2 = " + no2);
	}

}
