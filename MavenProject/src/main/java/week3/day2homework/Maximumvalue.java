package week3.day2homework;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Maximumvalue {

	public static void main(String[] args) {
		Map<String, Integer> bat = new HashMap<String, Integer> ();
		bat.put("MRF", 100);
		
		bat.put("SS", 4000);
		bat.put("Britania", 500);
		int maxcount=Collections.max(bat.values());
		for (Entry<String, Integer> bat1 : bat.entrySet()) {
			if(maxcount==bat1.getValue())
			{
				System.out.println(bat1.getKey());
			}
		}
	}
}