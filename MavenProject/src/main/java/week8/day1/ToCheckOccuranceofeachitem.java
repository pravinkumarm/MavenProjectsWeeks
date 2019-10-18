package week8.day1;

import java.util.HashMap;
//import java.util.Iterator;
import java.util.Map;

import org.openqa.selenium.chrome.ChromeDriver;

//import net.bytebuddy.agent.builder.AgentBuilder.TypeStrategy.ForBuildEntryPoint;

public class ToCheckOccuranceofeachitem {

	public static void main(String[] args) {
		int txt[]= {1,2,3,2,1,2};
int c=txt.length;
Map<Integer,Integer> ch=new HashMap<Integer,Integer>();
for (int i=0;i<c;i++) {
	/*int l=txt[i];
	for (int j=i+1;j<c;j++) {
		int k=txt[j];
		if(l==k) {*/
			if (ch.containsKey(txt[i]))
			{
				ch.put(txt[i], ch.get(txt[i])+1);
			}
			else
			{
				ch.put(txt[i], 1);
			}
		}



for (Map.Entry<Integer,Integer> iterator :ch.entrySet()) {
	
	System.out.println("Key =" +iterator.getKey() +", Value= " +iterator.getValue());
}
	
	}

	
}
