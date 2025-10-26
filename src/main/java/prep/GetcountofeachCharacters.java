package prep;

import java.util.HashMap;
import java.util.Map;

public class GetcountofeachCharacters {
	
	public static void main(String[]args) {
		
		String name = "TesT";

				char[] chararray = name.toCharArray();

				Map<Character,Integer> map = new HashMap<Character,Integer>();
				//int count =1;

				for(int i=0;i<=chararray.length-1;i++){
				if(map.containsKey(chararray[i])) {
				//	count++;
					int value = map.get(chararray[i]);
					int newvalue = value+1;
					map.put(chararray[i], newvalue);
					
				}else {
					map.put(chararray[i], 1);
				}

				}
				System.out.println(map);
	}

}
