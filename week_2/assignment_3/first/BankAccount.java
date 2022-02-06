package week_2.assignment_3.first;

import static week_2.assignment_3.first.CheckForException.*;

public class BankAccount {
	private int accNo;
	private String custName;
	private static AccountType accType; // using enum instead of string
	private static float balance;

	public BankAccount(int accNo, String custName, AccountType accType, float balance)
			throws LowBalanceException, NegativeAmountException {

		this.accNo = accNo;
		this.custName = custName;
		BankAccount.accType = accType;
		BankAccount.balance = balance;

		checkIfNegativeAmount(balance);
		checkIfLowBalance(accType, balance);

		System.out.println(
				String.format("Account created successfully for the customer: %s\nThe account number is: %d",
						this.custName, this.accNo));

	}

	void deposit(float amt) throws NegativeAmountException {
		checkIfNegativeAmount(amt);
		balance += amt;
		System.out.println(String.format("%.2f deposited successfully!", amt));
	}

	public void withdraw(float amt) throws NegativeAmountException, InsufficientFundException {
		checkIfNegativeAmount(amt);
		checkIfInsufficientFund(accType, balance, amt);
		balance -= amt;
		System.out.println(String.format("%.2f withdrawn successfully!", amt));
	}

	public float getBalance() throws LowBalanceException {
		checkIfLowBalance(accType, balance); // LowBalanceException won't be thrown from getBalance() anyway!
		return balance;
	}
}
