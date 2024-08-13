package Question7;

public abstract class BankAccount {
	int currBal = 5000;
	int deposit;
	int withdraw;

	abstract void deposit(int deposit);

	abstract void withdraw(int withdraw);

}
