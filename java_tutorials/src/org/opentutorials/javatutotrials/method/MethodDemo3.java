package org.opentutorials.javatutotrials.method;

// 두개의 인자를 받음
public class MethodDemo3 {
	public static void numbering(int init, int limit) {
		int i = init;
		while (i < limit) {
			System.out.println(i);
			i++;
		}
	}
	public static void main(String[] args) {
		numbering(3, 5);
	}
}