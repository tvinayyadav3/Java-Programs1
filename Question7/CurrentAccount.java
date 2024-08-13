import Question7.BankAccount;

public class CurrentAccount extends BankAccount {
	int currBal = 15000;

	@Override
	void deposit(int deposit) {
		this.deposit = deposit;
		deposit += currBal;
		System.out.println("Amt after deposit: " + deposit);

	}

	@Override
	void withdraw(int withdraw) {
		this.withdraw = withdraw;
		withdraw = currBal - withdraw;
		System.out.println("Amt after withdraw: " + withdraw);
	}

	public static void main(String[] args) {
		SavingsAccount obj = new SavingsAccount();
		System.out.println("Curr Bal: " + obj.currBal);
		obj.deposit(1000);
		obj.withdraw(2000);
		CurrentAccount obj1 = new CurrentAccount();
		System.out.println("Curr Bal: " + obj1.currBal);
		obj1.deposit(1000);
		obj1.withdraw(2000);

	}

}
