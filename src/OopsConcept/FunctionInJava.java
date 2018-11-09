package OopsConcept;

public class FunctionInJava {
	
	// no input no output
	// no input some output
	// some input some output

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FunctionInJava obj = new FunctionInJava();
		obj.test();
		int k = obj.sum();
		System.out.println(k);
		System.out.println(obj.sum());
		System.out.println(obj.name());
		System.out.println(obj.sub(30, 10));

	}
	
	public void test(){ // no input no output
		System.out.println("Test method");
	}
	
	public int sum(){ //no input some output
		int i = 10;
		int j = 20;
		return i;
	}
	
	public String name(){ // no input some output
		String s1 = "Selenium";
		return s1;
	}
	
	
	public int sub(int i, int j){ // some input some output
		int sub = i-j;
		return sub;
		
	}

}
