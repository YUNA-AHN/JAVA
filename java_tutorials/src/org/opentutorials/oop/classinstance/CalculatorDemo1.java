package org.opentutorials.oop.classinstance;

class Calculator {
	// 클래스 변수 생성
	// staic한 변수임을 의미 : 클래스에 소속된다. 모든 인스턴스에서 동일한 값을 가진다.
	static double PI = 3.14;
	int left, right;
	
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	public void sum() {
		System.out.println(this.left + this.right);
	}
	
    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}

public class CalculatorDemo1 {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		System.out.println(c1.PI);
		
		Calculator c2 = new Calculator();
		System.out.println(c2.PI);
		
		// 직접 접근도 가능하다!
		System.out.println(Calculator.PI);
	}
}
