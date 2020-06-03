package exBook;
import exBook.CheckCardAccount;
import exBook.exception.EmptyBalanceException;
public class AccountEx2 {
	public static void main(String[] args) throws Exception {
		// 계좌주는 장나라, 계좌번호는 233-333-4445, 잔액 5000000원
		// 카드번호는 2323-5656-7788
		CheckCardAccount j = new CheckCardAccount();
		j.setOwnerName("장나라");
		j.setAccountNo("233-333-4445");;
		j.setBalance(5000000);
		j.setCardNo("2323-5656-7788");

		try {
			j.cardPay("2323-5656-7788", 1000000);
			System.out.println("지불 성공");
		} catch (EmptyBalanceException e) { 
			System.out.println(e.getMessage());
		} catch (CardNoMissMatchException e) {
			System.out.println(e.getMessage());
		} 
	
	}
}
