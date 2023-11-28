package practice.condition;

// 삼항 연산자를 활용하여 짝수 홀수 파악
public class EvenOddEx {
	public static void main(String[] args) {
		int x = 5;
		String result = (x % 2 == 0) ? "짝수" : "홀수";
		System.out.println("x = " + x + ", " + result);
	}
}
