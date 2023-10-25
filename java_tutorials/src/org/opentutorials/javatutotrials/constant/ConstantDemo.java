package org.opentutorials.javatutotrials.constant;

// 상수의 데이터 타입
/*
상수는 변하지 않는 값
 */

public class ConstantDemo {

	public static void main(String[] args) {
//		int a = 2.2; // 정수에 살수에 입력하기 때문
		double a = 2.2; 
		// 변수와 값이 동일한 데이터 타입을 가지고 있어야 한다.
		// 실수는 기본적으로 double를 채택한다.
		float b = 2.2F; // F를 붙여 float임을 보여줌
		
//		int c = 2147483648;  // int에 담을 수 있는 값보다 크다
		long c = 2147483648L; // long로 지정시에도 L을 붙여주어야 함
		byte d = 100; // byte, short에는 int 데이터 입력 가능하도록 설정되어 있음
	}

}
