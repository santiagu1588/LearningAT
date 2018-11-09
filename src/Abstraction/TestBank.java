package Abstraction;

public class TestBank {

	public static void main(String[] args) {
		
		HDFCBank hb = new HDFCBank();
		hb.credit();
		hb.debit();
		hb.fund();
		hb.loan();
		
		RBIBank b = new HDFCBank();
		b.loan();
		b.credit();
		b.debit();
		
		
	}

}
