# overloading
클래스 메소드를 지정할 때, 같은 이름이지만 
서로 다른 매개변수의 형식을 가지고 있는 메소드를 여러개를 정의할 수 있는 방법

- 매개변수의 개수를 다르게 하고 싶다면 = > 메소드의 이름 변경해도 된다!, 깔끔한 방법은 아님
- 오버로딩은 메소드들이 꼭같은 취지와 동작을 가지고 있지만 매개변수 다름으로 인해 다른 이름을 가질 수 있는 문제 해결 방안
- 오버로딩 : 같은 이름, 다른 매개변수 형식이나 숫자에 의해 가능 (충돌 X), 다른 메소드로 인식
- 다른 이름 메소드 생성할 필요 없음

```java
class Calculator {
	int left, right;
	int third = 0; // 전역변수로 선언
	
	// 오버로딩 : 매개변수 2개
	public void setOprands(int left, int right) {
		System.out.println("setOpreands (int left, int right)");
		this.left = left;
		this.right = right;
	}

  // 오버로딩 : 매개변수 3개
	public void setOprands(int left, int right, int third) {
    this.setOprands(left, right);
		System.out.println("setOpreands (int left, int right, int third)");
		// this.left = left;
		// this.right = right;
		this.third = third;
	}
	
	public void sum() {
		System.out.println(this.left+ this.right + this.third);
	}
	
	public void avg() {
		System.out.println((this.left+ this.right + this.third)/3);
	}
}

public class CalculatorDemo {
	public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.setOprands(10, 20);
        c1.sum();       
        c1.avg();
        c1.setOprands(10, 20, 30);
        c1.sum();       
        c1.avg();
	}
}
```
```
setOpreands (int left, int right)
30
10
setOpreands (int left, int right, int third)
60
20
```
# 오버로딩의 규칙
메소드의 시그니처(서명) : 메소드의 이름 /  매개변수의 형식이나 숫자 / 리턴 타입

- 메소드 오버로딩은 매개변수를 사용
- 즉, 매개변수가 다르면, 이름이 같아도 서로 다른 메소드가 되는 것
- 매개변수는 같지만, 리턴타입이 다르면 오류가 발생

리턴값이 다르다면?
- 메소드의 이름이 같고, 매개변수의 형식이 같은 경우
- 아래의 경우 인자를 주지 않고 A()로 호출 => 어떻게 구별하는가? : 오류 발생
- 리턴값만 다른 것은 오버로딩이 될 수 없다!
+) 매개변수의 이름은 ? 상관없다! => 리턴값과 마찬가지로 메소드 호출하는 과정에서 구분이 어렵다.
```java
package org.opentutorials.oop.overloading.example1;

public class OverloadingDemo {
	void A (){System.out.println("void A()");}
	void A (int arg1) {System.out.println("void A (int arg1)");}
	void A (String arg1) {System.out.println("void A (String arg1)");}
//	리턴 타입이 다른 경우 오류 발생
//	int A () {System.out.println("void A()");}
	public static void main(String[] args) {
		OverloadingDemo od = new OverloadingDemo();
		od.A(); // 매개변수가 없는 경우
		od.A(1); // 매개변수가 숫자인 경우
		od.A("coding everybody"); // 매개변수가 문자열인 경우

	}

}
```
```
void A()
void A (int arg1)
void A (String arg1
```
