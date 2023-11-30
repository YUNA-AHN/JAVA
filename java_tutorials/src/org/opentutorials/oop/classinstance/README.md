# 클래스 멤버와 인스턴스 멤버
## 멤버(member) : 객체의 구성원
- 변수
- 메소드
- 클래스를 구체적인 인스턴스로 만들 때 멤버도 같이 ~~
- 우리가 인자를 입력한다면 인스턴스 소유의 변수이다..

## 클래스 변수
클래스 소유의 변수
- 모든 인스턴스에서 동일한 값을 가짐
- 인스턴스 생성하지 않고도 클래스에 직접 접근하여 사용할 수 있음

```java
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
    // 인스턴스를 통해서 저급
		Calculator c1 = new Calculator();
		System.out.println(c1.PI);
		
		Calculator c2 = new Calculator();
		System.out.println(c2.PI);
		
		// 직접 클래스를 통해서 접근도 가능하다!
		System.out.println(Calculator.PI);
	}
}
```
```
3.14
3.14
3.14
```

- 변수의 변경 사항을 모든 인스턴스에 공유해야할 때도 사용
- static이 붙어있지 않으면 인스턴스 변수

```java
class Calculator2 {
	static double PI = 3.14;
	// 클래스 변수인 base 추가
	static int base = 0;
	int left, right;
	
	public void setOprands(int left, int right) {
		this.left = left;
		this.right = right;
	}
	
	// 변수들의 합에 base 추가
	public void sum() {
		System.out.println(this.left + this.right + base);
	}
	
    public void avg() {
        System.out.println((this.left + this.right + base) / 2);
    }
}

public class CalculatorDemo2 {
	public static void main(String[] args) {
		Calculator2 c1 = new Calculator2();
		c1.setOprands(10, 20);
		c1.sum(); // 30
		
		Calculator2 c2 = new Calculator2();
		c2.setOprands(20, 40);
		c2.sum(); // 60
		
		// 클래스 변수 base의 값을 10으로 변경
		Calculator2.base = 10;
		
		c1.sum(); // 40
		c2.sum(); // 70
	}
}
```

- 클래스 변수의 용도
1. 인스턴스에 따라 변하지 안흔 값이 필요한 경우 : final 이용하여 상수로 선언하는 것이 바라짐
2. 인스턴스를 생성할 필요가 없는 값을 클래스에 저장하고 싶은 경우
3. 값의 변경 사항을 모든 인스턴스가 공유해야하는 상황

## 클래스 메소드
- 클래스에 직접 접근하여 메서드 실행
```java
```
```
30
15
60
30
```

## 멤버 타입의 비교
1. 인스턴스 메소드는 클래스 멤버에 접근할 수 있다.
2. 클래스 메소드는 인스턴스 멤버에 접근할 수 있다.
- 인스턴스 변수는 인스턴스가 만들어지면서 생성 , 클래스 메소드는 인스턴스 생성되기 전에 만들어짐  
=> 클래스메소드가 인스턴스에 접근할 수 없음 (존재하지 않기 때문에)

### 용어
- 인스턴스 변수 -> Non-Static Field
- 클래스 변수 -> Static Field
- Field : 클래스 전역에서 접근할 수 있는 변수를 의미

```java
class C1 {
	static int static_variable = 1;
	int instance_variable = 2;
	static void static_static() {
		// 클래스 메소드에서 클래스 변수 접근 가능
		System.out.println(static_variable);
	}
	static void static_instance() {
		// 클래스 메소드에서는 인스턴스 변수에 접근할 수 없다.
		// System.out.println(instance_variable);
	}
	void instance_static() {
		// 인스턴스 메소드에서는 클래스 변수에 접근할 수 있다.
		System.out.println(static_variable);
	}
	void instance_instance() {
		// 인스턴스 메소드에서 인스턴수 변수 접근 가능!
		System.out.println(instance_variable);
	}
}

public class ClassMemberDemo {
	public static void main(String[] args) {
		C1 c = new C1();
		// 인스턴스를 이용해서 정적 메소드에 접근 -> 성공
		// 인스턴스 메소드가 정적 변수에 접근 -> 성공
		c.static_static();
		
		// 인스턴스를 이용해서 정적 메소드에 접근 -> 성공
		// 인스턴스 메소드가 정적 변수에 접근 -> 실패
		c.static_instance();
		
		// 인스턴스를 이용해서 인스턴스 메소드에 접근 -> 성공
		// 인스턴스 메소드가 클래스 변수에 접근 -> 성공
		c.instance_static();
		
		// 클래스를 이용해서 클래스 메소드에 접근 -> 성공
		// 클래스 메소드가 클래스 변수에 접근 -> 성공
		C1.static_static();
		
		// 클래스를 이용해서 클래스 메소드에 접근 -> 성공
		// 클래스 메소드가 인스턴스 변수에 접근 -> 실패
		C1.static_instance();
		
		// 클래스를 이용해서 인스턴스 메소드에 접근 -> 실패
		// C1.instance_static();
		// C1.instance_instance();
		
	}
}
```
