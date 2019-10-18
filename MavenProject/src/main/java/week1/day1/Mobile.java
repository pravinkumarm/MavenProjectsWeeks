package week1.day1;

public class Mobile {
//int ,void,string
	//Methods
	
	public int mobileNumber(){
		return 987765439;
	}
	public void modelName() {
		System.out.println("Z3");
	}
	public String color() {
		return "Blue";
	}
	
	
	public int greatestnumber(int num1,int num2,int num3) {
		if ((num1>num2)&&(num1>num3))
			return num1;
			else if ((num2>num1)&&(num2>num3))
				return num2;
				else
					return num3;
	}
	
	public String mobilecolor (String mobilemodel) {
	if (mobilemodel.equals("Sony"))
	return "Red";
	else if (mobilemodel.equals("Samsung"))
			return "Blue";
	else
		return "Violet";
	}
	
	
	//Variables
	public String brandName="Sony";
	public boolean hasPouch=false;
	
}


