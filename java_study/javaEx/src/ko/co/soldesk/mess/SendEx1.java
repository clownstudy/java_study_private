package ko.co.soldesk.mess;

public class SendEx1 {
	public static void main(String[] args) {
	// 인터페이스도 다형성으로 사용이 가능
		MessageSend m[] = {
			new SMSSend(),
			new FaxSend(),
			new EmailSend()
		};
		for(MessageSend mes : m) {
			if(mes instanceof SMSSend) {
				mes.sendMassage("010-2137-6974", "재미있는 다형성", "010-9070-6974");
			}else if (mes instanceof FaxSend) {
				mes.sendMassage("02-999-9482", "fax로 보내는 다형성", "02-283-3928");
			}else {
				mes.sendMassage("a@gmail.com", "메일로 보내는 다형성", "s@gmail.com");
			}
		}

	}
};