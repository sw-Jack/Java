package java08.Inheritance.Ex01;

public class MainEx02 {
	public static void main(String[] args) {
		
		// abstract Ŭ������ �����Ͽ� ����ϸ� �����Ǿ� ���� ����
		// abstract �޼ҵ带 �Ʒ��� ���� �����Ͽ� ����� �� �ִ�.
		Attack attack = new Attack() {
			@Override
			public String MelleAttack() {
				return "�y�y�y";
			}
		};
		
		System.out.println(attack.StandOffAttack());
		System.out.println(attack.MelleAttack());
	}
}
