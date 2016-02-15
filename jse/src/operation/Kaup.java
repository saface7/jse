package operation;

import java.util.Scanner;

public class Kaup {
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
		String result;
		Scanner scanner =  new Scanner(System.in);
		System.out.println("이름을 입력하세요.");
		String name = scanner.next();
		
		System.out.println("키를 입력하세요.");
		double height = scanner.nextDouble();
		
		System.out.println("몸무게를 입력하세요.");
		double weight = scanner.nextDouble();
		
		int index = (int) ((weight / (height*height)) * 10000);
		
		
		if (index > 30) {
			result = "비만 입니다.";
		} else if(index >24) {
			result = "과체중 입니다.";
		} else if(index>20){
			result = "정상 입니다.";
		} else if(index>15){
			result = "저체중 입니다.";
		} else if(index>13){
			result = "마름 입니다.";
		} else if(index>10){
			result = "영양실조 입니다.";
		} else{
			result = "소모증 입니다.";
		}
		
		System.out.println(name + " 님은 " + result);
		
		
	}
}