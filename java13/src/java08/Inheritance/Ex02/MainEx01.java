package java08.Inheritance.Ex02;

public class MainEx01 {
	public static void main(String[] args) {
		// ��ü ���� (���� ���� *)
		// [�������̽�] [��ü] = new [�������̽����Ŭ����] ();
		Attack attack = new AttackImpl();
		
		System.out.println(attack.MelleAttack());
		System.out.println(attack.StandoffAttack());
	}
}
