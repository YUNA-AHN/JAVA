package org.opentutorials.javatutotrials.loop;

public class ContinueDemo {
	public static void main(String[] args) {
		for (int  i = 0; i < 10; i ++) {
			// if 의 조건 수행 동작이 1줄이라 괄호 생략 가능
			// 5인 경우에 continue(skip)
			if (i == 5) 
				continue;
			System.out.println("Coding Everybody" + i);
		}

	}

}
