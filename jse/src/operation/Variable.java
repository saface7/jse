package operation;

import java.util.Scanner;

import javax.xml.validation.SchemaFactoryConfigurationError;

public class Variable {
	public static void main(String[] args) {
		boolean b = true;
		char c = 'h';
		int i = 25;
		long l = 3000L;
		float f = 3.0f;
		double d = 3.0003d;
		String s = "LEE = ";
		System.out.println(s+i);
		System.out.println("얼마입니까?");
		Scanner scanner = new Scanner(System.in);
		int price = scanner.nextInt();
		System.out.println(price + "원 입니다.");
		
		System.out.println("이것은 무엇입니까?");
		String what = scanner.next();
		System.out.println(what + "입니다.");
	}
}
