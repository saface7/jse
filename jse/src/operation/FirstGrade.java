package operation;

import java.util.Scanner;

public class FirstGrade {
	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		/**
		 * 첫번째 학생 이름, 평균
		 * 두번째 학생 이름, 평균
		 * 세번째 학생 이름, 평균
		 * 
		 * 결과 : 홍길동이 1등 입니다.
		 * */
		
		System.out.println("첫번째 학생의 이름을 입력하세요.");
		String name1 = scanner.next();
		System.out.println("평균을 입력하세요.");
		int avg1 = scanner.nextInt();

		System.out.println("두번째 학생의 이름을 입력하세요.");
		String name2 = scanner.next();
		System.out.println("평균을 입력하세요.");
		int avg2 = scanner.nextInt();

		System.out.println("세번째 학생의 이름을 입력하세요.");
		String name3 = scanner.next();
		System.out.println("평균을 입력하세요.");
		int avg3 = scanner.nextInt();

		String result;
		if (avg1 > avg2 && avg1 > avg3) {
			result = name1;
		} else if(avg2 > avg1 && avg2 > avg3){
			result = name2;
		} else{
			result = name3;
		}
		
		System.out.println("결과 : " + result +"1등 입니다.");
	}
}
