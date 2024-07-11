package pack;

public abstract class Shape {
	protected float area;
	public abstract void calArea();
	public void show()
	{
		System.out.println("Area of the Shape is "+area);
	}

}
