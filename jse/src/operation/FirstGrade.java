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

		String result = ""; //지역변수 local variable
		// 지역변수는 반드시 초기화를 해야 한다.
		// 초기화란 최초 지역변수를 선언할 때 null 값을 할당 하는 것
		// 변수는 카멜표기법(낙타) 으로 표기한다. firstName
		// 클래스는 파스칼 표기법으로 표기한다. FirstName
		// statement +  variable  = algorithm
 		if (avg1 > avg2 && avg1 > avg3) {
			result = name1;
		} else if(avg2 > avg3){
			result = name2;
		} else{
			result = name3;
		}
		
		System.out.println("결과 : " + result +"1등 입니다.");
	}
}
