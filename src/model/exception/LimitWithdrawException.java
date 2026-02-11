package model.exception;

public class LimitWithdrawException extends Exception{
	private static final long serialVersionUID = 1L;

	public  LimitWithdrawException(String msg) {
		super(msg);
	}
}
