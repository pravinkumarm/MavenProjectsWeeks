package week1.day2;

public class ForLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//
		//String txt="Gayathiri";
		
			String[] txt=new String[6]; {
			txt[0]="Gayathiri";
			txt[1]="Sarath";
			txt[2]="koushik";
			txt[3]="Balaji";
			txt[4]="Mohan";
			txt[5]="Babu";
			//Print Odd numbers	
		for(int i=1;i<=txt.length;i++) {
			System.out.println(txt[i]);
			i=i+1;
		}
			
			
			//reverse order
			
			/*for (int i=txt.length-1;i>=0;i--) {
				System.out.println(txt[i]);
			}*/
			
			
			//Syntax for "ForEach"
			/*for(String eachtxt:txt) {
				System.out.println(eachtxt);
			}*/
			
		}
	}

}
