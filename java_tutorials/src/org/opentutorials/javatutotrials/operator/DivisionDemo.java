package org.opentutorials.javatutotrials.operator;

public class DivisionDemo {

	public static void main(String[] args) {
		int a = 10;
		int b = 3;
		
		float c = 10.0F;
		float d = 3.0F;
		
		System.out.println(a/b); // 정수 / 정수
		System.out.println(c/d); // 실수 / 실수 : 실수 값 반환
		System.out.println(a/d); // 정수 / 실수 : 더 큰 범위인 실수로 자동 형변황
	}

}
