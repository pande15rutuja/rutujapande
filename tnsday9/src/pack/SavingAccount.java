package pack;

public class SavingAccount extends Customer implements Bank{
	private int accNo;
	private float balance;
	

	public SavingAccount(String name, String city, int accNo, float balance) {
		super(name, city);
		this.accNo = accNo;
		this.balance = balance;
	}
	

	public int getAccNo() {
		return accNo;
	}


	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}


	public float getBalance() {
		return balance;
	}


	public void setBalance(float balance) {
		this.balance = balance;
	}


	@Override
	public void deposit(float amount) {
		// TODO Auto-generated method stub
		if(amount<0 || amount>Deposit_Limit)
		{
			System.out.println("please deposit valid amount");
		}
		else
		{
			balance+=amount;
			System.out.println("Rs:"+amount+" is deposited successfully ");
		}
		
	}

	@Override
	public void withdraw(float amount) {
		// TODO Auto-generated method stub
		if(amount<=balance-MINBAL)
		{
			balance-=amount;
			System.out.println("Rs:"+amount+"withdraw is successfully");
			
		}
		else
		{
			System.out.println("Insufficent balance");
		}
		
	}


	@Override
	public String toString() {
		return "SavingAccount [accNo=" + accNo + ", balance=" + balance + ", name=" + name + ", getAccNo()="
				+ getAccNo() + ", getBalance()=" + getBalance() + ", getName()=" + getName() + ", getCity()="
				+ getCity() + "]";
	}
	

}
