package pak;

import java.util.Scanner;

public class Constructor {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int id;
		System.out.println("Enter Customer ID :");
		id = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Enter Cutomer Name :");
		String name = sc.nextLine();
		
		
		System.out.println("Enter Customer City");
	     String city=sc.nextLine();
		
		System.out.println(" ");
		
		Customer c1=new Customer();
	}

}
