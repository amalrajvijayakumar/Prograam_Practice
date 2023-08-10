package InterviewPractice;

public class LogicalPractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
			 System.out.println("condition mismaatch");
			 
		}
	}

	
	