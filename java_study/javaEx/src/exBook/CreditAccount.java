package exBook;

import exBook.exception.EmptyBalanceException;

public class CreditAccount extends Account {
// 대출가능금액(-통장)
// 계좌번호, 이름, 잔액, 대출가능 금액
// 생성자를 2가지로 만들기 -- 잔액 있는 것 없는 것
	 int amountLimit;
	// 잔액이 있는 생성자.
	public CreditAccount(String accountNo, String ownerName, int balance, int amountLimit) {
		super(accountNo, ownerName, balance);
		this.amountLimit = amountLimit;
	}
	// 잔액이 없는 생성자.
	public CreditAccount(String accountNo, String ownerName, int amountLimit) {
		super(accountNo, ownerName);
		this.amountLimit = amountLimit;
	}
	// 오버 라이딩.
	public int withdraw(int money) throws EmptyBalanceException {
		if(getBalance()+amountLimit >= money) {
			setBalance(getBalance()-money);
			return money;
		} else {
			throw new EmptyBalanceException("인출 가능 금액이 부족ㅎㅏ다");
		}
			
	}
}
