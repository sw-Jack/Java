package java07.classQuiz.Ex04;

/*
 * version3 : ��� �̿�
 */

public class L2Main {
	public static void main(String[] args) {
		// ��� ���� Ŭ������ ��ü ����
		L2CharInit l2 = new L2CharInit();
		
		// ���� ����
		l2.setJob(2);
		// �Ӹ���Ÿ�� ����
		l2.setHair(2);

		// ���� ���
		System.out.println("���� : " + l2.getJob());
		System.out.println("== ���� =================================");
		// ���� ���� ���
		System.out.println(l2.getJobExplain());
		// �Ӹ���Ÿ�� ���
		System.out.println("�Ӹ� ��Ÿ�� : " + l2.getHair());
	}
}
