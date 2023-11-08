package org.opentutorials.javatutotrials.condition;

public class switchDemo {

	public static void main(String[] args) {
		System.out.println("switch(1)");
		// switch(값) - case
		// 값과 일치하는 case 부터 그 이후에 작성되어 있는 실행문 실행
		// 만약 해당 값만 실행하고 싶다면 break 이용
		switch(4) {
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		default:
			System.out.println("default");
		}
		

	}

}
