package java08.Inheritance.Ex02;

// AttackImpl Ŭ������ implements��� Ű���带 ���� Attack �������̽��� ��ӹ���
public class AttackImpl implements Attack {

	// @Override Ű���带 ���� �߻� Ŭ������ ����ϰ� ���� �������̽��� �޼ҵ� ����
	@Override
	public String StandoffAttack() {
		return "����";
	}

	@Override
	public String MelleAttack() {
		return "����";
	}
}
