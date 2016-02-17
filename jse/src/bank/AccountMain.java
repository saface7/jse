package bank;

import java.util.Scanner;

public class AccountMain {
	public static void main(String[] args) {
		//객체 생성
		AccountService acc = new AccountServiceImpl();
		AdminService admin = new AdminServiceImpl();	
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름,  비번");

		//System.out.println(acc.open(scanner.next(), scanner.nextInt()));
		admin.open(scanner.next(), scanner.nextInt());
		
		System.out.println("입금할 금액을 입력하세요");
		System.out.println(acc.deposit(scanner.nextInt()));
		
		System.out.println("출금할 금액을 입력하세요");
		System.out.println(acc.widthdraw(scanner.nextInt()));
	}
}
