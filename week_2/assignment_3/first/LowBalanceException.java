package week_2.assignment_3.first;

public class LowBalanceException extends Exception {

	private static final long serialVersionUID = 1L;

	public LowBalanceException(String str) {
		super(str);
	}
}
