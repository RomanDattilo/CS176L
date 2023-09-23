package cs176;

public class BankInfo {

	public static void main(String[] args) {
		BankAccount Roman = new BankAccount("Roman", 1000);
		Roman.deposit(250);
		Roman.withdraw(50);
		System.out.println(Roman.getBalance());



	}

}
