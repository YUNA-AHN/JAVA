# 입력과 출력
- 입력 : 파라미터, 키보드, 마우스, 터치
- 출력 : return, 모니터, 스피커

## 앱이 시작할 때 데이터를 입력
## String[] args
- String[] : 문자열을 받는 배열
- args : args라는 이름의 변수 정의
- String[] args : 문자열을 받는 배열인 args 변수 정의
- **void** main(String[] args) : main 함수의 파라미터는 문자열을 받는 배열인 args이며, 출력은 없음!(void)

main 변수의 파라미터인 args의 길이
```java
public class InputDemo {
	public static void main(String[] args) {
		System.out.println(args.length);
	}
}
```

- 저장되고 있는 디렉토리 확인
![image](https://github.com/YUNA-AHN/JAVA/assets/130244216/f6c078a5-c219-465c-9a54-d2725c79576f)

- cmd 창으로 자바 실행
  - 상위 디렉토리로 이동
  - java -cp bin 파일위치

```bash
cd C:\Users\sgvin\git\JAVA\java_tutorials\
java -cp bin org.opentutorials.javatutotrials.io.InputDemo
```

- 실행해보기 : 3개의 인자 입력 => 인자의 개수(길이)가 3
```bash
java -cp bin org.opentutorials.javatutotrials.io.InputDemo 1 2 3
```
```
3
```

- for문을 활용하여 요소 출력
```java
public class InputForeachDemo {
	public static void main(String[] args) {
		for (String e : args) {
			System.out.println(e);
		}
	}
}
```
```bash
java -cp bin org.opentutorials.javatutotrials.io.InputForeachDemo one two three
```
```
one
two
three
```

~초기값을 지정해주는 방식 이었음

## 앱이 실행중에 데이터를 입력 : 사용자의 입력 받기
자바에서 기본적으로 제공하는 라이브러니 scanner를 활용하여 사용자 입력 받기

```java
// java.util 패키지에서 Sacnner import
import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		// Scanner 객체 선언 - 스캐닝하여 sc에 담음
		// System.in (사용자가 입력한 값)
		Scanner sc = new Scanner(System.in);
		// 여기서 멈춰서 입력값을 받음
		int i = sc.nextInt(); 
		System.out.println(i*1000);
		sc.close();
	}
}
```
```
2 // 사용자가 입력한 값
2000 // 실행 결과
```

### 사용자가 입력하면 결과를 반환하는 코드
```java
import java.util.Scanner;

public class Scanner2Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// hasNextInt() : 입력값이 숫자라면 true, 아니라면 false
		while (sc.hasNextInt()) {
			System.out.println(sc.nextInt()*1000);
		}
		sc.close();
	}
}
```

### 파일로 입력을 받는 코드
- 파일을 가져와서 동작
- FileNotFoundException : 파일이 존재하지 않는다라는 오류
```java
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Scanner3Demo {
	public static void main(String[] args) {
		try {
			File file = new File("out.txt");
			Scanner sc = new Scanner(file);
			while (sc.hasNextInt()) {
			System.out.println(sc.nextInt()*1000);
		}
		sc.close();
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		}

	}
}
```
```
1234000
```

### GUI
- GUI : 시각적으로 사용자 조작 수단을 만드는 방법
- CLI(Command Line Interface) : cmd 창 st
