package java06.InheritanceEx06;

public class GameMain {
	public static void main(String[] args) {
		L2Char l2 = new L2Char();
		
		l2.setRace("�ΰ�");
		l2.setName("�ڹٸ�����");
		
		System.out.println("* ���� : " + l2.getRace());
		System.out.println("* �г��� : " + l2.getName());

		l2.showAbility();
	}
}


