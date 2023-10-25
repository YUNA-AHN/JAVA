package org.opentutorials.javatutotrials.numberstring;

public class CharString {

	public static void main(String[] args) {
		// 문자는  '' , 문자열은 ""로 표시
		System.out.println('후'); // 문자
		System.out.println("후"); // 문자열
		System.out.println("생활코딩");
//		System.out.println('생활코딩'); // 에러 발생
		
		// 문자열 연산
		System.out.println("생활코딩" +"입니다");
		System.out.println("1" +"1");
//		System.out.println('1' +'1'); ?? 이건 뭘까
		
		
		// 이스케이프 : 역슬래시로 표시해주기
		System.out.println("안녕하세용 \"싸피\"입니다. ");
		
		// 여러줄 표시 \n : 줄바꿈
		System.out.println("안녕하세용\n\"싸피\"입니다. ");
	}

}
