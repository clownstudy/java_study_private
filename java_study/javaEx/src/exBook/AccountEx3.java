package exBook;

import exBook.exception.EmptyBalanceException;

public class AccountEx3 {
	public static void main(String[] args) {
		//유재석, 계좌번호 888-343-8989
		//잔액 900만원
		//카드번호 1234-5678-3434
		CheckCardAccount u = new CheckCardAccount("888-343-8989","유재석",9000000,"1234-5678-3434");
//		
//		CheckCardAccount u = new CheckCardAccount();
//		u.setOwnerName("유재석");;
//		u.setAccountNo("888-343-8989");
//		u.setBalance(9000000);
//		u.setCardNo("1234-5678-3434");
//		
		//체크 카드를 사용하는데, 300만원 지불하려고 함. 참값이 들어오면 "정상적으로 지불되었습니다"
		try {
			boolean success = u.cardPay("1234-5678-3434", 3000000);
			if(success) {
				System.out.println(u.getDonjunda()+"원 지불 성공");
			}
		}	catch (EmptyBalanceException e) {
			System.out.println(u.getDonjunda()+"원 지불실패"+e.getMessage());
		} catch (CardNoMissMatchException e) {
			System.out.println(u.getDonjunda()+"원 지불실패"+e.getMessage());
		}
		
		try {
			u.cardPay("1234-5678-3434", 300000000);
			System.out.println(u.getDonjunda()+"원이 정상적으로 지불되었습니다."+u.getBalance());
		} catch (EmptyBalanceException e) {
			System.out.println(u.getDonjunda()+"원 지불실패 "+e.getMessage());
		} catch (CardNoMissMatchException e) {
			System.out.println(u.getDonjunda()+"원 지불실패 "+e.getMessage());
		}
		
		// 카드 번호를 다르게 지불하려고 함(50만)
		// 오류가 나는 경우
		
		try {
			u.cardPay("123", 500000);
		} catch (EmptyBalanceException e) {
			System.out.println(u.getDonjunda()+"원 지불실패 "+e.getMessage());
		} catch (CardNoMissMatchException e) {
			System.out.println(u.getDonjunda()+"원 지불실패 "+e.getMessage());
	}
}
}