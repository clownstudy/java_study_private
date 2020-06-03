package javaEx.ch15;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPEchoServer {
	public UDPEchoServer(int port) {
		try {
			DatagramSocket dsocket = new DatagramSocket(port);
			while(true) {
				byte buffer[]=new byte[512];
				DatagramPacket dp = new DatagramPacket(buffer,  buffer.length);
				System.out.println("준비");
				// 클라이언트가 보내는 데이터를 패킷 단위로 받겠다라는 얘기.
				// tcp의 accept 역할 (receive가)
				dsocket.receive(dp);
				String str = new String(dp.getData());
				System.out.println("수신 데이터: "+str);
				//클라이언트가 보낸 데이터 출력까지
				//Echo 작업 중
				InetAddress ia = dp.getAddress();
				port = dp.getPort();
				System.out.println("Client IP"+ia);
				System.out.println("Client port"+port);
				dp = new DatagramPacket(dp.getData(), dp.getData().length, ia, port);
				dsocket.send(dp);
			}
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			
		}
	}
	
	public static void main(String[] args) {
		new UDPEchoServer(2000);
	}
}
