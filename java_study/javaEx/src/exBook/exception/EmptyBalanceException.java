package exBook.exception;

public class EmptyBalanceException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 7748117663979757931L;

	public EmptyBalanceException(String msg) {
		super(msg);
	}
}
