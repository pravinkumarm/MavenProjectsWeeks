package week8.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class FindallDuplicateValues {

	public static void main(String[] args) {
		int [] a= {4,3,8,8,4,8};
		Set<Integer>Mentors=new LinkedHashSet<>();
int b=a.length;
for (int i=0;i<b;i++) {
	
	for(int j=i+1;j<b;j++) {
		if (a[i]==a[j])
			Mentors.add(a[j]);
		for (int k=0;k<b;k++) {
			if(Mentors.contains(a[k])) {
				
			}
			else{
				System.out.println(a[i]);
			}	
		}
		
			
	}
	
}

	}

}
