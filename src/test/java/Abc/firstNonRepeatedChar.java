package Abc;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class firstNonRepeatedChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "automation";

		char[] ch = s.toCharArray();

		// get count of each character occurred how many times
		Map<Character, Integer> mp = new LinkedHashMap<>();

		for (char chare : ch) {

			mp.put(chare, mp.getOrDefault(chare, 0) + 1);
		}

		System.out.println(mp);

		// get first non repeated char

		for (char chare : mp.keySet()) {

			if (mp.get(chare) == 1) {

				System.out.println("First non-repeated character: " + chare);
				break;
			}
		}
   // print all repeated character
		
		for (Entry<Character, Integer> entry : mp.entrySet()) {
			if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
            }
		}
		
		 // Print all non-repeated characters
        System.out.print("Non-repeated characters: ");
        for (Map.Entry<Character, Integer> entry : mp.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.print(entry.getKey() + " ");
            }
        }
        
        
	}

}
