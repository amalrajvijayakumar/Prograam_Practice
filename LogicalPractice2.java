package InterviewPractice;

public class LogicalPractice2 {

	public static void main(String[] args) {
		// Ques
		//Test case 1
		// x= 4, y = 10 expected output = 7
		//Test Case 2 
		// x = 10, y =14 expected output = 11
		int a[]  = {4,3,7,11,50,1};
		
		int x=10; 
		int y=14;
	
		 if(x<y) { 
		 int i =0;
		 	while(i<a.length) 
		 	{
			 if(a[i]> x && a[i]< y)
			{
				 System.out.println(a[i]);	 
			}
			 i++;
		 	}
		 }
		 else
			 System.out.println("condition mismatch");
			 
		}
	}

	
	
