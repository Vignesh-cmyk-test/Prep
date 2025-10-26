package prep;

public class Reversestring {
	
	public static void main (String[] args) {
		
		String name = "Reverse";
		
		char[] ch = name.toCharArray();
		
		StringBuilder stsr = new StringBuilder();
		
		for(int i=ch.length-1;i>=0;i--) {
			
			stsr.append(ch[i]);
			
			//System.out.print(ch[i); //If need to print as characters
		}
		System.out.print(stsr);  
		
	
	}  
		
	}


