package org.opentutorials.javatutotrials.loop;

public class WhileDemo2 {

	public static void main(String[] args) {
		int i = 0;
		// i의 값이 10보다 작은 동안 true!
		// 현재 숫자가 0이니까 10번 반복
		while (i < 10) {
			System.out.println("Coding EveyBody" + i );
			// i의 값이 1을 더해준다.
			// 반복문의 중괄호의 마지막 라인에 도달하면 반복문 조건 검사
			i++ ;
		}
	}

}
