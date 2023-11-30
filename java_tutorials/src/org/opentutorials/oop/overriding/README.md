# overriding : 재정의
- 상속 : 부모 클래스에 있는 기능을 상속 클래스에 그대로 사용할 수 있으면서, 기능을 추가
- overriding : 부모 클래스의 기능을 덮어쓰기(재정의)하여 기능을 변경

자식 클래스에서 재정의해주면 -> 부모 클래스 메소드 무시되고 자식 클래스의 메소드 실행된다.
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

class SubstractionableCalculator extends Calculator {
	// overriding : 재정의
	public void sum() {
		System.out.println("실행 결과는 " + (this.left + this.right) +"입니다.");
	}
	
	public void substract() {
		System.out.println(this.left - this.right);
	}
}

public class CalculatorDemo {
	public static void main(String[] args) {
		SubstractionableCalculator c1 = new SubstractionableCalculator();
		c1.setOprands(10, 20);
		c1.sum();
		c1.avg();
		c1.substract();
	}
}
```
```
실행 결과는 30입니다.
15
-10
```

## 제약사항
메서드의 서명(signature) : 아래와 같이 메소드의 형태를 정의하는 사항
- 메소드들 간의 서명이 다르면 문제 발생
1. 자식 클래스의 return type과 부모 클래스의 return type이 동일해야한다!!
2. 메소드 이름 동일해야한다.
3. 매개변수의 데이터 타입과 개수, 순서도 동일해야한다!!

1번 제약사항에 걸려 오류 발생
```java
class SubstractionableCalculator extends Calculator {
	// overriding : 재정의
	public void sum() {
		System.out.println("실행 결과는 " + (this.left + this.right) +"입니다.");
	}
	
	// avg를 반환하도록 재정의
	public int avg() {
		return (this.left + this.right);
	}
	
	public void substract() {
		System.out.println(this.left - this.right);
	}
}
```

**해결방안1**  
- 부모 클래스 수정 : 추천하지 않음
- zhemdml qksqhrdl qkftod
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
 
    public int avg() {
        return ((this.left + this.right) / 2);
    }
}

class SubstractionableCalculator extends Calculator {
	// overriding : 재정의
	public void sum() {
		System.out.println("실행 결과는 " + (this.left + this.right) +"입니다.");
	}
	
	// avg를 반환하도록 재정의
	public int avg() {
		return (this.left + this.right);
	}
	
	public void substract() {
		System.out.println(this.left - this.right);
	}
	
}
```

**해결방안2**
- super 활용
- 추가 기능을 제공할 수 잇음
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
 
    public int avg() {
    	return ((this.left + this.right) / 2);
    }
}

class SubstractionableCalculator extends Calculator {
	// overriding : 재정의
	public void sum() {
		System.out.println("실행 결과는 " + (this.left + this.right) +"입니다.");
	}
	
	public int avg() {
		return super.avg();
	}
	
	public void substract() {
		System.out.println(this.left - this.right);
	}
	
}
```
