# 배열(Array)
연관된 정보를 모아서 관리하기 위해 사용하는 데이터 타입
- 변수 : 하나의 데이터를 저장하기 위한 것
- 배열 : 여러 개의 데이터를 저장하기 위한 것

## 배열 정의
'''java
public class DefineDemo {
	public static void main(String[] args) {
		// 문자열 배열 정의
		// classGroup이라는 변수에 문자열 데이터로 구성된 배열이 담긴다!
		String[] classGroup = {"최진혁","최유빈","한이람","이고잉"};
	}
}
```

## 배열 다루기
- 인덱스로 데이터 가져오기
```java
public class GetDemo {
	public static void main(String[] args) {
		String[] classGroup = {"최진혁","최유빈","한이람","이고잉"};
		System.out.println(classGroup[0]);
		System.out.println(classGroup[1]);
		System.out.println(classGroup[2]);
		System.out.println(classGroup[3]);
	}
}
```
```
최진혁
최유빈
한이람
이고잉
```

- 배열의 정의 새로운 방법 + 배열 데이터의 수
  - 4개의 원소로 이루어진 배열을 생성해두었으므로 4가 계속 출력 : 몇개를 수용할 수 있는가?
  - 분할해서 데이터를 저장하는 방법
  - ![image](https://github.com/YUNA-AHN/JAVA/assets/130244216/3ae50af6-2e28-4d5c-975f-ae816ce93464)

```java
public class LengthDemo {
	public static void main(String[] args) {
		// String[] classGroup = {"최진혁","최유빈","한이람","이고잉"};
		// 4개의 원소로 이루어진 문자열 데이터를 담는 배열 classGroup
		String[] classGroup = new String[4];
		classGroup[0] = "최진혁";
		System.out.println(classGroup.length);
		classGroup[0] = "최유빈";
		System.out.println(classGroup.length);
		classGroup[0] = "한이람";
		System.out.println(classGroup.length);
		classGroup[0] = "이고잉";
		System.out.println(classGroup.length);
	}
}
```
```
4
4
4
4
```

##  반복문과 배열의 조화
반복문 통해서 배열에 담긴 데이터를 하나하나 돌면서 확인..!
```java
public class ArrayLoppDemo {
	public static void main(String[] args) {
		String[] members = {"최진혁", "최유빈", "한이람"};
		// 초기화, 반복조건, 반복실행
		for (int i = 0; i < members.length; i++) {
			String member = members[i];
			System.out.println(member + "이 상담을 받았습니다.");
		}
	}
}
```
```
최진혁이 상담을 받았습니다.
최유빈이 상담을 받았습니다.
한이람이 상담을 받았습니다.
```

## for-each
배열의 내용을 탐색할 때 for문을 좀 더 간편하게 사용할 수 있는 방법
- 위와 동일한 결과
```java
public class ForeachDemo {
	private void name() {
		String[] members = {"최진혁","최유빈","한이람","이고잉"};
		for (String e: members) {
			System.out.println(e + "이 상담을 받았습니다.");
		}
	}
}
```

## 오류
- ArrayIndexOutOfBoundsException : 존재하지 않는 인덱스 사용시 발생
  - 존재하지 않는 인덱스의 값을 불러오려고 할 때 ex) members[3]
  - 존재하지 않은 인덱스의 값을 입력하려고 할 때 ex) members[3] = "이고잉";
 
## 한계
배열 선언시 지정한 크기보다 더 크게 사용할 수 없음.. 그렇다고 무조건 크게 만드는 것? 좋지 않다..
- collection이라는 기능을 통해 개선 ~
