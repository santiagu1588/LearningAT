package ConstrucorConcept;

public class ConstructorWithThisKeyword {

	String name;
	int age;
	String DP;
	
	public ConstructorWithThisKeyword(String name){
		this.name= name;
		System.out.println(name);
	}
	public ConstructorWithThisKeyword(String DP, int age){
		this.DP = DP;
		this.age=age;
		System.out.println(DP);
		System.out.println(age);
	}	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorWithThisKeyword obj = new ConstructorWithThisKeyword("Tom");
		ConstructorWithThisKeyword obj1 = new ConstructorWithThisKeyword("ECE",20);
		

	}

}
