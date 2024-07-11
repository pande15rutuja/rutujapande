package pack;

public class ShapeDemoMain {
	public static void main(String[] args) {
		Square s= new Square();
		s.calArea();
		s.show();
		
		Rectangle r=new Rectangle();
		r.calArea();
		s.show();
		
		Shape s1;
		
		s1=new Square(5.0f);
		s1.calArea();
		s1.show();
	     
		s1=new Rectangle(10.6f,7.5f);
		s1.calArea();
		s1.show();
		
		
		
	}

}
