# 초기화와 생성자(constructor)
## 생성자
- 인스턴스가 생성될 때 값을 입력하도록 해줌
- 클래스가 생성될 때 자동으로 클래스와 똑같은 이름을 가진 생성자가 실행되도록 약속되어있음
- 클래스와 같은 이름을 가진 메소드를 생성하여 객체가 가장 먼저 해야할 일(초기화) 진행

```java
class Calculator {
	int left, right;
	
	// 생성자
	public Calculator(int left, int right) {
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
        // 인스턴스 생성자
        Calculator c1 = new Calculator(10, 20);
        c1.sum();
        c1.avg();
 
        Calculator c2 = new Calculator(20, 40);
        c2.sum();
        c2.avg();
    }
}

```
