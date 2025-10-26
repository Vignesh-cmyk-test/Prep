package prep;

public class Tanpan{
	
	public static void main(String[]args) {
		
		int num = 71;
		
		for(int i=1;i<=num;i++) {
			
			if(i %3==0 && i%5==0) {
				System.out.println("It is TanPan: "+i);
				
			}else if(i%3==0) {
				
				System.out.println("It is Tan: "+i);
			}else if(i%5==0) {
				System.out.println("It is Pan: "+i);
			}
		}
	}
	
}