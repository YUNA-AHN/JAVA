package org.opentutorials.oop.scope;

public class ScopeDemo5 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		// i는 for문 내에서만 존재하기 때문에 오류 발생
		//System.out.println(i);
	}
}
