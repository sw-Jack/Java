package java07.classQuiz.Ex03;

/*
 * version3 : ��� �̿�
 */

public class L2Main {
	public static void main(String[] args) {
		// L2Char Ŭ������ ��ӹ��� L2CharInit Ŭ������ ��ü ����
		L2CharInit l2 = new L2CharInit();
		
		l2.setJob(2);
		
		System.out.println("���� : " + l2.getJob());
		System.out.println("== ���� =================================");
		System.out.println(l2.getJobExplain());
	}
}
