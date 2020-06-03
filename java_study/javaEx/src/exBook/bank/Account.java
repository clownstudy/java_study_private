package exBook.bank;

import exBook.bank.exception.OwnerAcceptException;

public class Account {
	// 계좌 번호, 계좌주이름 , 잔액 필드 존재, 계좌주 전화번호, 계좌주확인필드(참,거짓)
		private String accountNumber;
		private String ownerName;
		private String ownerTel;
		private int balance;
		private boolean ownerAccept = false;
		
		public boolean isOwnerAccept() {
			return ownerAccept;
		}
	public Account(String name, String tel) {
			this.ownerName = name;
			this.ownerTel = tel;
			accountNumber = "1004000200030";
		}

		// 계좌주확인, 잔액조회, 입금, 출금 기능 존재	
		protected int getBalance() throws Exception {
			if(ownerAccept) {
			return balance;
			} else {
				throw new OwnerAcceptException("계좌주 확인필요");
			}
		}
		
		protected void ownerAcceptMethod(String name, String tel) {
			if(name.equals(this.ownerName)&&tel.equals(this.ownerTel))
				this.ownerAccept = true;
			else this.ownerAccept = false;
		}
		
		protected int deposit(int dm) throws Exception {
			if(ownerAccept) {
				this.balance+=dm;
				return this.balance;
			} else {
				throw new OwnerAcceptException("계좌주 확인필요");
			}
		}
		
		protected int withdraw(int wm) throws Exception {
			if(ownerAccept) {
				if(balance >=wm) {
					this.balance-=wm;
					return this.balance;
				} else {
					throw new Exception("잔액 부족");
				}
			} else {
				throw new OwnerAcceptException("계좌주 확인필요");
			}
	}
}