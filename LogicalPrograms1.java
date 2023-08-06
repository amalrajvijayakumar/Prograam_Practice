package InterviewPractice;

public class LogicalPrograms1 {

	public static void main(String[] args) {
		//Question
		//Given a Unsorted array to find a continues pair 
		//Largest sum value in a given array
	
		int [] arr = {0,5,6,0,9,0,0,1};
		
		int sum=0; 
		int big=0;
		
		for(int i=0; i<arr.length-1; i++) {
			sum= arr[i]+arr[i+1];	
		if(big<sum)
		{
			big = sum;
		}
	}
		System.out.println(big);
	}
}



