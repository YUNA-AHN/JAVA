package org.opentutorials.javatutotrials.method;

import java.io.*;

public class MethodDemo5 {
	public static String numbering(int init, int limit) {
		int i = init;
		String output = "";
		while (i < limit) {
			output += i;
			i++;
		}
		return output;
	}
	
	public static void main(String[] args) {
		// result에 output 값이 담김!
		String result = numbering(1,5);
		System.out.println(result);
		try {
			// out.txt 파일에 numbering 메소드 반환값 저장
			BufferedWriter out = new BufferedWriter(new FileWriter("out.txt"));
			out.write(result);
			out.close();
		} catch (IOException e) {
        } // 무시
	}
}