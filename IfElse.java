package Practice;

import java.util.Scanner;

public class IfElse {
//IfElse in Java practice
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marksObtained, passingMarks;
		
		passingMarks = 40;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Scored Marks");

		marksObtained = sc.nextInt();
		if(marksObtained >= passingMarks) 
		{
		System.out.println("You passed the exam");
		}
		else
		{
		System.out.println("Unfortunately you failed the exam");
		}
	}

}
