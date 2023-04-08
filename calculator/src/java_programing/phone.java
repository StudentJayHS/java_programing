package java_programing;
import java.util.Scanner;

public class phone {
	
	static class Phone {
		String name, tel;
		Phone(String name, String tel) {
			this.name = name;
			this.tel = tel;
		}
		String getName() {return name;}
		String getTel() {return tel;}
	}
	
	static class PhoneBook {
		Scanner scanner = new Scanner(System.in);
		Phone[] p = new Phone[100];
		// 저장할 인원 전역변수
		int people;
		
		void save() {
			System.out.print("인원수>>");
			people = scanner.nextInt();
			
			for(int i = 0; i < people; i++) {
				System.out.print("이름과 전화번호(이름과 번호는 빈 칸 없이 입력)>>");
				String name = scanner.next();
				String tel = scanner.next();
				p[i] = new Phone(name, tel);
			}
			System.out.println("저장되었습니다...");
			
			while(true) {
				System.out.print("검색할 이름>>");
				String name = scanner.next();
				
				if(name.equals("그만")) break;
				
				for(int i = 0; i < people; i++) {
					if(p[i].getName().equals(name)) {
						String telNumber = p[i].getTel();
						System.out.println(name + "의 번호는 " + telNumber + "입니다.");
					} else if(i == people-1) {
						System.out.println(name + "이 없습니다.");
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhoneBook phoneBook = new PhoneBook();
		phoneBook.save();
	}

}
