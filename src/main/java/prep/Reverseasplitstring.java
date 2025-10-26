package prep;

public class Reverseasplitstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Reverse need to be reversed";
		
		String[] spl = name.split(" ");
		
	//	StringBuilder str = new StringBuilder();
		
		for(int i=spl.length-1; i>=0; i--) {
			
			System.out.print(spl[i] + " ");
		}

	}

}
