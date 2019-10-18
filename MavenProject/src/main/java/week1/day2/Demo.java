package week1.day2;

public class Demo {

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//Sum of numbers from 1 to 100
		
		int l=0;
		int j=100;
		for (int i=1;i<=j;i++)
		{
			int k=i;
		 l=l+k;
			 
	}
		System.out.println(l);
	}*/

	
	
	
	//Change every odd index in to upper case 
	/*public static void main(String[] args) {
		//Change every odd index in to upper case 
		String txt="Chennai";
		String word="";
		//ChEnNaI
		int lengths=txt.length();
		for (int i=0;i<lengths;i++) {
			if (i%2==1) {
				Character ch=txt.toUpperCase().charAt(i);
				String caps=ch.toString();
				word=word+caps;
			}
			else {
				Character ch=txt.toLowerCase().charAt(i);
				String caps=ch.toString();
				word=word+caps;
			}
		}
		System.out.println(word);
	}*/
	
	
	
	
	//Take string as input and find the occurence of "a"
	/*public static void main(String[] args) {
		String txt="Chennai";
		String txt1="n";
		int log=0;
		//ChEnNaI
		int lengths=txt.length();
		for (int i=0;i<lengths;i++) {
			Character tenter=txt.charAt(i);
			String tent=tenter.toString();
			if (txt1.equals(tent)) {
				log=log+1;
			}
		}
		System.out.println(log);
	}
	*/
	
	
	//String txt="india&china&japan" split country starts with C
/*	public static void main(String[] args) {
		//Change every odd index in to upper case 
		String txt="india&china&japan&canada";
		String txt1="c";
		//ChEnNaI
String[] txt2=txt.split("&");
for (String next:txt2)
{
	if (next.startsWith(txt1)){
System.out.println(next);
	}
}
}*/
	
	
	
	//Check whether the number is prime or not
public static void main(String[] args) {
	   int num = 9;
       boolean flag = false;
       for(int i = 2; i <= num/2; ++i)
       {
           if(num % i == 0)
           {
               flag = true;
               break;
           }
       }

       if (!flag)
           System.out.println(num + " is a prime number.");
       else
           System.out.println(num + " is not a prime number.");
   }



}
	
	
	
	





