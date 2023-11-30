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
