package forloop;

public class FactorOf5 {
	public static void main(String[] args) {
		/*
		 * [결과}
		 * 1에서 100까지 정수에서
		 * 5의 배수의 갯수?
		 * 5의 배수의 합?
		 */
		int sum = 0, cnt = 0;
		for (int i = 1; i <= 100; i++) {
			if (i%5==0) {
				cnt++;
				sum+=i;
			}
		}
		System.out.println("갯수 : "+ cnt + " 합 : " + sum );
	}
}
