package prep;
import java.util.Set;
import java.util.HashSet;

public class Removecommonduplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] name = {"Alice","David","Raj","Rajesh","David"};
		String[] name1 = {"Raj","francis","Rajesh","Beckam"};
		
		Set<String> set1 = new HashSet<String>();
		
		for(String nameset1: name) {
			
			set1.add(nameset1);
		}
		System.out.println(set1);
		
		Set<String> set2 = new HashSet<String>();
		
		for(String nameset2 : name1) {
			
			set2.add(nameset2);
		}
		System.out.println(set2);
		
		Set<String> duplicate = new HashSet<String>(set1);
		
		duplicate.retainAll(set2);
		
	//	System.out.println(duplicate);
		
		set1.removeAll(duplicate);
		set2.removeAll(duplicate);
		
		for(String sname1 : set1) {
			
			System.out.println(sname1);
		}
		
		for(String sname2: set2) {
			System.out.println(sname2);
		}
		
		
	}

}
