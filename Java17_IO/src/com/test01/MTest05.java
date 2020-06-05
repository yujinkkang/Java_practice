package com.test01;

import java.io.File;
//폴더면 dir:
//파일이면 file:
//dir의 총갯수: 개
//file의 촏갯수 : 개
public class MTest05 {
	
	public static void main(String[] args) {
		File fi = new File("c:\\");
		//prn01(fi);
		prn02(fi);
		
	}
	
	public static void prn01(File fi) {
		
		for(String list : fi.list()) {
			System.out.println(list);
		}
	}
	
	public static void prn02(File fi) {
		
		int dirCnt = 0;
		int fileCnt =0;
		
		for(File list : fi.listFiles()) {
			if(list.isDirectory()) {
				System.out.println("dir : " + list.getName());
				dirCnt++;
			}else if(list.isFile()){
				System.out.println("file : " + list.getName());
				fileCnt++;
			}
		}
		System.out.println("dir의 총갯수: " + dirCnt);
		System.out.println("filed의 총갯수: " + fileCnt);
		
		
	}

}
