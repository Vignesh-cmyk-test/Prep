package prep;

public class RemovetheVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text = "Need to remove the vowels";
		
		String tex = text.toLowerCase();
		
		char[] ch = tex.toCharArray();
		
		for(Character charac: ch) {
			
			//To print only vowels
			if(charac =='a'|| charac =='e'||charac =='i'||charac=='o'||charac=='u') {
				
			//	System.out.print(charac);
				//To print removing the vowels
			}else {				
				System.out.print(charac);
			}
		}
		

	}

}
