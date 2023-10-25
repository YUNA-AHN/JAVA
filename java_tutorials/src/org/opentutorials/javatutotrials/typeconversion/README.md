# 형 변환
데이터의 타입을 변경하는 것

## 자동(암시적)형 변환 (implicit conversion)
원칙 : 표현범위가 좁은 데이터 타입에서 넓은 데이터 타입으로만 가능하다!
  
```java
double a = 3.0F;
```
- 자바에서 자동적으로 float를 double로 형 변환이 일어난다.
- double > float : 데이터의 손실이 발생하지 않는다.


```java
floate a = 3.0;
```
- 더 좁은 데이터 타입으로 변환하는 과정에서 데이터 손실이 발생할 수 있기 때문이다.

> byte -> short / char -> int -> long -> float -> double

```java
int a = 3;
float b = 1.0F;
double c = a + b;
```
int + float : 더 큰 데이터 타입인 float로 형 변환  
3.0F + 1.0F = 4.0F 이지만, 
더 큰 데이터 타입인 double 변수로 선언되었기 때문에 최종적으로 double

## 명시적 형변환 (Explic conversion)
수동으로 형변환
> **(데이터 타입) 데이터 값**

```java
float a = 100.0; // double를 float로 할당하려고 하여 오류
int b = 100.0F; // float를 int로 할당하려고 하여 오류
```

명시적 형변환
```java
float a = (float)100.0;
int b = (int)100.0F;
```
