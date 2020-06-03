package javeEx.InterfaceEx;
// final 은 클래스 상속이 불가능하다.
final public class InterfEx implements Inter5 {
	int data = 100;
	@Override
	public int meth2() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	public int meth1() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public int meth4() {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	public int printData() {
		// TODO Auto-generated method stub
		return VALUE;
	}
	
	@Override
	public int getData() {
		// VALUE = 100; 상수값이라서 재할당 불가.
		return data;
	}
	
	
// 생성 시 new InterfEx();
	/*
	 아래 내용들 가능
	 Inter1 i1 = new InterfEx();  -- meth1() 만 사용 가능
	 Inter2 i2 = new InterfEx();  -- meth1(), meth2() 만 사용 가능
	 Inter3 i3 = new InterfEx();  -- meth1(), meth2(), getData() 만 사용 가능
	 Inter4 i4 = new InterfEx();  -- meth1(), meth2(), getData(), meth4() 만 사용 가능
	 Inter5 i5 = new InterfEx();  -- meth1(), meth2(), getData(), meth4(), printData() 만 사용 가능
	 */
	//final 이 붙으면 override가 불가.
	public final int interMethod() {
		return 300;
	}
}
