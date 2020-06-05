package com.test01;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MTest02 {
	
	public static void main(String[] args) {
		File fi = new File("a.txt");
		
		try {
			myOutput(fi);
			myInput(fi);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	
	//read()
	private static void myInput(File fi) throws IOException {
		FileReader fr = new FileReader(fi);
		
		int ch;
		
		// -1 : file의 끝
		while((ch = fr.read())!= -1) { //파일에서 값가져와서 ch에다가 담음
			System.out.print((char)ch);
		}
		
		fr.close();
		
	}
	
	//write()
	private static void myOutput(File fi) throws IOException {
		//해당 메소드를 호출한 애한테 예외미룸
		FileWriter fw = new FileWriter(fi, true);
		fw.write("연습중입니다.\n");
		fw.append("abc\n").append("def\n").append("ghi\n");   // append : writer객체 리턴  
		// .append("") -> 체인
		
		fw.close();
		
	}
	
	

}
