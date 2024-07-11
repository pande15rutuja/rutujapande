package pack;

public class OverRiddingDemo {
	public static void main(String[] args) {
		RBI rbi;
		
		rbi=new SBI();
		System.out.println(rbi.getRateOfInterest());
		
		rbi=new ICIC();
		System.out.println(rbi.getRateOfInterest());
		
		rbi=(RBI) new HDFC();
		System.out.println(rbi.getRateOfInterest());
	}

}
