package Abstraction;

public abstract class RBIBank {
	
	// abstract method
	public abstract void loan();
		
	
	// non - abstract method
	 public void credit(){
		 System.out.println("--credit----");
	 }
	 
	 public void debit(){
		 System.out.println("--debit----");
	 }
	
}
