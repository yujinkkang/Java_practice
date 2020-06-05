package com.test02;

public class Gugu {

	public static void main(String[] args) {
		gugu01();
		gugu02(7);
		gugu03();

	}
	
	public static void gugu01() {
		// 2단 ~ 9단까지 전체 출력 (for)
		
		for(int i= 2; i<10 ; i++ ) {
			System.out.printf("<%d단>\n",i);
			
			for(int j =1; j<10; j++) {
				int a = i*j;
				System.out.printf("%d"+"*"+"%d"+"="+"%d",i,j,a);
				//System.out.printf("%d * %d = %d\n", i,j, i*j);
				System.out.println();
			}
			System.out.println();
		}
	}
	
	public static void gugu02(int i) {
		// i단만 출력 (for)
		
		  System.out.println("<"+i+"단");
		  for(int j =1 ; j<10; j++){
		 	System.out.println(i+ " * " + j + " = " + (i*j));
		  }
		  
		/*int a = i;
		System.out.printf("<%d단>\n",a);
		for(int a= 1; a<2 ;a++) {
			for(int j =1; j<10; j++) {
				int b = i*j;
				System.out.printf("%d"+"*"+"%d"+"="+"%d",a,j,b);
				System.out.println();
			}
		}
		*/
	}
	
	public static void gugu03() {
		// 2단 ~ 9단까지 전체 출력(while)
		
		int i = 2;
		while(i<10) {
			System.out.printf("<%d단>\n",i);
			int j =1;
			while(j<10) {
				int b = i*j;
				System.out.printf("%d"+"*"+"%d"+"="+"%d",i,j,b);
				System.out.println();
				j++;
			}
			i++;
			System.out.println();
		}
	}

}
