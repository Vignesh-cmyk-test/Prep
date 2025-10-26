package prep;

public class ReplacewithoutIsDigit {
	
	public static void main (String[] args) {
		
		String name = "My company has more than 15,000 employees";
		String result = "";
		
		for(int i=0; i<=name.length()-1;i++) {
			
			char ch = name.charAt(i);
			
			if(ch>='0' && ch<='9') {
				
				result = result+ch;
			}
		}
		System.out.println(result);
	}

}
