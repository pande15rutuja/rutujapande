package pak;

import java.util.Scanner;

public class PersonDemo {
	public static void main(String[] args) {
		Person p1=new Person();
		Scanner sc=new Scanner(System.in);
		String name;
		int age,sal;
		System.out.println("Enter Person Details: Name, Age and sal");
		name=sc.nextLine();
		age=sc.nextInt();
		sc.nextLine();
		sal=sc.nextInt();
		p1.setPersonName(name);
		p1.setPersonAge(age);
		p1.setPersonSal(sal);
		System.out.println("Person Detail Name:"+p1.getPersonName()+" "+p1.getPersonAge()+" "+p1.getPersonSal());
		
		
		
	}

}
