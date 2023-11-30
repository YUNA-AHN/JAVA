package org.opentutorials.oop.scope;

public class ScopeDemo6 {
	static int i = 5;
	
	static void a() {
		int i = 10;
		b();
	}
	
	static void b() {
		// 전역 변수 i를 가져다 사용
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		int i = 1;
		a();
	}
}
