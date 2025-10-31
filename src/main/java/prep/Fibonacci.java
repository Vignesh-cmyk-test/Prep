package prep;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 30;
		
		int first = 0;
		int second =1;
		
		for(int i=0; i<num;i++) {
			
			// first = second; //order this for non fibonacci
			int next = first + second;
			
			 first = second;
			 second = next;
			 
			 System.out.print(" "+ next);
			
		  }

	  }

   }
