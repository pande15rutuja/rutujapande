package pak;

public class Executor {
	public static void main(String[] args) {
		//accessing same package class
		Base b1=new Base();
		b1. methodDefault();
		b1.methodProtected();
		b1.methodPublic();
		
		//instance Operator
		System.out.println(b1 instanceof Base); 
		
		
		
		
	
	}

}
