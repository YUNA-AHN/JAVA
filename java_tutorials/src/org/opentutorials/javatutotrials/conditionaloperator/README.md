# 논리 연산자
조건문을 보좌하는 역할 : 비교-불린 / 논리연산자

## and (&&) : bool and bool : 둘 중 모두 참이어야 참
  
활용
```java
public class LoginDemo3 {
	public static void main(String[] args) {
		String id = args[0];
		String password = args[1];
		// id와 password 둘 중 하나라도 틀리면 wrong 출력
		if (id.equals("egoing") && password.equals("111111")) {
			System.out.println("right");
		} else {
			System.out.println("wrong");
		}
	}
}
```

## or  : bool or bool : 둘 중 하나라도 참이면 참

활용
```java
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
```

## ! (부정:not)
- 결과와 반대되는 값을 낸다!
```java
public class NoDemo {

	public static void main(String[] args) {
		if (!true) {
			System.out.println(1);
		}
		if (!false) {
			System.out.println(2);
		}
	}
}
```
