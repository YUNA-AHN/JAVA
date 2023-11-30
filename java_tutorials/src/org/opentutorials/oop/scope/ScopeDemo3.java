package org.opentutorials.oop.scope;

public class ScopeDemo3 {
	static int i;
	
	static void a() {
		int i = 0; // 스코프 내에서 다시 변수 i 선언
	}
	
	public static void main(String[] args) {
		for (i = 0; i < 5; i++) {
			a();
			System.out.println(i);
		}
	}
}