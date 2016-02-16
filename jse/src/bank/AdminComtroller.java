package bank;

import java.util.Scanner;

public class AdminComtroller {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			System.out.println("***업무선택***\n" 
										+ "1. 전체 계좌 수 조회 \n"
										+ "2. 계좌번호로 해당 계좌 정보 조회 \n"
										+ "3. 이름으로 계좌 정보 조회  \n"
										+ "4. 계좌 삭제 \n"
										+ "5. 이름으로 계좌수 조회 \n");
			switch (scanner.nextInt()) {
			case 1:				
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			default:
				System.out.println("1~5번 사이에서 선택가능합니다.");
				System.out.println("다시 선택해 주세요");
				break;
			}
		}
	}

}
