package operation;

import java.util.Scanner;

public class TimeCalc {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		/**
		 * + - * / %
		 * sec, hour, min
		 */
		System.out.println("*** 초를 시간과 분으로 바꾸어 주는 프로그램 ***");
		System.out.println("초를 입력하세요");
		int sec = scanner.nextInt();
		int min = sec/60;
		int hour = min/60;
		
		int a = sec%60;
		int b = min%60;
		/*참고소스
		 * int sec = scanner.nextInt();
		 * int min = sec /60;
		 * sec %= 60;
		 * int hour = min/60;
		 * min%=60;
		 */
		if (sec < 60) {
			System.out.println(sec + "초 입니다");
		}else{
			System.out.println("입력한" + sec + "초는" + hour + "시간" + min +"분"+ a +"입니다");
		}		
	}
}
