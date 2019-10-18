package week8.day1;

public class JavaCoding {

	public static void main(String[] args) {
		String c = "";
		String Companyname = "TestLeaf";
		int a = Companyname.length();
		for (int i = a - 1; i >= 0; i--) {
			char b = Companyname.charAt(i);
			c = c + b;
		}
		System.out.println(c);
		if (Companyname.equalsIgnoreCase(c)) {
			System.out.println("String is Palindrome");

		} else {
			System.out.println("String is not palindrome");
		}
	}

}
