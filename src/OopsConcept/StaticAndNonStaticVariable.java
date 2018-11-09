package OopsConcept;

public class StaticAndNonStaticVariable {
	// Global Variable
	int age = 21; // Non static 
	static String name = "Tom"; // static
	

	public static void main(String[] args) {
		
		// calling static variable to static method
		
		   // 1.  by direct calling
		    System.out.println(name);
		    
		  // 2. by class name
		    System.out.println(StaticAndNonStaticVariable.name);
		    
		    sub();
		    
		    StaticAndNonStaticVariable.sub();
		
		StaticAndNonStaticVariable obj = new StaticAndNonStaticVariable();
		System.out.println(obj.age);
		obj.sum();
		
		

	}
	
	// We can call non static variable to non static method directly
	// We can call static variable to static method directly
	// we can call static variable to non static method
	// we can cannot call non static variable to static method directly. but we can call it by object reference.
	
	
	// non static method
	public void sum(){
		int i = 14; // local variable
		int j = 15;
		System.out.println(i);
		System.out.println(j);
		System.out.println(age);
		System.out.println(name);
	}
	
	//  static method
	public static void sub(){
		String automation_tool = "Selenium";
		String autoIt = "Desktop tool";
		System.out.println(automation_tool);
		System.out.println(autoIt);
		System.out.println(name);
		
	}

}
