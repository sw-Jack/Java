package java08.Inheritance.Ex02;

public class MainEx01 {
	public static void main(String[] args) {
		// 객체 생성 (형식 주의 *)
		// [인터페이스] [객체] = new [인터페이스상속클래스] ();
		Attack attack = new AttackImpl();
		
		System.out.println(attack.MelleAttack());
		System.out.println(attack.StandoffAttack());
	}
}
