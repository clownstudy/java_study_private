package exBook;

import exBook.exception.EmptyBalanceException;

public class AccountEx4 {
	public static void main(String[] args) {
		// 김구라, "959-595-3733", 대출 가능 금액 600만원.
		
		// 인출 200만원
		// 인출 후 잔액 알려주기.

		CreditAccount k = new CreditAccount("959-595-3733", "김구라", 6000000);
		try {
			int don = k.withdraw(2000000);
			System.out.println(k.getOwnerName()+"님의 계좌에서 "+don+"원이 인출되었습니다.");
			System.out.println("잔액은 "+k.getBalance()+"이며, 추가 인출 가능 금액은 "+(k.amountLimit-don)+"원입니다.");
		} catch (EmptyBalanceException e) {
			System.out.println(e.getMessage());
		} 
		
	}
}
