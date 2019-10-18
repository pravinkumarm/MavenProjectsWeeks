package week8.day1;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
//to check the least occurance
public class Tocheckoccurance {

	public static void main(String[] args) {
		String txt = "aabcbacc";
		Map<Character, Integer> Mentors = new LinkedHashMap<>();
		int b = txt.length();
		for (int i = 0; i < b; i++) {
			char c = txt.charAt(i);
			int j = 1;
			if (Mentors.containsKey(c)) {
				Mentors.put(c, j + 1);
			} else {
				int k = 0;
				Mentors.put(c, k + 1);
			}

		}
		for (Entry<Character, Integer> eachItem : Mentors.entrySet()) {
			if (eachItem.getValue() == 1) {
				System.out.println(eachItem.getKey());
				break;
			}
		}
	}

}
