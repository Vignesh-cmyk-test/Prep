package prep;

public class Abcd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "abcd";
		
	//	char[] ch = name.toCharArray();
		
		for(int i=0;i<=name.length()-1;i++) {
			
			char ch = name.charAt(i);
			
			for(int j=0; j<=i;j++) {
				
				char ch1 = name.charAt(j);
				
				System.out.print(ch);
			}
		}

	}

}
