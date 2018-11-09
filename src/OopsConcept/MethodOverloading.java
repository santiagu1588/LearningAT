package OopsConcept;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		
		MethodOverloading obj = new MethodOverloading();
		obj.sum();
		obj.sum(10);
		obj.sum("selenium");
		obj.sum(14, 15);
		main(10);
		
	}
	
	public static void main(int i){
		System.out.println("-- Main method overloading---");
	}
	
	// We can create same method with different arguments as well different data type is called method overloading.
	
	public void sum(){
		System.out.println("-- Sum method -- test1");
	}
	
	public void sum(int i){
		System.out.println("--- Sum method -- 1 parameter");
	}
	
	public void sum(String s){
		
		System.out.println("--- Sum method -- 1 string parameter");
	}
	
	public void sum(int i, int j){
		System.out.println("--- sum method -- 2 parameter");
	}
	
	public void sum(double d){
		
	}

}
