//소켓 프로그래밍 : 
//소켓을 이용한 통신 프로그래밍을 뜻함, 소켓이란 프로세스간의 통신에 사용되는 양쪽 끝단을 의미함

//UDP
package com.test02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class MyClient {
	
	public static void main(String[] args) throws IOException {
		
		System.out.println("클라이언트 입니다.");
		
		DatagramSocket ds = new DatagramSocket();
		//클라이언트 생성 (server와 달리 포트가 없다.)
		//데이터그램 소켓은 데이터그램을 전송할 뿐만 아니라 수신에서 사용할 수 있습니다.
		
		//보낼 데이터
		byte[] buff = "연습입니다.".getBytes();
		
		DatagramPacket sendPacket = new DatagramPacket(buff, buff.length, InetAddress.getByName("localhost"), 8888);
		//Packet으로 감싼다. (보낼애, 보낼애크기, 보낼 목적지 주소, 목적지 방문 번호)
		// DatagramPacket 클래스는 애플리케이션에서 주고 받을 데이터와 관련된 클래스이고, DatagramSocket 클래스는 실제 데이터의 전송을 책임지게 됩니다. 

		
		ds.send(sendPacket); 
		//데이터 보낸다.
		// 연습입니다 데이터가 DatagramPacket으로 감싸진 형태로 보내짐
		//UDP 데이터그램을 전송하는 메소드
		
		ds.close(); 
		//데이터 그램 소켓이 점유하고 있는 포트를 자유롭게 놓아준다.
		
		ds.disconnect();
		//현재 연결된 DatagramSocket의 연결을 끊는다. 
		//연결이 끊기면 아무것도 하지 못하게 된다.
	
	
	}

}
