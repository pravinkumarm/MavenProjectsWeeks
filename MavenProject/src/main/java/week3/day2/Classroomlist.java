package week3.day2;


import java.util.ArrayList;
import java.util.HashSet;
//import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Classroomlist {

	public static void main(String[] args) {
	List<String> names=new ArrayList<>();
	names.add("Ram");
	names.add("Gim");
	names.add("jam");
	names.add("ganesh");
	names.add("anush");
	names.add("alex");
	names.add("Gim");
	//int sizeoflist = names.size();
	for (String namesarray : names) {
		System.out.println(namesarray);
		
	}
	System.out.println(names.size());
	
		
		
	//Create a set of 5 employees name and print only the name starts with "S"
		
	Set<String> names1=new HashSet<>()	;
	names1.add("Ram");
	names1.add("Sham");
	names1.add("jam");
	names1.add("ganesh");
	names1.add("anush");
	names1.add("alex");
	names1.add("Saw");
	//System.out.println(names1);
	for (String finalname : names1) {
	//System.out.println(finalname);
		if (finalname.startsWith("S")){
			System.out.println(finalname);
		}
	
	}
	
	//==================================================================
	//Create a list of 10 name and try to remove the first 5entries in the list
	
	List<String> names2=new ArrayList<>();
	names2.add("Ram");
	names2.add("Sham");
	names2.add("jam");
	names2.add("ganesh");
	names2.add("anush");
	names2.add("alex");
	names2.add("Jonny");
	names2.add("Sow");
	names2.add("Saw");
	names2.add("Prav");

	for(int i=0;i<names2.size();i++) {
		//System.out.println(names2.get(i));
		
		names2.remove(i);
		//System.out.println(names2.get(i));
		if (i==4)
		{			
			System.out.println(names2);
			break;
		}
	}
	
	//==================================================================
	
	
	//delete the 2 duplicate from the List
	
		ArrayList<String> names3=new ArrayList<>();
		names3.add("Ram");
		names3.add("Sham");
		names3.add("jam");
		names3.add("ganesh");
		names3.add("anush");
		names3.add("alex");
		names3.add("anush");
		names3.add("Sow");
		names3.add("Saw");
		names3.add("Prav");
		int k=1;
		for(int i=0;i<names3.size();i++) {
			//System.out.println(names2.get(i));
			String listnames = names3.get(i);
			for (int j=k;j<names3.size();j++) {
				String listnames1 = names3.get(j);	
				if(listnames.equals(listnames1)) {
					names3.remove(j);
					break;
				}
			}
			k=k+1;
		}
		System.out.println(names3);
	}


}


