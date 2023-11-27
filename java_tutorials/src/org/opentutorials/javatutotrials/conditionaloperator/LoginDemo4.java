package org.opentutorials.javatutotrials.conditionaloperator;

public class LoginDemo4 {

	public static void main(String[] args) {
		String id = args[0];
		String password = args[1];
		// id가 egoing 혹은 l8805 혹은 soriaigi 이고, password가 111111이라면 true
		if ((id.equals("egoing")) || id.equals("l8805") || id.equals("soriaigi") && password.equals("111111"))
			 {
			System.out.println("right");
		} else {
			System.out.println("wronng");
		}
	}

}
