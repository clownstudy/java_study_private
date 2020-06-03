package ko.co.soldesk.mess;

public interface MessageSend {
	// 인터페이스는 특수한 클래스
	// 실제로 클래스의 역할이 아니라 접속하는 창구 역할을 함.
	// 인터페이스는 추상 메소드로만 이루어져 있음
	// 접근제한자가 public
	// 자바버전업으로 특별한 메소드를 일반 메소드로 만들 수 있음
	
	public void sendMassage(String receiver, String content, String sender);
		
}
