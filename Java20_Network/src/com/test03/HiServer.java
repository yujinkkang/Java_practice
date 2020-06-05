//TCP
/*
 * 1. 서버프로그램에서는 서버 소켓을 사용해서 서버 컴퓨터의 특정 포트에서 클라이언트의 연결요청을 처리할 준비를 한다.
 * 2. 클라이언트 프로그램은 접속할 서버의 IP 주소와 포트 정보를 가지고 소켓을 생성해서 서버에 연결을 요청한다.
   3. 서버소켓은 클라이언트의 연결요청을 받으면 서버에 새로운 소켓을 생성해서 클라이언트의 소켓과 연결되도록 한다.
   4. 이제 클라이언트의 소켓과 새로 생성된 서버의 소켓은 서버소켓과 관계없이 일대일 통신을 한다.
 */



package com.test03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class HiServer {
	
	public static void main(String[] args) throws IOException {
		
		ServerSocket serverSocket = null;
		Socket serviceSocket;
		PrintWriter out = null;
		BufferedReader in = null; 
		
		try {
			serverSocket = new ServerSocket(9999);  
			//서버생성
			//ServerSocket 클래스로 객체를 만듬
			// 포트 9999를 넣어줌 -> 내가 만들 서버의 포트넘버는 9999번
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		while(true) {
			System.out.println("client를 기다립니다...");
			
			serviceSocket = serverSocket.accept();
			// 클라이언트가 들어오는 것을 대기
			// 즉 클라이언트가 9999포트로 연결을 시도한다면 accept 메소드는 대기를 풀고,
			// 클라이언트와 연결시키는 Socket 클래스를 생성하여 반환
			//accept메소드로부터 받은 serviceSocket이 바로 클라이언트랑 1:1 연결된 소켓
			//serviceSocket으로 클라이언트와 통신가능
			
			System.out.println("client가 접속했습니다.");
			
			in = new BufferedReader(new InputStreamReader(serviceSocket.getInputStream()));
			//클라이언트와 연결된 소켓으로 부터 getInputStream 객체를 가져온다.
			//InputStreamReader 는 바이트 스트림에서 문자 스트림으로, 
			//한줄 읽어온다(버퍼를 이용해서)
			
			
			out = new PrintWriter(serviceSocket.getOutputStream(), true);
			//getOutputStream을 통해 연결된 클라이언트에게 출력
			//출력하기
			
			String inputLine;
			
			while((inputLine = in.readLine()) != null) {
				//클라이언트가 보내주는 애가 null이아니면
				//한 줄씩 읽어서 inputLine에 넣은 후 null이 아니면 실행
				
				System.out.println("client가 보낸 메세지 :" + inputLine);
				out.println("*" + inputLine);
				//client에게 * 붙여서 다시 보내주자
				
			}
			//반복
			
			out.close();  // 입력스트림을 닫고 사용하던 자원들을 푼다.
			in.close();
			serviceSocket.close();
			serverSocket.close();
			
			
		}
		
		
		
		
		
	}

}
