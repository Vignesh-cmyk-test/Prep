package prep;

public class Findspecificcharcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Srinsoft";
		String lower = name.toLowerCase();
		
		char find = 's';
		int count = 0;
		
		for(int i=0; i<=lower.length()-1;i++) {
			
			char ch = lower.charAt(i);
			if(ch==find) {
				count++;
				
			}
		}
		
		System.out.println("Count of the character: "+find+" is "+count);

	}

}
