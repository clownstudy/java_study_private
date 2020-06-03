package exBook;

import exBook.exception.EmptyBalanceException;

public class AccountEx1 {
	public static void main(String[] args) throws Exception {
		Account k = new Account();
		k.setOwnerName("강호동");
		k.setAccountNo("111-222-333");
		k.setBalance(1000000);
		
		Account l = new Account();
		l.setOwnerName("이민정");
		l.setAccountNo("123-123-555");
		l.setBalance(2000000);
		
		k.deposit(3000000);
		l.deposit(2000000);
			int getMoney=0;
			try {
				getMoney = k.withdraw(1500000);
				System.out.println(k.getOwnerName()+"님의 계좌에서 "+getMoney+"만원이 인출되었습니다. 현재 잔액은 "+k.getBalance()+"원입니다.");
				getMoney = l.withdraw(1000000);
				System.out.println(l.getOwnerName()+"님의 계좌에서 "+getMoney+"만원이 인출되었습니다. 현재 잔액은 "+l.getBalance()+"원입니다.");
			} catch (EmptyBalanceException e) {
				System.out.println(e.getMessage());
			}
	}
}
