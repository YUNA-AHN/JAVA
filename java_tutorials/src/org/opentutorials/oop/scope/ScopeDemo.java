package org.opentutorials.oop.scope;

public class ScopeDemo {
	static void a() {
		// 여기서 i는 메소드 내에서만 유효한 변수!
		int i = 0;
	}
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			a();
			System.out.println(i);
		}
	}
}
