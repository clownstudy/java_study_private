package kr.co.soldesk.car;

public abstract class Car {
	/*
	추상 클래스
		1. 추상 메소드를 하나 이상 갖고 있음(일반 메소드도 있을 수 있음.)
		2. 인스턴스화(객체화)가 안됨.
		3. 주 역할 : 상속을 위한 클래스
		
	*/
	private int wheel;
	private int doors;
	private String color;
	
	
	public Car(int wheel, int doors, String color) {
		this.wheel = wheel;
		this.doors = doors;
		this.color = color;
	}
	// alt+shift+s > Generate Getter and Setter
	// alt+shift+? > 메뉴 불러오기.
	public int getWheel() {
		return wheel;
	}
	public void setWheel(int wheel) {
		this.wheel = wheel;
	}
	public int getDoors() {
		return doors;
	}
	public void setDoors(int doors) {
		this.doors = doors;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public abstract void start();
	public abstract void drive();
	public abstract void reDrive();
	public abstract void stop();
	
	
}
