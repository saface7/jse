package operation;

import java.util.Scanner;

public class ReportCard {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//이름 과목점수 입력, 출력 : 이름 총점 평균
		
		System.out.println("이름을 입력하세요");
		String name = scanner.next();
		
		System.out.println("과목을 입력하세요");
		String kor = scanner.next();
		String math = scanner.next();
		String eng = scanner.next();
		
		System.out.println("국어점수를 입력하세요");
		int korscore = scanner.nextInt();
		System.out.println("수학점수를 입력하세요");
		int mathscore = scanner.nextInt();
		System.out.println("영어점수를 입력하세요");
		int engscore = scanner.nextInt();
		
		int sum = korscore + mathscore + engscore;
		int avg = sum/3;
		
		System.out.println(avg);
		
		
		
	}

}
