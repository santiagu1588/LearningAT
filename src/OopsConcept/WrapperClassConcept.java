package OopsConcept;

public class WrapperClassConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// wrapper class - data conversion

		// string to integer

		String s = "101";

		int i = Integer.parseInt(s);

		int j = i + 100;
		System.out.println(j);

		// string to double

		String s1 = "12.32";
		double d = Double.parseDouble(s1);
		double d1 = d + 13.1;
		System.out.println(d1);

		// string to boolean

		String s2 = "true";
		boolean b = Boolean.parseBoolean(s2);
	

	// integer to string

	int k = 100;
	String s5 = String.valueOf(k);

	// string to char

	char c = 'a';
	String s6 = String.valueOf(c);

	//

	String se = "100A"; // Number format exception
	
	int m = Integer.parseInt(se);
	System.out.println(m);
	
	}

}
