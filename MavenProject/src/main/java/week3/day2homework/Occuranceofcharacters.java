package week3.day2homework;

import java.util.LinkedHashMap;
import java.util.Map;

public class Occuranceofcharacters {

	public static void main(String[] args) {
		String name="TestLeaf";
		Map<Character, Integer> name1 = new LinkedHashMap<>();
		for(int i=0; i<name.length(); i++)
		{
			int count =0;
			char character = name.charAt(i);
			if(name1.containsKey(character))
			{
				
				count = name1.get(character);
				name1.put(character, count+1);			
				}

			else
			{
				name1.put(character, 1);

			}
				}
		System.out.println(name1);

	}

}
