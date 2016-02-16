package operation;

import java.util.Scanner;

public class ScannerEx {
	public static void main(String[] args) {
<<<<<<< HEAD
		Scanner scanner = new Scanner(System.in);
		System.out.println("당신의 이름은 무엇입니까?");
		String name = scanner.next();

		System.out.println("당신의 나이는 몇 살 입니까?");
	
		int age = scanner.nextInt();
		System.out.println("이름은 " + name + " 이고, 나이는 " + age + " 입니다.");
	}

=======
		System.out.println("당신의 이름은 무엇입니까?");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		
		System.out.println("당신의 나이는 얼마입니까?");
		int age = scanner.nextInt();		
		
		System.out.println("당신의 이름은"+name+ "당신의 나이는" + age);
	}
>>>>>>> branch 'master' of https://github.com/saface7/jse.git
}
