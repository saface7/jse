package switchcase;

import java.util.Scanner;

import javax.swing.SwingConstants;

public class Calc {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자 입력");
		int a = scanner.nextInt();
		System.out.println("연산자 입력");
		String opcode = scanner.next();
		System.out.println("숫자 입력");
		int b = scanner.nextInt();
		
		double result = 0;
		switch (opcode) {
		case "+":	result = a +b;		break;
		case "-": result = a-b;			break;
		case "*":	result = a*b;		break;
		case "/":	result = a/b;		break;
		case "%":	 result = a%b;		break;

		default: System.out.println("연산기호를 정확하게 입력해 주세요.");			break;
		}
		//System.out.println(a + opcode + b "=" +result);
	}
	
}
