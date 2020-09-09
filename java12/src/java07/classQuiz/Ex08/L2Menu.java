package java07.classQuiz.Ex08;

public class L2Menu {
	final static String [] MENU = {"직업 선택", "머리스타일 선택", "이름 입력", "캐릭터 생성"};
	final static String [] JOB = {"워리어", "로그", "메이지"};
	final static String [] HAIR = {"Style A", "Style B", "Style C"};
	
	static String getMenu(String [] menu) {
		String menuStr= "============================\n";
		
		for(int i=0;i<menu.length;i++) {
			menuStr += (i+1) + ". " + menu[i] + "\n";
		}
		menuStr += "============================";
		
		return menuStr;
	}
}

	