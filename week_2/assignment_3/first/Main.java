package week_2.assignment_3.first;

public class Main {

	public static void main(String[] args) {

		try {
			BankAccount b = new BankAccount(1000, "Arpan Sardar", AccountType.SAVINGS, 10000);
			System.out.println(String.format("The available account balance is: %.2f", b.getBalance()));
			b.deposit(9001);
			System.out.println(String.format("The available account balance is: %.2f", b.getBalance()));
			b.withdraw(10000);
			System.out.println(String.format("The available account balance is: %.2f", b.getBalance()));
			b.withdraw(9000);
		} catch (LowBalanceException | NegativeAmountException | InsufficientFundException e) {
			System.out.println(e.getMessage());
		}

	}

}
