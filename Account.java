package account;

public class Account {
	private double bvn;
	private String name;
	private String accountType;
	private double balance;
	private boolean isActive;
	
	public double getBvn() {
		return bvn;
	}
	public void setBvn(double bvn) {
		this.bvn = bvn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	public double credit(double money) {
		double deduction = (5 * money) / 100;
		double result = money - deduction;
		if (deduction <= 10000) {
			result = money;
		}
		
		return result;
	}
}
