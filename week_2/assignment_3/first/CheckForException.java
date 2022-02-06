package week_2.assignment_3.first;

public class CheckForException {

	static void checkIfNegativeAmount(float amt) throws NegativeAmountException {
		if (amt < 0)
			throw new NegativeAmountException("Invalid amount!\nThe amount can't be negative...");
	}

	static void checkIfLowBalance(AccountType acc_type, float amt) throws LowBalanceException {
		if (acc_type == AccountType.SAVINGS && amt < 1000) {
			throw new LowBalanceException("Low balance...\nA savings account must have a minimum balance of 1000.00");
		} else if (acc_type == AccountType.CURRENT && amt < 5000) {
			throw new LowBalanceException("Low balance...\nA current account must have a minimum balance of 5000.00");
		}
	}

	static void checkIfInsufficientFund(AccountType acc_type, float bal, float amt) throws InsufficientFundException {
		if (acc_type == AccountType.SAVINGS && (bal - amt) < 1000) {
			throw new InsufficientFundException(
					"Insuffient balance...\nA savings account must maintain a minimum balance of 1000.00\n"
							+ String.format("Your account balance is %.2f ", bal)
							+ String.format("and you're trying to withdraw %.2f", amt));
		} else if (acc_type == AccountType.CURRENT && (bal - amt) < 5000) {
			throw new InsufficientFundException(
					"Insuffient balance...\nA current account must maintain a minimum balance of 5000.00\n"
							+ String.format("Your account balance is %.2f ", bal)
							+ String.format("and you're trying to withdraw %.2f", amt));
		}
	}

}
