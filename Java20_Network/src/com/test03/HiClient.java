//TCP

package com.test03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket; //소켓은 각 포트를 사용하여 통신을 수행하는 도구이다.
import java.net.UnknownHostException;

public class HiClient implements Runnable {
	
	public void run() {
		
		try {
			Socket clientSocket;
			PrintWriter out = null;
			BufferedReader in = null;
			BufferedReader stdin = null;
			
			
			System.out.println("서버에 접속중 입니다...");
			
			clientSocket = new Socket("localhost", 9999);
			//클라이언트 생성
			//클라이언트가 서버에 연결 요청을 할 때 java.net.Socket을 이용.
			//Socket 객체를 생성하고 동시에 연결 요청을 하려면 생성자의 매개값으로 서버의 IP주소와 바인딩 포트 번호를 제공

			
			out = new PrintWriter(clientSocket.getOutputStream(),true);
			//clientSocket에서 나갈꺼야 true는(autoflush, 없으면 전달이 안됨) 버퍼에 담아둔 데이터를 보내줌
			
			//clientSocket의 출력 스트림을 얻어와서 문자 출력 스트림에 출력
			
			in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
			//clientSocket 통로에서 들어온 서버에서 보내준것을 한줄씩 받자
			//clientSocket의 입력 스트림을 얻어와서 읽기
			
			stdin = new BufferedReader(new InputStreamReader(System.in));
			//콘솔창에서 입력된것을 InputStreamReader(바이트로 되어 있는 데이터)로 받아서 한줄씩 읽기
			//버퍼링 뭉텅뭉텅 가져와서 한번에 보도록
			
			String inputLine;
			
			while((inputLine = stdin.readLine()) != null) {
				//콘솔 창에서 한 줄씩 읽어서 inputLine에 넣은 후 null이 아니면 실행
				out.println(inputLine);
				System.out.println("server로부터 다시 받은 메세지 :"+ in.readLine());
				//나에게 들어온 데이터(in) 한줄씩 입력해주자
			}
			
			out.close();
			in.close();
			stdin.close();
			clientSocket.close();
			
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		Thread client = new Thread(new HiClient());
		client.start();
	}

}
