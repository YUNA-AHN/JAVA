package org.opentutorials.oop.scope;

public class ScopeDemo2 {
	static int i;
	
	static void a() {
		i = 0;
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		for (i = 0; i < 5; i++) {
			a();
			System.out.println(i);
		}
	}
}
