package prep;

public class Findfirstdupcharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "EMAHFEHE";
		
		char[] ch = name.toCharArray();
		
		boolean bfound = false;
		
		for(int i=0; i<ch.length;i++) {
			
			for(int j=1;j<ch.length;j++) {
				
				if(ch[i] == ch[j]) {
					
					System.out.println("Duplicates are: "+ ch[j]);
					bfound=true;
					break;
				}
			}
			if(bfound==true) {
			//	System.out.println("Duplicates are: "+ch[i]);
				break;
			} 
			
		}
		
		if(bfound==false) {
			System.out.println("No duplicates");
			
		}

	}

}
