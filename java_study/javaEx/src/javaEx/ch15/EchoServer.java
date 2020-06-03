package javaEx.ch15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
	// 통신을 위해선 데이터 읽기 쓰기가 필요함.
	// 입출력 stream이 reader, writer
	// 버퍼를 활용하면 일시에 flush가 가능해서 빨라짐. (버퍼 활용 이유 - 속도 차)
	
	private BufferedReader bfr;
	private BufferedWriter bfw;
	private InputStream is;
	private OutputStream os;
	private ServerSocket serverSoc;
	
	public EchoServer(int port) {
		try {
			serverSoc = new ServerSocket(port); // 서버 생성
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(0);
		}
		while(true) {
			System.out.println("클라이언트 요청 대기중");
			try {
				Socket tclient = serverSoc.accept();
				System.out.println("클라이언트 IP주소: "+tclient.getInetAddress().getHostAddress());
				// 클라이언트와 입출력을 위한 연결 완성.
				is = tclient.getInputStream();
				os = tclient.getOutputStream();
				bfr = new BufferedReader(new InputStreamReader(is));
				bfw = new BufferedWriter(new OutputStreamWriter(os));
				String msg = bfr.readLine();
				System.out.println("수신 메시지: "+msg);
				// 선추가하여 분리
				msg += System.getProperty("line.separator");
				// 받은메시지 다시 클라이언트에 전달
				bfw.write(msg);
				bfw.flush();
				bfr.close();
				bfw.close();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				if(bfr!=null)
					try {
						bfr.close();
					} catch (IOException e) {}
				if(bfw!=null)
					try {
						bfw.close();
					} catch (IOException e) {}
				if(is!=null)
					try {
						is.close();
					} catch (IOException e) {}
				if(os!=null)
					try {
						os.close();
					} catch (IOException e) {}
			}
		}
		
	}// 생성자  close; 
	
	public static void main(String[] args) {
		new EchoServer(5000);
}
}
