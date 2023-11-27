# 반복문 (loop)
반복적인 작업을 하기 위해서 사용하는 문법
- while과 for : 대체 가능함

## while
조건이 참일 때까지 반복 실행 영역을 반복한다!
- while(true) : 조건이 항상 참이라면 무한루프에 같힌다!
  false(false) : 어차피 안돌아가니까 오류가 뜬다!
  
```java
while(조건:언제까지){
  반복 실행 영역 : 반복 작업
}
```

조건문이 효용을 같기 위해서는 지능적이어야 한다 ~~
- 언제까지 반복할 것인가?

```java
public class WhileDemo2 {
	public static void main(String[] args) {
		int i = 0;
		// i의 값이 10보다 작은 동안 true!
		// 현재 숫자가 0이니까 10번 반복
		while (i < 10) {
			System.out.println("Coding EveyBody" + i );
			// i의 값이 1을 더해준다.
			// 반복문의 중괄호의 마지막 라인에 도달하면 반복문 조건 검사
			i++ ;
		}
	}
}
```
```
Coding EveyBody0
Coding EveyBody1
Coding EveyBody2
Coding EveyBody3
Coding EveyBody4
Coding EveyBody5
Coding EveyBody6
Coding EveyBody7
Coding EveyBody8
Coding EveyBody9
```

## for문
fot 문은 특정한 횟수만큼 반복 실행하는 경우에 자주 사용한다!
- 반복시 자주 사용하는 로직을 문법적인 것으로 응집 시켜놓기 때문에 보기에도, 관리하기도 좋음
- 초기값, 조건, 초기값 변경 구성을 가졌다면 for문이 적합

```java
for(초기화; 종료조건; 반복실행){
  반복적으로 실행될 구문
}
```

```java
public class ForDemo {
	public static void main(String[] args) {
		for (int i= 0; i< 10; i++) {
			System.out.println("Coding Everbody" + i);
		}
	}
}
```
```
while문과 동일한 결과
```

## 반복문이 없다면...?
손으로 다 써야한다...  

- 가변적인 부분과 고정적인 부분을 나눈다면 더 편리하게 사용할 수 있다 ~
```java
// 가변적인 부분
int i = 0;
int max = 10;

// 고정적인 부분
while ( i < max) {
  System.out.println("Coding EveyBody");
}
```
- 2의 배수로 늘리고 싶다면?
```java
int i = 0;
while(i<10){
  System.out.println("Coding EveyBody" + (i+1)*2);
  i++;
```

## 반복문의 제어
### break
반복 작업을 중간에 중단시키고 싶은 경우!
```java
public class BreakDeom {
	public static void main(String[] args) {
		for (int  i = 0; i < 10; i ++) {
			// if 의 조건 수행 동작이 1줄이라 괄호 생략 가능
			// 5인 경우에 break(종료) : 4까지만 출력
			if (i == 5) 
				break;
			System.out.println("Coding Everybody" + i);
		}
	}
}
```
```
Coding Everybody0
Coding Everybody1
Coding Everybody2
Coding Everybody3
Coding Everybody4
```

### continue
당장은 중단하면서 반복은 지속하도록 (나 넘어가 ~)
```java
public class ContinueDemo {
	public static void main(String[] args) {
		for (int  i = 0; i < 10; i ++) {
			// if 의 조건 수행 동작이 1줄이라 괄호 생략 가능
			// 5인 경우에 continue(skip)
			if (i == 5) 
				continue;
			System.out.println("Coding Everybody" + i);
		}
	}
}
```
```
Coding Everybody0
Coding Everybody1
Coding Everybody2
Coding Everybody3
Coding Everybody4
Coding Everybody6
Coding Everybody7
Coding Everybody8
Coding Everybody9
```

## 반복문의 중첩
반복문 안의 반복문!

- 0부터 99까지 출력하는 반복문
- 바깥 for문 0~9까지 반복, 안쪽 for문 0~9 반복
```java
public class LoopDepthDemo {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.println(i + "" +j);
			}
		}
	}
}
```
