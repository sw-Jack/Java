package java07.classQuiz.Ex08;

public class L2Menu {
	final static String [] MENU = {"���� ����", "�Ӹ���Ÿ�� ����", "�̸� �Է�", "ĳ���� ����"};
	final static String [] JOB = {"������", "�α�", "������"};
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

	