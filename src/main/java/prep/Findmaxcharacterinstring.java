package prep;
import java.util.Map;
import java.util.HashMap;

public class Findmaxcharacterinstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "gghkryfdbffjjgfsssests";
		
		char[] ch = name.toCharArray();
		
		Map<Character, Integer> map = new HashMap<>();
		
		for(char charac : ch) {
			
			if(map.containsKey(charac)) {
				int value = map.get(charac);
				int newvalue = value+1;
				map.put(charac, newvalue);
			}else {
				map.put(charac,1);
			}
			
		}
		System.out.println(map);
		char maxchar = ' ';
		int maxcount = 0;
		
		for(Map.Entry<Character,Integer> entry: map.entrySet()) {
			
			if(entry.getValue()>maxcount) {
				maxcount=entry.getValue();
				maxchar=entry.getKey();
			}
		}
		
		System.out.println("Maximum character is :"+maxchar);
		System.out.println("Maximum count is :"+maxcount);

	}

}
