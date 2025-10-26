package prep;

public class NumberaddedPlus {
	
	public static void main(String[] args) {
		
		int[] num = {12,4,4,7,3,8,1};
		
		int sumnum = 15;
		
		boolean bfound = false;
		
		for(int i=0; i<num.length-1;i++) {
			
			for(int j=1;j<num.length;j++) {
				
				if(num[i] +num[j] == sumnum) {
					
					System.out.println("SumNum achieved "+ num[i]+" & "+num[j]);
					bfound = true;
					break;
				}
			}
			if(bfound==true) {
				
				System.out.println("SumNum achieved "+ num[i]);
				break;
			} 
		}
		
		if(bfound==false) {
			System.out.println("Not achieved");
		}
		
	}

}
