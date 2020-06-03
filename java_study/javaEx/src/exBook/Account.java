package exBook;

import exBook.exception.EmptyBalanceException;

public class Account {

// 계좌번호 계좌주이름 잔액 -- 내부에서 사용하는 접근 제한자
// getter와 setter만들기(잔액 조회 기능)
// 입금(잔액에 += 금액(돈), 출금-=금액 -- 잔액 부족하면 exception
	
	
	private String accountNo;
	private String ownerName;
	private int balance;
	// 생성자
	public Account() {}

	public Account(String AccountNo, String OwnerName) {
		this.accountNo = AccountNo;
		this.ownerName = OwnerName;
	}
	
	public Account(String AccountNo, String OwnerName, int Balance) {
		this.accountNo = AccountNo;
		this.ownerName = OwnerName;
		this.balance = Balance;
	}
	
	
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void deposit(int money) {
		balance += money;
	
	}
	
	public int withdraw(int money) throws EmptyBalanceException {
		if(balance >= money) {
		balance -= money;
		return money;
		} else {
			throw new EmptyBalanceException("잔액 부족");
		}
	}

}
