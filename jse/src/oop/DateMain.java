package oop;

import java.util.Scanner;

public class DateMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("월을 입력하세요");
		
	    int month = scanner.nextInt();
	    
		DateService date = new DateServiceImpl();
		String result = date.getEndDayOfMonth(month);
		
		System.out.println(month+"월의 마지막 날은" + result);
	}
}
