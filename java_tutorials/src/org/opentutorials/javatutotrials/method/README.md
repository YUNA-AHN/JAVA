# 메소드 (method)
## 메소드의 형식
- main이 메소드
```java
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
```

## 메소드의 정의와 호출
- 정의 : 직접 메소드를 마드는 것
- 호출 : 만들어진 메소드를 실행하는 것
- 메소드가 없다면 계속 계속 똑같은 로직을 써야했을 것 : 짱 길어지고 유지보수 힘들었을 것임!
- **keyword : 재활용**

```java
public class MethodDemo1 {
	// numbering 메소드 정의
	// 0~9까지의 자연수를 출력하는 메소드
	public static void numbering() {
		int i = 0;
		while (i < 10) {
			System.out.println(i);
			i++;
		}
	}
	// numbering 메소드 실행
	public static void main(String[] args) {
		numbering();
	}
}
```
```
0
1
2
3
4
5
6
7
8
9
```

## main
main 메소드는 규칙이다! 
- public static void main(String[] args)가 이끄는 중괄호 안에 실행되기를 기대하는 로직을 위치시ㅕ야 한다!
- 우리는 main 메소드를 작성하고, 자바는 main 메소드를 실행하는 관계!

## 입력과 출력
입력 값에 따라서 출력 값을 다르게 제공
- parameter와 argument
```java
public class MethodDemo2 {
	// 매개변수 지정 int형식의 limit 변수를 받음, 가변적인 부분과 부분적인 부분을 분리
	// 매개변수(parameter) : 가변적
	// 실행부 {} : 고정적
	public static void numbering(int limit) {
		int i = 0;
		while (i < limit) {
			System.out.println(i);
			i++;
		}
	}
	public static void main(String[] args) {
		// 파라미터 자리에 인자(argument)를 받아서 실행
		numbering(5);
	}
}
```
```
0
1
2
3
4
```

- 두개의 인자
```java
// 두개의 인자를 받음
public class MethodDemo3 {
	public static void numbering(int init, int limit) {
		int i = init;
		while (i < limit) {
			System.out.println(i);
			i++;
		}
	}
	public static void main(String[] args) {
		numbering(3, 5);
	}
}
```
```
3
4
```

## 출력
- return : 메소드 밖으로 출력
- 메서드의 출력 부분을 보면 어떤 용도로 사용되는지 보인다! 정의 부분 잘 살펴볼 것

numbering 메소드 설면
- numbering : 메소드 이름
- String : 메소드가 반환할 데이터 타입 -> 리턴할 값에 대한 예측 가능성 O, 유연성 X
- void : 메소드의 return 값이 존재하지 않음을 명시
```java
public class MethodDemo4 {
	public static String numbering(int init, int limit) {
		int i = init;
		// i의 값을 output이라는 변수에 담기 위해 변수에 빈 값 할당
		String output = "";
		while (i < limit) {
			// 숫자를 출력하는 대신에 변수 output에 담음
			output += i;
			i++;
		}
		// output을 메소드 외부로 반환하려면 return 사용
		// return 이 뒤에 무슨 문장이오든 메소드를 종료시킴!
		return output;
	}
	
	public static void main(String[] args) {
		// result에 output 값이 담김!
		String result = numbering(1,5);
		System.out.println(result);
	}
}
```

- return 의 역할
- return과 함께 메소드 종료한다
- 해당 코드에서는 return 2부터 도달할 수 없는 코드이므로 실행조차 되지 않음..
```java
public class ReturnDemo {
	public static int one() {
		return 1;
		return 2;
		return 3;
	}

	public static void main(String[] args) {
		System.out.println(one());
	}
}
```

- 여러 개의 return 활용법
```java
public class ReturnDemo2 {
	public static String num(int i) {
		if (i == 0) {
			return "zero";
		} else if (i == 1) {
			return "one";
		} else if (i == 2) {
			return "two";
		}
		return "none";
	}
	
	public static void main(String[] args) {
		System.out.println(num(2));
	}
}
```
- 복수의 return
- 문자열 배열 반환하는 메소드
- 추후에는 배열을 입력받는 메소드 가능

```java
// 요랬는데
public class ReturnDem3 {
	public static String getMember1() {
		return "최진혁";
	}
	public static String getMember2() {
		return "최유빈";
	}
	public static String getMember3() {
		return "한이람";
	}
	public static void main(String[] args) {
        System.out.println(getMember1());
        System.out.println(getMember2());
        System.out.println(getMember3());
    }
}
```
```java
// 요래됐슴당
public class ReturnDemo4 {
	public static String[] getMemebrs() {
		String[] members = {"최진혁", "최유빈", "한이람"};
		return members;
	}
	public static void main(String[] args) {
		String[] members = getMemebrs();
	}
}
```
