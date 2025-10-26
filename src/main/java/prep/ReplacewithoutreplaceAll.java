package prep;

public class ReplacewithoutreplaceAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String company = "My company has 2000 employees";
		
		String result = "";
		
		for(int i=0;i<=company.length()-1;i++) {
			
			char ch = company.charAt(i);
			
			if(!Character.isDigit(ch)) {
				
				result = result+ch;
			}
		}
		
		System.out.println(result);

	}

}
