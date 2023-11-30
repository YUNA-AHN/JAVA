# 클래스(class)와 인스턴스(instance) 그리고 객체(object)
- 클래스 : 설계도, 메소드의 정의
- 인스턴스 : 제품, 메소드의 호출
  
## 객체 지향 이전의 코딩
- 프로그래밍의 중요한 원칙 : 중복의 제거
- 중복을 제거하기 가장 좋은 방법 : 메소드화

객체 이전의 코딩
```java
public class CalculatorDemo {
	public static void main(String[] args) {
		System.out.println(10 + 20);
		System.out.println(20 + 40);
	}
}
```

로직은 동일한데 중복을 제거 => refactoring 기존의 코드와 동일하게 동작하지만 효율적으로 만드는 행위  
메소드화 : 유지보수의 편의성 높아짐, 가독성 향상
```java
public class CalculatorDemo2 {
	public static void sum(int left, int right) {
		System.out.println(left + right);
	}
	public static void main(String[] args) {
		sum(10, 20);
		sum(20, 40);
	}
}
```

객체지향 프로그래밍
 - 연관되어 있는 데이터와 연산을 그룹핑!

## 객체화
- sum과 avg를 필요에 따라 꺼내쓰고 싶다..!
```java
public class CalculatorDemo3 {
	public static void avg(int left, int right) {
		System.out.println((left+right)/2);
	}
	public static void sum(int left, int right) {
		System.out.println(left + right);
	}
	public static void main(String[] args) {
		int left, right;

    // 코드 반복 중
    // 연관 1
		left = 10;
		right = 20;
		
		sum(left, right);
		avg(left, right);

    // 연관 2
		left = 20;
		right = 40;
		
		sum(left, right);
		avg(left, right);
	}
}
```

객체를 만드는 문법 : 객체를 하나의 프로그램으로 봐라!
- Calculator 라는 객체를 생성히야 c1이라는 변수에 담음 : 인스턴스
  - 객체를 만든다 = 데이터타입을 만든다
  - 인스턴스 : 구체적인 객체, 어떤 메소드와 변수를 가지고 있는지 설계도가 필요하다!
- setOprands 메소드 실행하여 인자값 전달, 만들어둔 자리에 값을 입력...
- sum() avg() 메소드 활용하여 합과 평균 출력
- this : 우리가 생성한 인스턴스를 가리키는 것! 클래스에서 생성한 변수를 말함
- this.변수 = 변수 : 클래스에서 생성한 변수에 인자값을 담는다.
- this.left + this.right : 앞서 변수에 값을 담았기 때문에 연산 가능함
  
```java
class Calculator{
  // 설계도
	int left, right;
	
	public void setOprands (int left, int right) {
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

public class CalculatorDemo4 {
	public static void main(String[] args) {
		Calculator c1 = new Calculator();
		c1.setOprands(10, 20);
		c1.sum();
		c1.avg();
		
		Calculator c2 = new Calculator();
		c2.setOprands(20, 40);
		c2.sum();
		c2.avg();
	}
}
```
