package org.opentutorials.oop.scope;

public class ScopeDemo4 {
	static void a() {
		String title = "coding Everbody";
	}
	public static void main(String[] args) {
		a();
		// titile은 메소드 a 내에만 존재하는 변수이기 때문에 오류 발생
		//System.out.println(title);
	}
}
