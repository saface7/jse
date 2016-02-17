package member;

public class MemberServiceImpl implements MemberService{
	MemberBean[] members = new MemberBean[100];
	//필드

	public void AdminServiceImpl() {
		//
		members = new MemberBean[100];
	}

	private int count = 0;

	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}

	public String join(MemberBean member) {
		// 회원가입
		members[count] = member;
		count++;
		return "회원가입이 완료되었습니다.";
	}

	@Override
	public MemberBean searchById(String id) {
		// 아이디로 회원정보 검색
		MemberBean result = new MemberBean();
		for (int i = 0; i < this.getCount(); i++) {
			if (members[i].getUserid().equals(id)) {
				result = members[i];
			}
		}
		return result;
	}

	@Override
	public MemberBean[] searchByName(String name) {
		// 이름으로 회원정보 검색
		MemberBean[] tempList = new MemberBean[this.searchCountByName(name)];
		int j = 0;
		for (int i = 0; i < this.getCount(); i++) {
			if (members[i].getName().equals(name)) {// string type문자열 비교
				tempList[j] = members[i];
				j++;
			}
		}
		return tempList;
	}

	@Override
	public String remove(String id) {
		// 회원탈퇴
		String result = "";
		if (this.searchById(id) != null) {
			for (int i = 0; i < this.getCount(); i++) {
				if (members[i].getUserid() == id) {
					members[i] = members[this.getCount()];
					members[this.getCount() - 1] = null;
				}
			}
			this.setCount(this.getCount() - 1);
			result = "계정 삭제 성공";
		} else {
			result = "해당 id가 없습니다";
		}
		return result;
	}

	@Override
	public int countAll() {
		// 회원수
		
		return this.getCount();
	}

	@Override
	public int searchCountByName(String name) {
		// 이름(동명)으로 회원찾기
		int tempCount=0;
		for (int i = 0; i < this.getCount(); i++) {
			if (members[i].getName().equals(name)) {
				tempCount++;
			}
		}
		return tempCount;
	}
	//에어리어
	@Override
	public String login(String id, String pass) {
		//로그인
		return null;
	}

	@Override
	public String update(MemberBean member) {
		// 정보수정
		for (int i = 0; i < members.length; i++) {
			members[i].setName(member.getName());
			members[i].setAddr(member.getAddr());
			members[i].setBirth(member.getBirth());
			members[i].setPassword(member.getPassword());
			members[i].setUserid(member.getUserid());
		}
		return null;
	}

}
