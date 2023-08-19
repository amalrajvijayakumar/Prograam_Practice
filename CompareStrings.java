package Practice;

import java.util.Scanner;

public class CompareStrings {
	public static void main(String[] args) {
		String s1, s2;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the first String");
		s1 = sc.nextLine();
	
		System.out.println("Enter the second String");
		s2 = sc.nextLine();
		
		if(s1.compareTo(s2)>0)
			System.out.println("First String is greater than scond.");

		else if (s1.compareTo(s2)<0)
			System.out.println("First String is Smaller than second");
		
		else 
			System.out.println("Both Strings are Equal");
	}

}
