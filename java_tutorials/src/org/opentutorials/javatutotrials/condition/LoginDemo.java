package org.opentutorials.javatutotrials.condition;

public class LoginDemo {

	public static void main(String[] args) {
		// args : 사용자가 입력한 입력값
		String id = args[0];
		// equals 비교 연산자
		if (id.equals("egoing")) {
			System.out.println("right");
		} else {
			System.out.println("wrong");
		}

	}

}
