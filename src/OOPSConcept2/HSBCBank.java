package OOPSConcept2;

public class HSBCBank implements USBank,UKBank{
    // IS a relationship
	// US bank property
	public void credit(){
		System.out.println("hsbc bank -- credit");
	}
	
	public void debit(){
		System.out.println("hsbc bank -- debit");
	}
	
	public void transaction(){
		System.out.println("hsbc bank -- txn");
	}
	
	// HSBC own property
	public void carloan(){
		System.out.println("hsbc bank -- car loan");
	}
	
	/// UK bank property
	
	public void mutual(){
		System.out.println("--- Mutual----");
	}
	
}
