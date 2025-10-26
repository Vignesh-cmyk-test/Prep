package prep;

public class Replacetextandnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String company = "My company has more than 2000 employees";
		
		String rep = company.replaceAll("[^0-9]", "");
		System.out.println(rep);
	} 

 }


