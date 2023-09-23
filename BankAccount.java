package cs176;

public class BankAccount {

	public String account_name;
	public double balance;
	
	public BankAccount(String name, double balanceNumber) {
		account_name = name;
		balance = 0;
	}
	public BankAccount() {
		account_name = "Roman";
		balance = 0.0;
	}
	public void  deposit(double balanceNumber) {
		balance += balanceNumber;
	}
	public void withdraw(double balanceNumber) {
		balance -= balanceNumber;
	}
public double getBalance() {
	return balance;
  
}}
