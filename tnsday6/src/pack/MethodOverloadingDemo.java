package pack;

public class MethodOverloadingDemo {
	public static int addition(int a,int b)
	{
		return a+b;
	}
	public static float addition(float a,float b)
	{
		return a+b;
	}
	public static float addition(float a,int b)
	{
		return a+b;
	}
	public static String addition(String a,String b)
	{
		return a+b;
	}

}
