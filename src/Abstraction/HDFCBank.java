package Abstraction;

public class HDFCBank extends RBIBank{

	@Override
	public void loan() {
		System.out.println("--- HDFC Bank Loan ----");
	}
	
	public void fund(){
		System.out.println("---funds-----");
	}

}
