package org.opentutorials.javatutotrials.io;

import java.util.Scanner;

public class Scanner2Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// hasNextInt() : 입력값이 숫자라면 true, 아니라면 false
		while (sc.hasNextInt()) {
			System.out.println(sc.nextInt()*1000);
		}
		sc.close();
	}
}
