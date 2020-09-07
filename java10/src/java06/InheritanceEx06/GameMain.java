package java06.InheritanceEx06;

public class GameMain {
	public static void main(String[] args) {
		L2Char l2 = new L2Char();
		
		l2.setRace("인간");
		l2.setName("자바마스터");
		
		System.out.println("* 종족 : " + l2.getRace());
		System.out.println("* 닉네임 : " + l2.getName());

		l2.showAbility();
	}
}


