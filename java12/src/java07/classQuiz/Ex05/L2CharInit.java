package java07.classQuiz.Ex05;

public class L2CharInit extends L2Char {
	public L2CharInit() {
		setJob(1);
		setHair(1);
	}
	
	// ���� ���� �޼ҵ�
	public void setJob(int n) {
		String job = "������";
		String jobExplain = "* ������� ���� �⺻���� ������ ���¸� �� Ŭ�����Դϴ�.\n"
				+ "* ���� ������ �������� ����� ����մϴ�.";
		if(n == 2) { job = "�α�"; jobExplain = "* �ܰ˰� Ȱ�� �ٷ�µ� �ɼ��մϴ�.\n"
				+ "* �ٰŸ�,���Ÿ� �������� �������� �ִ� ��õ�� �����Դϴ�."; }
		else if(n == 3) { job = "������"; jobExplain = "* �������� �پ��� ���� ������ ����Ͽ� �ָ� �ִ� ���� ����ϴ� \n"
				+ "��Ÿ���� Ŭ�����Դϴ�."; }
		setJob(job);
		setJobExplain(jobExplain);
	}
	
	// �Ӹ���Ÿ�� �� ���� �޼ҵ�
	public void setHair(int s) {
		String hair = "Style A";
		if(s == 2) { hair = "Style B"; }
		else if(s == 3) { hair = "Style C"; }
		setHair(hair);
	}
}
