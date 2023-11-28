package practice.loop;
// 누적합계산 : 1부터 max까지 합을 계산
// sum : 누적합  i : 카운트
public class WhileEx3 {
	public static void main(String[] args) {
		int max = 100; 
		
		int sum = 0;
		int i = 1;
		while (i <= max) {
			sum += i;
			i++;
		}
		System.out.println(sum);
		
		int sum1 = 0;
		for (int j = 1; j <= max; j++) {
			sum1 += j;
		}
		System.out.println(sum1);
	}
}
