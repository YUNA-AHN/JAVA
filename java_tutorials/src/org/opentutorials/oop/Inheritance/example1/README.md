# 상속 (Inheritance)
객체지향의 재활용성을 극대화시킨 프로그래밍 기법
- 어떤 객체가 있을 때, 그 객체의 필드(변수)와 메소드를 다른 객체가 물려받을 수 있는 기능을 상속이라고 한다!

기존에 작성된 객체에 새로운 기능을 추가하고 싶은 경우의 문제점
1. 객체를 내가 만든 것이 아니기 때문에 소스르 변경할 수 없다! 변경하더라고 원래 소스를 업데이트하면 새 메소드는 사라진다.
2. 객체가 다양한 곳에서 호라용되고 있다면, 메소드를 추가했을 때 다른 곳에서는 불필요한 기능이 포함될 수 있다.

=> 기존의 객체를 그대로 유지하면서 기능을 추가하는 방법  : 상속
- 부모 객체 : 기존의 객체 (기능을 물려주기 때문) : 상위 클래스(super class), 기초 클래스(base class)
- 자식 객체 : 새로운 객체 (기능을 물려받기 때문) : 하위 클래스(sub class), 유도 클래스(derived class)

```java
class Calculator {
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

// 새로운 클래스 생성 : 뺄셈을 할 수 있는 계산기
// extends : 확장, 하위 클래스에서 상위 클래스 기능을 확장
class SubstractionableCalculator extends Calculator {
	public void substract() {
		System.out.println(this.left - this.right);
	}
}

public class CalculatorDemo1 {
	public static void main(String[] args) {
		SubstractionableCalculator c1 =  new SubstractionableCalculator();
		c1.setOprands(10, 20);
		c1.sum();
		c1.avg();
		c1.substract();
	}
}
```
```
30
15
-10
```

## 다양한 종류의 상속
- Calculator는 이미 CalculatorDemo1에서 정의했으므로, 다시 정의하지 않아도! 할 수도! 없습니다!

```java
class MultiplicationableCalculator extends Calculator {
	public void multiplication() {
		System.out.println(this.left * this.right);
	}
}
public class CalculatorDemo2 {
	public static void main(String[] args) {
		MultiplicationableCalculator c1 = new MultiplicationableCalculator();
        c1.setOprands(10, 20);
        c1.sum();
        c1.avg();
        c1.multiplication();
	}
}
```

- MultiplicationableCalculator를 상속받는 자식 객체
- 부모가 갖고 있는 sum avg와 muticain을 가지고 있으며 division까지!
- 
```java
class DivisionableCalculator extends MultiplicationableCalculator {
	public void division() {
		System.out.println(this.left / this.right);
	}
}

public class CalculatorDemo3 {
	public static void main(String[] args) {
		DivisionableCalculator c1 = new DivisionableCalculator();
        c1.setOprands(10, 20);
        c1.sum();
        c1.avg();
        c1.multiplication();
        c1.division();
	}
}
```
```
30
15
200
0
```


상속
- 코드의 중복 제거 : 부모가 가진 기능 새로 생성할 필요 없음
- 코드의 재활용성 높아짐
- 유지보수에 편리
- 가독성의 증가
