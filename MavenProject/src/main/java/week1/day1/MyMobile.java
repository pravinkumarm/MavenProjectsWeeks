package week1.day1;

public class MyMobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//Using Methods
		
	Mobile MyMobile=new Mobile();
	MyMobile.modelName();
		
	String color=MyMobile.color();
	System.out.println(color);
	
	
	int number=MyMobile.mobileNumber();
	System.out.println(number);
	
	
	int greaternumber=MyMobile.greatestnumber(10,7,3);
	System.out.println(greaternumber);
	
	String Mobcol=MyMobile.mobilecolor("Redmi");
	System.out.println(Mobcol);
	
	//Using Variables
	//Mobile var=new Mobile();
	//var.brandName="red";
	//System.out.println(var.brandName);		
	//var.hasPouch=true;
	
	String brandName = MyMobile.brandName;
	System.out.println(brandName);
	
	boolean hasPouch = MyMobile.hasPouch;
	System.out.println(hasPouch);

	}

}
