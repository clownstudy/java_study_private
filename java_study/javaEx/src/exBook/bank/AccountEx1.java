package exBook.bank;

import exBook.bank.exception.OwnerAcceptException;

public class AccountEx1 {
	public static void main(String[] args) throws Exception {
		Account hkd = new Account("홍길동", "010-1111-2222");

		// 10만원 입금
		//hkd.ownerAcceptMethod("홍길동", "010-1111-2222");
		int balance=0;
		for(int i=0; i<3; i++) {
		try {
			balance = hkd.deposit(100000);
			System.out.println("입금 후 잔액은 "+balance+"입니다.");
			break;
		} catch(OwnerAcceptException e) {
			System.out.println("1. "+e.getMessage());
			if(!hkd.isOwnerAccept()) {
				hkd.ownerAcceptMethod("홍길동", "010-1111-2222");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		}
		
		// 잔액 조회
		for(int j=0; j<3; j++) {
		try {
			balance = hkd.getBalance();
			System.out.println("현재 잔액은 "+balance+"입니다.");
			break;
		} catch (OwnerAcceptException e) {
			System.out.println("2. "+e.getMessage());
			if(!hkd.isOwnerAccept()) {
				hkd.ownerAcceptMethod("홍길동", "010-1111-2222");;
			}
			continue;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		}
		
		// 출금
		try {
			System.out.println(hkd.withdraw(200000)+"가 출금됩니다");
		} catch (Exception e) {
			// 오류가 난 모든 걸로 확인 가능
			// e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}
