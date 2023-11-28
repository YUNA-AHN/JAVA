package org.opentutorials.javatutotrials.method;

public class MethodDemo2 {
	// 매개변수 지정 int형식의 limit 변수를 받음, 가변적인 부분과 부분적인 부분을 분리
	// 매개변수(parameter) : 가변적
	// 실행부 {} : 고정적
	public static void numbering(int limit) {
		int i = 0;
		while (i < limit) {
			System.out.println(i);
			i++;
		}
	}
	public static void main(String[] args) {
		// 파라미터 자리에 인자(argument)를 받아서 실행
		numbering(5);
	}
}