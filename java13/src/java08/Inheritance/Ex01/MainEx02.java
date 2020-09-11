package java08.Inheritance.Ex01;

public class MainEx02 {
	public static void main(String[] args) {
		
		// abstract 클래스를 생성하여 사용하면 구현되어 있지 않은
		// abstract 메소드를 아래와 같이 구현하여 사용할 수 있다.
		Attack attack = new Attack() {
			@Override
			public String MelleAttack() {
				return "푱푱푱";
			}
		};
		
		System.out.println(attack.StandOffAttack());
		System.out.println(attack.MelleAttack());
	}
}
