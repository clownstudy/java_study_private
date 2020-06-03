package chatting;

import java.net.*;
import java.io.*;
import java.io.IOException;

public class MultiServerThread implements Runnable{
	// 선언
	private Socket socket;
	private MultiServer ms;
	private ObjectInputStream ois;
	private ObjectOutputStream oos;
	
	//생성자
	public MultiServerThread(MultiServer ms) {
		this.ms = ms;
	}
	@Override
	public void run() {
		//isStop 선언
		boolean isStop=false;
		// 소켓 받고
		socket = ms.getSocket();
		// 각 소켓에 입력과 출력 라인 받아와서
		try {
			ois = new ObjectInputStream(socket.getInputStream());
			oos = new ObjectOutputStream(socket.getOutputStream());
			String msg=null;
			// 입출력을 함 isStop이 false일 경우.
			while(!isStop) {
				msg = (String)ois.readObject();
				String[] str = msg.split("#");
				if(str[1].equals("exit")) {
					//모두에게 알리고
					broadCasting(msg);
					//isStop을 true로 바꿈
					isStop=true;
				}else {
					//모두에게 알리기
					broadCasting(msg);
				}
			}
			// while이 끝났다면 채팅이 끝난 것. 해당되는 클라이언트와 연결된 스레드 종료
			// thread는 클라이언트가 접속하면 클라이언트마다 연결되는 것이기 때문.
			ms.getList().remove(this);
			System.out.println(socket.getInetAddress()+" 정상 종료되었습니다.");
			// 누가 남았는지 확인
			System.out.println("list Size:"+ms.getList().size());
				
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public void broadCasting(String msg) throws IOException{
		for(MultiServerThread ct: ms.getList()) {
			ct.send(msg);
		}
}
private void send(String msg) throws IOException {
    oos.writeObject(msg);
    
}
}