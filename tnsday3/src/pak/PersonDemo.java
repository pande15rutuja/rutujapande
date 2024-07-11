package pak;

import java.util.Scanner;

public class PersonDemo {
	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in); //import ctrl+shift+o
		
		String name;
		System.out.println("Enter Person Name :");
		name=ob.next();
		System.out.println("Enter age :");
		int age=ob.nextInt();
		System.out.println("Enter genger :");
		String gender=ob.next();
		
		System.out.println("Enter Income :");
		int income=ob.nextInt();
		
		ScannerDemo person=new ScannerDemo();
		person.setAge(age);
		person.setGender(gender);
		person.setIncome(income);
		
		System.out.println(person);
		
		TaxCalc calc= new TaxCalc();
		calc.calculateTax(person);
		System.out.println("After Claculation Tax :");
		System.out.println(person);
	}

}
