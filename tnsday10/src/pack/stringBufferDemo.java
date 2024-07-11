package pack;

public class stringBufferDemo {
	public static void main(String[] args) {
		StringBuffer buffer=new StringBuffer("hello");
		System.out.println("Buffer="+buffer);
		System.out.println("length="+buffer.length());
		System.out.println("capacity="+buffer.capacity());
		
		//appending an inserting into a buffer
		
		String s;
		int a=42;
		buffer=new StringBuffer(40);
		s=buffer.append("a=").append(a).append("!").toString();
		System.out.println(s);
		System.out.println(buffer);
		buffer=new StringBuffer("I Java!");
		buffer.insert(2, "like ");
		System.out.println(buffer);
		
		buffer.delete(3, 6);
		System.out.println(buffer);
		
		System.out.println(buffer.reverse());
	}

}
