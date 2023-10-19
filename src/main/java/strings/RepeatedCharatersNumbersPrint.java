package strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class RepeatedCharatersNumbersPrint {

	public static void main(String[] args) {
		String s = "2455678329294";
		char[] ca = s.toCharArray();
		RepeatedCharatersNumbersPrint r = new RepeatedCharatersNumbersPrint();
		r.findRepeatedCharacters1(ca);
		r.findRepeatedCharacters2(ca);		 

	}

	// Brute Force
	void findRepeatedCharacters1(char[] ca) {
		System.out.println("++++++++++++++++++Brute Force+++++++++++++++++++++");
		Set<Character> set = new HashSet<>();
		for (int i = 0; i < ca.length - 1; i++) {
			for (int j = i + 1; j < ca.length; j++) {
				if (ca[i] == ca[j]) {
					set.add(ca[j]);
				}
			}
		}
		System.out.println(set);
	}

	// Optimized
	void findRepeatedCharacters2(char[] ca) {
		System.out.println("++++++++++++++++++++Optimized+++++++++++++++++++++++++++");
		Map<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < ca.length; i++) {
			if (map.containsKey(ca[i])) {
				map.put(ca[i], map.get(ca[i]) + 1);
			} else {
				map.put(ca[i], 1);
			}
		}
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 1) {
				// System.out.println("Character: " + entry.getKey() + ", Count: " +
				// entry.getValue());
				System.out.println(entry.getKey());
			}
		}
	}

}
