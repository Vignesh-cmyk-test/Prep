package prep;

import java.util.Set;
import java.util.TreeSet;

public class Finduniquechars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "tested";
		
		Set<Character> sets = new TreeSet<>();
		char[] ch = name.toCharArray();
		
		for(int i=0; i<ch.length;i++) {
			
			if(!sets.add(ch[i])) {
				
				sets.remove(ch[i]);
			}
			
		}
		System.out.println(sets);

	}

}
