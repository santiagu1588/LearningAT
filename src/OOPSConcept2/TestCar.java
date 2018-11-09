package OOPSConcept2;

public class TestCar {

	
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		// static polymorphism or compile time polymorphism
		BMW b = new BMW();
		b.start();
		b.stop();
		b.wheel();
		b.alliedWheel();

		System.out.println("----------");
		
		Car c = new Car();
		c.start();
		c.stop();
		c.wheel();
		
		System.out.println("-------------");
		
		Car c1 =new BMW();
		c1.start();
		c1.stop();
		c1.wheel();
		
		
		
	}
	
	

}
