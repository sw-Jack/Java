package java07.classQuiz.Ex07;

public class L2CharMenu {
	// ���� ������ �迭 ������ ����
	final static String [] JOB = {"������", "�α�", "������"};
	// �Ӹ� ��Ÿ�� ������ �迭 ������ ����
	final static String [] HAIR = {"Style A", "Style B", "Style C"};
	
	// �޴�â ��� �޼ҵ�
	static String getMenu(String [] menu) {
		String menuStr= "\n============================\n";
		
		for(int i=0;i<menu.length;i++) {
			// �迭 ������ �ϳ��� menuStr�̶�� ������ ����
			menuStr += (i+1) + ". " + menu[i] + "\n";
		}
		menuStr += "============================";
		
		// ��� ������ �ϼ��� ���ڿ� menuStr ��ȯ
		return menuStr;
	}
}

	