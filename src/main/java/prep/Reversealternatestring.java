package prep;

public class Reversealternatestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Need to reverse the alternate text";
		
		String[] spl = name.split(" ");
		
		for(int i=1; i<=spl.length-1;i+=2) {
			
			StringBuilder str = new StringBuilder(spl[i]);
			
			spl[i] = str.reverse().toString();
			
			
		}
		
		String res = String.join(" ", spl);
		System.out.println(res);

	}

}
