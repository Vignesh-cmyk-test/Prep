package prep;

public class Reverseintermittent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String name = "Reverse the intermittent text";
		
		String[] spl = name.split(" ");
		
		for(int i=0; i<=spl.length;i++) {
			
			StringBuilder str = new StringBuilder(spl[2]);
			
			spl[2] = str.reverse().toString();
			
			String result = String.join(" ", spl);
			
			System.out.println(result);
			
			break;
		}

	}

}
