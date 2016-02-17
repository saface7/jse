package member;

import java.util.Scanner;

import bank.AccountBean;

public class MemberController {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		MemberService memberservice = new MemberServiceImpl();
		MemberBean member = new MemberBean();
		MemberBean[] tmpList = null;
		
		while (true) {
			System.out.println("***업무선택***\n" 
									  + "1. 회원가입 \n" 
									  + "2. 아이디로 회원정보 검색 \n" 
									  + "3. 이름으로 회원 정보 검색  \n"
									  + "4. 회원탈퇴 \n" 
									  + "5. 회원수 \n" 
									  + "6. 이름으로 회원찾기\n"
									  + "7. 로그인\n"
									  + "8. 정보수정 \n");
			switch (scanner.nextInt()) {
			case 1://회원가입
				System.out.println("원하시는 ID, 이름, 비번, 주소, 생일을 차례대로 입력하세요");							
				member.setUserid(scanner.next());
				member.setName(scanner.next());
				member.setPassword(scanner.next());
				member.setAddr(scanner.next());
				member.setBirth(scanner.nextInt());
				
				System.out.println(memberservice.join(member));
				break;
				
			case 2://아이디로 회원정보 검색
				System.out.println("아이디를 입력하시오");
				System.out.println(memberservice.searchById(scanner.next()).toString());
				break;
			case 3:
				System.out.println("이름을 입력하시오");
				tmpList = memberservice.searchByName(scanner.next());
				for (int i = 0; i < tmpList.length; i++) {
					System.out.println(tmpList[i].toString());
				}
				break;
			case 4:
				System.out.println("아이디를 입력하시오");
				System.out.println(memberservice.remove(scanner.next()));
				break;
			case 5:
				System.out.println("전체회원수 :" + memberservice.countAll());
				break;
			case 6:
				System.out.println("이름을 입력하시오");
				System.out.println(memberservice.searchCountByName(scanner.next()));
				break;
			case 7:
				System.out.println("아이디, 패스워드를 입력하시오");
				System.out.println(memberservice.login(scanner.next(), scanner.next()));
				break;
				
			case 8://정보수정
				System.out.println("변경하고자 하는 정보를 입력하시오");
				member.setUserid(scanner.next());
				member.setName(scanner.next());
				member.setPassword(scanner.next());
				member.setAddr(scanner.next());
				member.setBirth(scanner.nextInt());
				System.out.println(memberservice.update(member));
				break;

			default:
				System.out.println("1~8번 사이에서 선택가능합니다.");
				System.out.println("다시 선택해 주세요");
				break;
			}

		}
	}
}
