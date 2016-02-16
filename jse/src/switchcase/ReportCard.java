package switchcase;

import java.util.Scanner;

public class ReportCard {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//이름 과목점수 입력, 출력 : 이름 총점 평균
		
		System.out.println("이름을 입력하세요");
		String name = scanner.next();

		System.out.println("국어점수를 입력하세요");
		int korscore = scanner.nextInt();
		System.out.println("수학점수를 입력하세요");
		int mathscore = scanner.nextInt();
		System.out.println("영어점수를 입력하세요");
		int engscore = scanner.nextInt();
		String result=null;
		
		int sum = korscore + mathscore + engscore;
		double avg = sum/3;
		//String result = name + "Toral " + sum + "점이고" + avg+ "점으로";
		/*
		if (avg >= 90.0) {
			//System.out.println(result + "장학생입니다");
			result = "장학생";
			
		} else if(avg >= 60){
			System.out.println(result + "합격입니다");
			result = "합격";
		}
		else{
			System.out.println(result + "불합격입니다");
			result = "불합격";
		}
		*/
	
		int key = 0;//지역변수의 초기화
		key = (int)(avg/10);
		switch (key) {
		case 10:result = "장학생";break;
		case 9:result = "장학생";break;
		case 8:result = "합격";break;
		case 7:result = "합격";break;
		case 6:result = "합격";break;

		default:result = "불합격";break;
		}
		System.out.println(name + "학생은" + result + "입니다");
	}
}
