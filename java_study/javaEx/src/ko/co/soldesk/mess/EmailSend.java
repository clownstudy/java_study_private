package ko.co.soldesk.mess;

public class EmailSend implements MessageSend {

	@Override
	public void sendMassage(String receiver, String content, String sender) {
		System.out.println("받는 주소: "+receiver+"에게 메일전송");
		System.out.println("제목 : 솔데스크");
		System.out.println("내용: "+content);
		System.out.println("보내는 주소: "+sender);
	}

}
