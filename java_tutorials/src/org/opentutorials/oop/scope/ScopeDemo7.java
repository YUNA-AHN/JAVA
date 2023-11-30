package org.opentutorials.oop.scope;

class C {
	int v = 10;
	
	void m() {
		// 지역변수의 우선순위가 더 높기 때문에 20 출력
		// this : 인스턴스 자신을 의미하는 값 - 객체에 대한 전역의 의미를 가진다!
		int v = 20;
		System.out.println(v);
		System.out.println(this.v);
	}
}
public class ScopeDemo7 {
	public static void main(String[] args) {
		// C라는 클래스를 c1이라는 인스턴스에 담는다!
		C c1 = new C();
		c1.m();
	}
}
