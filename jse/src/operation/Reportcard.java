package operation;

import java.util.Scanner;

public class Reportcard {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//입력 : 이름, 과목점수  출력 : 이름, 총점, 평균
		System.out.println("당신의 이름은 무엇입니까?");
		String name = scanner.next();
		System.out.println("각 과목별 점수를 입력하세요.");
		int eng = scanner.nextInt();
		int kor = scanner.nextInt();
		int math = scanner.nextInt();
		int sci = scanner.nextInt();
		int sum = eng + kor + math + sci ;
		System.out.println("당신의 이름은 " + name + "이고 과목별 총점은 " + sum + ", 평균은 " + sum/4 + " 입니다.");
	}

}
