package prep;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Findsecondhghestdupcharacter {
	
    public static void main(String[] args) {
    	
        String name = "EAHMFEHME";

        // Step 1: Count occurrences of each character
        Map<Character, Integer> freqMap = new LinkedHashMap<>();

        for (char c : name.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }
        
        System.out.println(freqMap);

        // Step 2: Find the second duplicate
        int duplicateCount = 0;
        
        boolean bfound = false;

        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > 1) {  // found a duplicate
                duplicateCount++;
                if (duplicateCount == 2) {
                    System.out.println("Second duplicate character is: " + entry.getKey());
                    bfound = true;
                    break;
                  
                }
            }
            
        }
        if(bfound ==false) {
        	System.out.println("Second duplicate not found.");
        }

    }
}
