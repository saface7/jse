package operation;

import java.util.Scanner;

public class FirstGrade {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		/*
		 * 첫번째 학생 이름, 평균
		 * 두번째
		 * 세번째
		 * 결과 : 홍길동이 1등입니다 
		 */
		System.out.println("첫번째 학생 이름을 입력하세요");
		String onename = scanner.next();
		System.out.println("첫번째 학생 평균을 입력하세요");
		int avg1 = scanner.nextInt();
		
		System.out.println("두번째 학생 이름을 입력하세요");
		String twoname = scanner.next();
		System.out.println("두번째 학생 평균을 입력하세요");
		int avg2 = scanner.nextInt();
		
		System.out.println("세번째 학생 이름을 입력하세요");
		String thrname = scanner.next();
		System.out.println("세번째 학생 평균을 입력하세요");
		int avg3 = scanner.nextInt();
		String first = null;
		
		if (avg1 > avg2 && avg1 > avg3) {
			first = onename;			
		} else if(avg2 > avg1 && avg2 > avg3){
			first = twoname;
		} else{
			first = thrname;
		}
		System.out.println("1등은" + first + "입니다");
	}
}
