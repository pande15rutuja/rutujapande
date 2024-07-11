package pak;

public class Base {
	//declare default,private,protected,public
	
	int varDefault=10;
	public int varPublic=20;
	private int varPrivate=30;
	protected int varProtected=40;
	
	//declare default,private,protected,public methods
	
	void methodDefault()
	{
		System.out.println("default Method access base class");
		System.out.println("default Variable:"+varDefault);
	}
	public void methodPublic()
	{
		System.out.println("Public Method access base class");
		System.out.println("Public Variable:"+varPublic);
	}
	protected void methodProtected()
	{
		System.out.println("Protected Method access base class");
		System.out.println("Protected Variable:"+varProtected);
	}
	private void methodPrivate()
	{
		System.out.println("Private Method access base class");
		System.out.println("Private Variable:"+varPrivate);
	}



}
