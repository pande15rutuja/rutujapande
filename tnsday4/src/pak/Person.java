package pak;

public class Person {
	private String personName;
	private int personAge;
	private int personSal;
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public int getPersonAge() {
		return personAge;
	}
	public void setPersonAge(int personAge) {
		this.personAge = personAge;
	}
	public int getPersonSal() {
		return personSal;
	}
	public void setPersonSal(int sal) {
		this.personSal = sal;
	}
	@Override
	public String toString() {
		return "Person [personName=" + personName + ", personAge=" + personAge + ", personSal=" + personSal + "]";
	}
	
	

}
