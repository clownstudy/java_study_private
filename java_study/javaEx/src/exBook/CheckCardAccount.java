package exBook;

import exBook.exception.EmptyBalanceException;

public class CheckCardAccount extends Account {
// 카드 번호 추가. 카드번호는 최소 접근제한(private)
// 카드 번호에 대한 getter와 setter 추가
	private String cardNo;
	private int donjunda;
	// 생성자 만들기
	public CheckCardAccount() {}
	// 값을 4개 다 받아서 하나는 여기서 넣고 나머지 3개는 슈퍼클래스 생성자 활용.
	public CheckCardAccount(String accountNo, String ownerName,int balance, String cardNo) {
		super(accountNo, ownerName, balance);
		this.cardNo = cardNo;
	}
	
	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
// 카드번호를 생성자 없이 넣는다.(실행 시)
	
	
// 카드로 결제 기능도 추가. 카드 번호가 일치해야함. 잔액이 존재해야함.) -- cardPay
	// 카드번호, 지불금액
		// 카드번호 확인 후 일치 여부 확인.
		// 일치 시 지불 금액을 balance에서 빼고 지불되었습니다. 라고 출력
	public boolean cardPay(String cardNum, int donjunda) throws EmptyBalanceException,CardNoMissMatchException {
		this.setDonjunda(donjunda);
		if(this.cardNo.equals(cardNum)) {
			// 2번에서 할 때만 if(getBalance() >= donjunda) { // 잔액 부족 시 withdraw에서 알아서 처리해줌.
				// 1. withdraw 이용
					withdraw(donjunda);
				// 2. setBalance 이용
				// setBalance(getBalance()-donjunda);
		} else { // 카드번호 불일치 CardNoMissMatch 라는 exception 생성
			throw new CardNoMissMatchException("카드 번호 불일치");
		}
		return true;
	}
/* 내가 하던거
	int conBalance = super.getBalance();
	public int subbalance(int don) throws EmptyBalanceException {
		if(conBalance >= don) {
			conBalance -= don;
			return conBalance;
		} else {
			throw new EmptyBalanceException("잔액 부족");
		}
	}
 */
	public int getDonjunda() {
		return donjunda;
	}
	public void setDonjunda(int donjunda) {
		this.donjunda = donjunda;
	}
	
	
}
