package java_programing;
import java.util.Scanner;

public class simpleGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		String str[] = {"가위", "바위", "보"};
		
		while(true) {
			System.out.print("컴퓨터와 가위 바위 보 게임을 합니다. \n");
			System.out.print("가위 바위 보!>>");
			String text = scanner.next();
			
			int n = (int)(Math.random() * 3);
			
			if(text.equals("가위")) {
				if(str[n].equals("가위")) System.out.println("사용자 = 가위, 컴퓨터 = 가위, 비겼습니다.");
				if(str[n].equals("바위")) System.out.println("사용자 = 가위, 컴퓨터 = 바위, 컴퓨터가 이겼습니다.");
				if(str[n].equals("보")) System.out.println("사용자 = 가위, 컴퓨터 = 보, 사용자가 이겼습니다.");
			} else if(text.equals("바위")) {
				if(str[n].equals("가위")) System.out.println("사용자 = 바위, 컴퓨터 = 가위, 사용자가 이겼습니다.");
				if(str[n].equals("바위")) System.out.println("사용자 = 바위, 컴퓨터 = 바위, 비겼습니다.");
				if(str[n].equals("보")) System.out.println("사용자 = 바위, 컴퓨터 = 보, 컴퓨터가 이겼습니다.");
			} else if(text.equals("보")) {
				if(str[n].equals("가위")) System.out.println("사용자 = 보, 컴퓨터 = 가위, 컴퓨터가 이겼습니다.");
				if(str[n].equals("바위")) System.out.println("사용자 = 보, 컴퓨터 = 바위, 사용자가 이겼습니다.");
				if(str[n].equals("보")) System.out.println("사용자 = 보, 컴퓨터 = 보, 비겼습니다.");
			} else if(text.equals("그만")) {
				System.out.print("게임을 종료합니다...");
				break;
			}
			else System.out.print("다시 입력하세요. \n");
			
		}
	}

}
