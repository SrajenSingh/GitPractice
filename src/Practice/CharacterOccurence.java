package Practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharacterOccurence {
	
public static void main(String[]args) {
		
		String test = "Sauuumya";
		char[]arr=test.toCharArray();
		Map<Character,Integer>values=new LinkedHashMap<>();
		for(char c: arr) {
			if(values.containsKey(c)) {
				values.put(c, values.get(c)+1);
			}
			else {
				values.put(c,1);
			}
		}
		
		for(Map.Entry<Character,Integer>entry:values.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		
	}

}
