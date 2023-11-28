package org.opentutorials.javatutotrials.array;

public class ArrayLoppDemo {
	public static void main(String[] args) {
		String[] members = {"최진혁", "최유빈", "한이람"};
		// 초기화, 반복조건, 반복실행
		for (int i = 0; i < members.length; i++) {
			String member = members[i];
			System.out.println(member + "이 상담을 받았습니다.");
		}
	}
}