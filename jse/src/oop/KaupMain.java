package oop;

import java.util.Scanner;

public class KaupMain {
	/**
	 * 이름을 입력하세요
	 * 키를 입력하세요
	 * height
	 * 몸무게를 입력하세요
	 * weight
	 * 카우푸 인덱스
	 * index = (몸무게 / (키*키)) * 10000
	 * index > 30 비만, 
	 * 30 >= index >24 과체중
	 * > 20 정상
	 * > 15 과체중
	 * > 13 마름
	 * > 10 영양실조
	 * 소모증
	 * */
	public static void main(String[] args) {
		String name = "", result = "";
		Scanner scanner =  new Scanner(System.in);
		//클래스타입 인스턴스(객체) = new 생성자;
		KaupService service = new KaupServiceImpl();
		
		System.out.println("이름을 입력하세요.");
		name = scanner.next();
		
		System.out.println("키를 입력하세요.");
		double height = scanner.nextDouble();
		
		System.out.println("몸무게를 입력하세요.");
		double weight = scanner.nextDouble();
		result = service.getState(height, weight);
		
		int index = (int) ((weight / (height*height)) * 10000);
		
		System.out.println(name + " 님은 " + result + "입니다");		
	}
}
