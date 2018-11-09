package OopsConcept;

public class Car {
	
	int employee_list = 345;
	String md = "Tom";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car obj = new Car();
		Car obj1 = new Car();
		System.out.println(obj.employee_list);
		System.out.println(obj.md);
		obj.employee();
		//System.out.println(obj1.employee_list);
		
		
	}
	
	public void employee(){
		System.out.println("employee---------");
		System.out.println(employee_list);
		int a = 10;
		int b = 20;
		int c = 30;
		System.out.println("before swapping");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		a=b;
		b=c;
		c=a;
		System.out.println("after swapping");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}
