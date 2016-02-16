package forloop;

public class PrintOnetoTen {
	public static void main(String[] args) {
		//escape 문자 /t => tab
		int odd = 0, even=0;
		int oddsum = 0, evensum = 0;
		
		for (int i = 1; i <= 10; i++) {
			if (i%2 == 0) {
				evensum+=i;				
			} else {
				oddsum+=i;
			}
		}
		System.out.println("1부터 10사이의 짝수의 합 : " + evensum);
		System.out.println("1부터 10사이의 홀수의 합 : " + oddsum);
	}
}
