//소켓 프로그래밍 : 소켓을 이용한 통신 프로그래밍을 뜻함, 소켓이란 프로세스간의 통신에 사용디는 양쪽 끝단을 의미함
//UDP

package com.test02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class MyServer {
	
	public static void main(String[] args) throws IOException {
		
		System.out.println("서버입니다.");
	
		
		DatagramSocket ds = new DatagramSocket(8888);
		//8888 포트 가지고 서버생성
		
		// 포트 8888을 넣어줌 -> 내가 만들 서버의 포트넘버는 8888번
		//(데이터그램 소켓은 데이터그램을 전송할 뿐만 아니라 수신에서 사용할 수 있습니다.)
		
		byte[] buff = new byte[1024];
		//받을 방(1024개의 방을 가진) 생성
		
		DatagramPacket recievePacket = new DatagramPacket(buff, buff.length);
		//받을 방을 Packet으로 감쌌다.
		// DatagramPacket 클래스는 애플리케이션에서 주고 받을 데이터와 관련된 클래스이고,
		// DatagramSocket 클래스는 실제 데이터의 전송을 책임지게 됩니다. 
		
		ds.receive(recievePacket);
		//데이터 받는다.
		//send로 받은 UDP 데이터그램으로 이미 존재하는 DatagramPacket객체인 recievePacket에 저장한다.
		System.out.println(new String(recievePacket.getData()));
		//받은 데이터byte형태를 String형태로 바꿔서 출력
		
		ds.close(); //소켓연결 종료
		ds.disconnect();
		
		
	}

}
