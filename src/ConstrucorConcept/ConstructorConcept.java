package ConstrucorConcept;

public class ConstructorConcept {
	
	public ConstructorConcept(){
		System.out.println("Default constructor");
	}
	
	public ConstructorConcept(int i){
		System.out.println("Single parameter constructor");
		System.out.println(i);
	}
	
	public ConstructorConcept(int a, int b){
		System.out.println("Double parameter constructor");
		int sum = a+b;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConstructorConcept obj = new ConstructorConcept();
		ConstructorConcept obj1 = new ConstructorConcept(10);
		ConstructorConcept obj2 = new ConstructorConcept(10,20);

	}

}
