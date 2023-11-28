package practice.condition;
// 두 개의 정수 변수 a와 b를 가지고 있다. 
// 삼항 연산자를 사용하여 두 숫자 중 더 큰 숫자를 출력
public class CondOpEx {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		int max = (a > b) ? a : b;
		System.out.println("더 큰 숫자는 " + max + "입니다.");
	}
}
