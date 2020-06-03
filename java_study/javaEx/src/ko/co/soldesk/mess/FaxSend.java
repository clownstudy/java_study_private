package ko.co.soldesk.mess;

public class FaxSend implements MessageSend {

	@Override
	public void sendMassage(String receiver, String content, String sender) {
		System.out.println("받는 사람: "+receiver+"에게 팩스전송");
		System.out.println("내용: "+content);
		System.out.println("보내는 사람: "+sender);
	}

}
