package com.test01;

import java.net.URI;
import java.net.URISyntaxException;

public class MTest01 {
	
	public static void main(String[] args) throws URISyntaxException {
		
		URI u = new URI("http://localhost:8787/Java19_URI_Web/res.jsp?myname=%EA%B0%95%EB%AA%BD&myaddr=%EC%84%9C%EC%9A%B8%EC%8B%9C+%EB%8F%84%EB%B4%89%EA%B5%AC");
			
		System.out.println(u.getScheme());
		System.out.println(u.getHost());
		System.out.println(u.getPort());
		System.out.println(u.getPath());
		System.out.println(u.getQuery());
		
	}

}
