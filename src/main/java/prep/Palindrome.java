package prep;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "madam";
		
		char[] ch = name.toCharArray();
		
		StringBuilder str = new StringBuilder();
		
		for(int i=ch.length-1; i>=0;i--) {
			
		//	char ch = name.charAt(i);
			
			str.append(ch[i]);
			
		}
			
			System.out.println(str);
			
			if(name.equals(str.toString())) {
				
				System.out.println("It is palindrome");
				
			}else {
				System.out.println("Not a palindrome");
			
			}
		}

	}


