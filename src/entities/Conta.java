package entities;

public class Conta {
	private int numberAccount;
	public String holder;
	private double balance;
	
	public Conta(int numberAccount, String holder) {
		this.numberAccount = numberAccount;
		this.holder = holder;
	}
	
	public Conta(int numberAccount, String holder, double initialDeposit) {
		this.numberAccount = numberAccount;
		this.holder = holder;
		deposit(initialDeposit);	//initialDeposit entra no lugar de ammount na funçao deposit//
	}
	
	public int getNumberAccount() {
		return numberAccount;
	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public double getBalance() {
		return balance;
	}
	public void deposit(double ammount) {
		balance = ammount + balance;
	}
	public void withdraw(double withdrawValue) {
		balance = balance - withdrawValue - 5.0;
	}
	
	
	public String toString() {
		return "Account " 
				+ numberAccount
				+ ", Holder: "
				+ holder
				+ ", Balance: $ "
				+ String.format("%.2f", balance);
	}
}
	
	