# 상속과 생성자
## 기본 생성자
생성자는 객체를 생성! 그 과정에서 해야할 일들을 생성자 메소드에 지정해서 초기화 작업을 할 수 있음

자기자신을 main에서 인스턴스화시킬 수 있음 !!
- 이 상태에서는 잘 작동함
- ConstructorDemo 객체를 생성할 때 자동으로 생성자를 만들어주기 때문!
- 자바는 어떠한 생성자도 존재하지 않는 다면 기본으로 기본 생성자를 만들어준다
=> 클래스 이름과 동일하며 매개변수가 없고 내용이 존재하지 않음
```java
public class ConstructorDemo {
	public static void main(String[] args) {
		ConstructorDemo c = new ConstructorDemo();
	}
}
```

- 에러 발생
- 매개 변수가 있는 생성자가 있는 경우 자동으로 기본 생성자를 만들어주지 않는다. => 기본 생성자 추가 필요
- 명시적으로 생성자가 만들어진다면, 자바는 기본 생성자를 만들어주지 않음! => 인자가 없는 기본 생성자를 가지지 않음
```java
public class ConstructorDemo {
	public ConstructorDemo(int param1) {}
	public static void main(String[] args) {
		ConstructorDemo c = new ConstructorDemo();
	}
}
```

- 기본 생성자 추가
- 인자가 없는 기본 생성자를 명시적으로 생성
```java
public class ConstructorDemo {
	public ConstructorDemo() {}
	public ConstructorDemo(int param1) {}
	public static void main(String[] args) {
		ConstructorDemo c = new ConstructorDemo();
	}
}
```

## super
- SubstractionableCalculator에서 기본 생성자 생성
```java
package org.opentutorials.oop.Inheritance.example2;

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
 
class SubstractionableCalculator extends Calculator {
	// SubstractionableCalculator 기본 생성자 정의
    public SubstractionableCalculator(int left, int right) {
        this.left = left;
        this.right = right;
    }
 
    public void substract() {
        System.out.println(this.left - this.right);
    }
}
 
public class CalculatorConstructorDemo4 {
    public static void main(String[] args) {
        SubstractionableCalculator c1 = new SubstractionableCalculator(10, 20);
        c1.sum();
        c1.avg();
        c1.substract();
    }
}
```

- 에러가 발생
- 기본 생성자가 아닌 명시된 생성자가 존재하고 있음
- SubstractionableCalculator에서 기본 생성자를 활용하여 생성자를 생성하려고 하였으나, 이미 생성자가 작성되어 있어 기본 생성자가 존재하지 않음
```java
package org.opentutorials.oop.Inheritance.example3;

class Calculator {
    int left, right;
     
    public Calculator(int left, int right){
        this.left = left;
        this.right = right;
    }
     
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
 
class SubstractionableCalculator extends Calculator {
	// 오류 발생
    public SubstractionableCalculator(int left, int right) {
        this.left = left;
        this.right = right;
    }
 
    public void substract() {
        System.out.println(this.left - this.right);
    }
}
 
public class CalculatorConstructorDemo5 {
    public static void main(String[] args) {
        SubstractionableCalculator c1 = new SubstractionableCalculator(10, 20);
        c1.sum();
        c1.avg();
        c1.substract();
    }
}
```

**해결방안1**  
- 상위 클래스에 기본 생성자를 추가
```java
class Calculator {
    int left, right;

    // 기본 생성자 생성
    public Calculator(){
         
    }
     
    public Calculator(int left, int right){
        this.left = left;
        this.right = right;
    }
     
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
class SubstractionableCalculator extends Calculator {
    public SubstractionableCalculator(int left, int right) {
        this.left = left;
        this.right = right;
    }
 
    public void substract() {
        System.out.println(this.left - this.right);
    }
}
 
public class CalculatorConstructorDemo5 {
    public static void main(String[] args) {
        SubstractionableCalculator c1 = new SubstractionableCalculator(10, 20);
        c1.sum();
        c1.avg();
        c1.substract();
    }
}
```

**해결방안2**
- super 활용
- super : 부모클래스를 의미
- super() : 부모클래스의 생성자를 의미
- 주의할 점 :  super가 가장 먼저 나타나야 한다!!!!!!! 부모가 초기화되기 전에 자식이 최기ㅘ되는 일을 방지하기 위한 정책
```java
class Calculator {
    int left, right;
     
    public Calculator(){}
     
    public Calculator(int left, int right){
        this.left = left;
        this.right = right;
    }
     
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
class SubstractionableCalculator extends Calculator {
    public SubstractionableCalculator(int left, int right) {
        super(left, right);
        // 초기화 코드는 이자리에 ~~
    }
 
    public void substract() {
        System.out.println(this.left - this.right);
    }
}
 
public class CalculatorConstructorDemo5 {
    public static void main(String[] args) {
        SubstractionableCalculator c1 = new SubstractionableCalculator(10, 20);
        c1.sum();
        c1.avg();
        c1.substract();
    }
}
```
