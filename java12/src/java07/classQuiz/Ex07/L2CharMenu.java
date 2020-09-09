package java07.classQuiz.Ex07;

public class L2CharMenu {
	// 직업 종류를 배열 값으로 저장
	final static String [] JOB = {"워리어", "로그", "메이지"};
	// 머리 스타일 종류를 배열 값으로 저장
	final static String [] HAIR = {"Style A", "Style B", "Style C"};
	
	// 메뉴창 출력 메소드
	static String getMenu(String [] menu) {
		String menuStr= "\n============================\n";
		
		for(int i=0;i<menu.length;i++) {
			// 배열 값들이 하나씩 menuStr이라는 변수에 저장
			menuStr += (i+1) + ". " + menu[i] + "\n";
		}
		menuStr += "============================";
		
		// 모두 합쳐져 완성된 문자열 menuStr 반환
		return menuStr;
	}
}

	