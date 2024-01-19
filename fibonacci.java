package Practice;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no1= 1, no2 =2, no3, i, count =10;
		
		System.out.println(no1+" "+no2);
		
		for(i=2; i<count; i++) {
			no3 = no1 + no2;
			System.out.println(" "+ no3);
			no1 =no2;
			no2= no3;
		}
	}

}
