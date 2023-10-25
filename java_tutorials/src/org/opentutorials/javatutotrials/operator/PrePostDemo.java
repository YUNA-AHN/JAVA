package org.opentutorials.javatutotrials.operator;

public class PrePostDemo {

	public static void main(String[] args) {
		int i = 3;
		i ++ ; // i =  i+1
		System.out.println(i); // 4 출력
		++i;
		System.out.println(i); // 5 출력
		
		System.out.println(++i); // 6 출력 : 더한 후의 i 출력
		System.out.println(i++); // 6 출력 : i 출력 후 더함
		System.out.println(i); // 7 출력

	}

}
