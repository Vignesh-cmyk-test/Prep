package prep;

public class SwappingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 10;
		int b = 20;
		
	/*	int c = a; //c=10
		
		a=b; //a=20
		b=c; //b=10  */
		
		a =a+b; //a=30
		b= a-b; //b=10
		a= b+b; //a= 20
			
		System.out.println("Number a: "+ a +", Number b: "+ b);
		
		

	}

}
