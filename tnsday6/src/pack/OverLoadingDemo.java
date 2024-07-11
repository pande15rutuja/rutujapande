package pack;

public class OverLoadingDemo {
	public static void main(String[] args) {
		System.out.println("-----Constructor overloading");
		
		Point p=new Point();
		System.out.println(p);
		
		Point p1=new Point(14.5f);
		System.out.println(p1);
		Point p2=new Point(15.5f, 20.5f);
		System.out.println(p2);
		System.out.println("-----Method Overloading----");
		System.out.println("Addition of two integers"+ MethodOverloadingDemo.addition(5,6));
		System.out.println("Addition of two float"+ MethodOverloadingDemo.addition(5.8f,6.9f));
		System.out.println("Addition of two String"+ MethodOverloadingDemo.addition("5","9"));
	}

}
