package Abc;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "automation";
		char c = 't';
		int count = 0;
		char[] d = s.toCharArray();

		for (char e : d) {

			if (e == c) {

				count++;
			}
		}
		System.out.println("A occurred " + count + " times");

// by usung linked hashmap

		Map<Character, Integer> map = new LinkedHashMap<>();

		for (char ch : d) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}

		for (Entry<Character, Integer> entry : map.entrySet()) {

			System.out.println(entry.getKey() + " : " + entry.getValue());

		}

		for (Entry<Character, Integer> entry : map.entrySet()) {

			if (entry.getValue() > 1) {

				System.out.println("repedted char are "+ entry.getKey());
			}
		}

		
		for (Entry<Character, Integer> entry : map.entrySet()) {

			if (entry.getValue() == 1) {

				System.out.println("non repeated char are "+entry.getKey());
			}
		}
		
	}

}
