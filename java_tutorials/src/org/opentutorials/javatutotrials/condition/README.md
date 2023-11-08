# 조건문 
주어진 조선에 따라서 애플리케이션을 다르게 동작하도록 하는 것으로 프로그래밍의 핵심 중 하나라고 할 수 있다.

## if
``` java
if (조건:true or false) {
  실행문
}
```
```java
public class Condition1Demo {

	public static void main(String[] args) {
    // if절이 참이면 then절(실행문)이 실행되고, 거짓이면 실행되지 않는다.
		if (false) {
			System.out.println("result : true");
		}

	}
}
```

## else
```java
if (조건문) {
  실행문1
} else {
  실행문2
}
```

## else if
```java
if (조건1) {
  실행문1
} else if (조건2) {
  실행문2
} else {
  실행문3
}
```
- else는 항상 마지막에, 생략도 가능

### else if 예제
- 앞선 문장에서 참이 나왔으면 그대로 끝임! 뒤에 참이 있어도 더 이상 실행되지 않음
```java
public class ElseDemo {

	public static void main(String[] args) {
		if (false) {
			System.out.println(1);
		} else if (true) {
			System.out.println(2);
		} else if (true) {
			System.out.println(3);
		} else {
			System.out.println(4);
		}
	}
}

```

# 변수와 비교연산자 그리고 조건문

```java
public class LoginDemo {

	public static void main(String[] args) {
		// args : 사용자가 입력한 입력값
		String id = args[0];
		// equals 비교 연산자
		if (id.equals("egoing")) {
			System.out.println("right");
		} else {
			System.out.println("wrong");
		}
	}
}
```

### 이클립스에서 사용자 입력 받는 방법
- 실행 버튼 옆 작은 새모 클릭 후 RunConfiguratioins
![image](https://github.com/YUNA-AHN/JAVA/assets/130244216/89d8c710-6f15-4677-83bf-23e8b84d0663)

- 새 파일을 생성해 준 후 이름을 input - 으로 지정하고
- Arguments에 가서 program arguments에 입력 값 넣어준 후 RUN
  
<img width="443" alt="image" src="https://github.com/YUNA-AHN/JAVA/assets/130244216/ce8b5eda-5ee5-49fb-a39e-1543645f3a7c">


- 같은 방식으로 하나 더 만들어주고 나면 골라서 실행 가능

![image](https://github.com/YUNA-AHN/JAVA/assets/130244216/5502d4d5-a608-4d38-ab4e-ffc13a77b9f0)


### 조건문의 중첩

```java
public class LoginDemo2 {
  // 입력값
	public static void main(String[] args) {
		String id = args[0];
		String password = args[1];
		if (id.equals("egoing")) {
			if (password.equals("1111")) {
				System.out.println("right");
			} else {
				System.out.println("wrong");
			}
		} else {
			System.out.println("wrong");
		}
	}
}
```

# swtich문
- 비교해야할 조건이 아주 많다면 사용하기 좋음
- switch 조건으로 가능한 데이터 타입: byte, short, char, int, enum, String, Character, Byte, integer

```java
package org.opentutorials.javatutotrials.condition;

public class switchDemo {

	public static void main(String[] args) {
		System.out.println("switch(1)");
		// switch(값) - case
		// 값과 일치하는 case 부터 그 이후에 작성되어 있는 실행문 실행
		// 만약 해당 값만 실행하고 싶다면 break 이용
		// case에 존재하지 않는 값이면 default에 있는 값 실행
		switch(4) {
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		default:
			System.out.println("default");
		}
	}
}
```



