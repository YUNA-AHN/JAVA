package org.opentutorials.javatutotrials.array;

public class LengthDemo {
	public static void main(String[] args) {
		// String[] classGroup = {"최진혁","최유빈","한이람","이고잉"};
		// 4개의 원소로 이루어진 문자열 데이터를 담는 배열 classGroup
		String[] classGroup = new String[4];
		classGroup[0] = "최진혁";
		System.out.println(classGroup.length);
		classGroup[0] = "최유빈";
		System.out.println(classGroup.length);
		classGroup[0] = "한이람";
		System.out.println(classGroup.length);
		classGroup[0] = "이고잉";
		System.out.println(classGroup.length);
	}
}
