import Question7.BankAccount;

public class SavingsAccount extends BankAccount {
	int currBal = 10000;

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
		// TODO Auto-generated method stub

	}

	// public static void main(String[] args) {
	// SavingsAccount obj=new SavingsAccount();
	// System.out.println("Curr Bal: "+obj.currBal);
	// obj.deposit(1000);
	// obj.withdraw(2000);
	//
	// }

}
