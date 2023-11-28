package org.opentutorials.javatutotrials.method;

public class MethodDemo4 {
	public static String numbering(int init, int limit) {
		int i = init;
		// i의 값을 output이라는 변수에 담기 위해 변수에 빈 값 할당
		String output = "";
		while (i < limit) {
			// 숫자를 출력하는 대신에 변수 output에 담음
			output += i;
			i++;
		}
		// output을 메소드 외부로 반환하려면 return 사용
		// return 이 뒤에 무슨 문장이오든 메소드를 종료시킴!
		return output;
	}
	
	public static void main(String[] args) {
		// result에 output 값이 담김!
		String result = numbering(1,5);
		System.out.println(result);
	}
}
