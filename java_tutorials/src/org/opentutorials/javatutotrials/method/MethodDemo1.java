package org.opentutorials.javatutotrials.method;

public class MethodDemo1 {
	// numbering 메소드 정의
	// 0~9까지의 자연수를 출력하는 메소드
	public static void numbering() {
		int i = 0;
		while (i < 10) {
			System.out.println(i);
			i++;
		}
	}
	// numbering 메소드 실행
	public static void main(String[] args) {
		numbering();
	}
}
