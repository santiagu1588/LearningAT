package OopsConcept;

public class CallByValueCallByReference {

	int k = 20;
	int l = 50;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CallByValueCallByReference obj = new CallByValueCallByReference();
	
		int x = 10;
		int y =20;
		int z = 40;
		
		obj.inter(x, y);
		obj.sub(z, x);
		
		System.out.println(obj.k);
		System.out.println(obj.l);
		
		System.out.println("------");
		obj.div(obj);
		obj.inter(obj.k, obj.l);
		obj.sub(obj.k, obj.l);
	}
	
	public void inter(int a, int b){
		int c = a+b;
		System.out.println(c);
	}

	
	public void sub(int a, int b){
		int d = a-b;
		System.out.println(d);
	}
	
	// call by reference: only for swapping
	public void div(CallByValueCallByReference t){
		
		int temp;
		temp = t.k;
		t.k=t.l;
		t.l=temp;
		
		
		System.out.println(t.k);
		System.out.println(t.l);
		
		
	}
}
