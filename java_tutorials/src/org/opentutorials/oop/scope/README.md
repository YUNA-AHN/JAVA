# 유효 범위 (Scope)
## 출현 배경
- 코드를 효율적으로 제어하기 위하여
- 아래의 코드에서 메소드 내의 i 값이 for문의 i값을 덮어쓴다면, 무한루프에 빠지게 될 것
   - 하지만? 덮어써지지? 않죠?? => scope 때문
- 내부의 변수와 외부의 변수가 서로 영향을 미치지 않도록 하기 위해 출현!
```java
public class ScopeDemo {
	static void a() {
    // 여기서 i는 메소드 내에서만 유효한 변수!
		int i = 0;
	}
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			a();
			System.out.println(i);
		}
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

## 다양한 유효범위
- 디렉토링와 유사 => 디렉토리 내에서는 파일명 중복 불가능 but 디렉토리 밖과 중복은 상관 없음!
- 전역변수 : 모든 중괄호 내에서 접근 가능
- 지역변수 : 선언된 해당 중괄호 내에서만 유효, 밖에서는 접근 불가능 !

스코프를 제대로 분리해주지 않는다면, 이런 식으로 무한루프에 갇히게 된다..
```java
public class ScopeDemo2 {
	static int i;
	
	static void a() {
		i = 0; // 밖에서 선언한 i 고대로 가져와서 쓴다.
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		for (i = 0; i < 5; i++) {
			a();
			System.out.println(i);
		}
	}
}
```
```
1
1
1
1
...
```

스코프 내에서 변수 선언하면 문제 해결
- a나 for문에서 변수 선언 시 문제 해결 : 메소드  / for문 안에서만 유효햔 i 변수
```java
public class ScopeDemo3 {
  // 전역 변수
	static int i;
	
	static void a() {
    // 지역 변수
		int i = 0; // 스코프 내에서 다시 변수 i 선언
		System.out.println(i);
	}

	public static void main(String[] args) {
    // 지역변수
		for (int i = 0; i < 5; i++) {
			a();
			System.out.println(i);
		}
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

+) 코드 비교
![image](https://github.com/YUNA-AHN/JAVA/assets/130244216/3590cb19-fab4-42d6-a9ce-84487495f0a8)

![image](https://github.com/YUNA-AHN/JAVA/assets/130244216/7da7dec3-ef8c-445b-a026-61def8435849)

- 지역변수를 전역변수에서 불러내면 오류 발생
```java
public class ScopeDemo4 {
	static void a() {
		String title = "coding Everbody";
	}
	public static void main(String[] args) {
		a();
		// titile은 메소드 a 내에만 존재하는 변수이기 때문에 오류 발생
		//System.out.println(title);
	}
}
```
```java
public class ScopeDemo5 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		// i는 for문 내에서만 존재하기 때문에 오류 발생
		//System.out.println(i);
	}
}
```
- 지역변수를 사용하고 있을까? 전역변수를 사용하고 있을 까?
  - a를 실행 , a내에 선언된 지역변수가 있으나 b를 실행함으로써 b에서 사용하는 i 출력
  - 만약 b내에서 지역변수를 선언한다면 그 값이 출력, 선언하지 않는다면 전역변수 출력

- 정적인 유효범위(static scope, lexical scope)
  - 누가 호출한 것과 상관 없이 나이거나, 전역변수이거나!
- 동적인 유효범위(dynamic scope)
  - 누가 호출했냐에 따라 값이 달라진다!
```java
public class ScopeDemo6 {
	static int i = 5;
	
	static void a() {
		int i = 10;
		b();
	}
	
	static void b() {
		// 전역 변수 i를 가져다 사용
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		int i = 1;
		a();
	}
}
```
```
5
```

## this : 인스턴스의 유효범위
전역 변수와 지역 변수를 같이 사용하고 싶다면 ?
- this : 인스턴스 자신을 의미하는 값 - 객체에 대한 전역의 의미를 가진다!
- 로컬 변수가 없다면 전역으로 찾으로 나간다..!
```java
class C {
	int v = 10;
	
	void m() {
		// 지역변수의 우선순위가 더 높기 때문에 20 출력
		// this : 인스턴스 자신을 의미하는 값 - 객체에 대한 전역의 의미를 가진다!
		int v = 20;
		System.out.println(v);
		System.out.println(this.v);
	}
}
public class ScopeDemo7 {
	public static void main(String[] args) {
		// C라는 클래스를 c1이라는 인스턴스에 담는다!
		C c1 = new C();
		c1.m();
	}
}
```
```
10
20
```

## 정리
유효범위 : 전역 벼누, 지역변수를 나누어 관라히기 편하도록 하는 것
- 연관된 변수와 메소드를 그룹핑 -> 객체 안에서 전역변수를 사용할 수 있도록 한 것
- 가급적 전역 변수의 사용을 자제하는 것이 좋고(종속성), 동시에 단일 객체가 너무 커지지 않도록 적절하게 규모를 쪼개는 것이 중요!
