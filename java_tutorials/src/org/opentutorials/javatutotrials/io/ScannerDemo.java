package org.opentutorials.javatutotrials.io;

// java.util 패키지에서 Sacnner import
import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		// Scanner 객체 선언 - 스캐닝하여 sc에 담음
		// System.in (사용자가 입력한 값)
		Scanner sc = new Scanner(System.in);
		// 여기서 멈춰서 입력값을 받음
		int i = sc.nextInt(); 
		System.out.println(i*1000);
		sc.close();
	}
}
