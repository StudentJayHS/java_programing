package java_programing;
import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("두 숫자의 연산을 입력해주세요: ");
		System.out.println("예시) 2 + 4");
		
		double firstNum = scanner.nextInt();
		String cal = scanner.next();
		double secondNum = scanner.nextInt();
		
		/*
		if(cal.equals("+")) {
			System.out.print(firstNum + secondNum);
		} else if(cal.equals("-")) {
			System.out.print(firstNum - secondNum);
		} else if(cal.equals("*")) {
			System.out.print(firstNum * secondNum);
		} else if(cal.equals("/")) {
			System.out.print(firstNum / secondNum);
		} else {
			System.out.print("사칙연산 덧셈, 뺄셈, 곱셈, 나눗셈 중 입력해주세요.");
		}
		*/
		
		switch (cal) {
		case "+":
			System.out.print(firstNum + secondNum);
			break;
		case "-":
			System.out.print(firstNum - secondNum);
			break;
		case "*":
			System.out.print(firstNum * secondNum);
			break;
		case "/":
			System.out.print(firstNum / secondNum);
			break;
		default:
			System.out.print("사칙연산 덧셈, 뺄셈, 곱셈, 나눗셈 중 입력해주세요.");
		}
	}

}
