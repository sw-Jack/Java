package java07.classQuiz.Ex03;

// L2CharInit Ŭ������ L2Char Ŭ������ ��ӹް� ���ڰ� 1���� setter �޼ҵ� ����
public class L2CharInit extends L2Char {
	public void setJob(int n) {
		String job = "������";
		String jobExplain = "* ������� ���� �⺻���� ������ ���¸� �� Ŭ�����Դϴ�."
				+ "\n* ���� ������ �������� ����� ����մϴ�.";
		if(n == 2) { job = "�α�"; jobExplain = "* �ܰ˰� Ȱ�� �ٷ�µ� �ɼ��մϴ�."
				+ "\n* �ٰŸ�,���Ÿ� �������� �������� �ִ� ��õ�� �����Դϴ�."; }
		else if(n == 3) { job = "������"; jobExplain = "* �������� �پ��� ���� ������ ����Ͽ� �ָ� �ִ� ���� ����ϴ�"
				+ "\n��Ÿ���� Ŭ�����Դϴ�."; }
		setJob(job);
		setJobExplain(jobExplain);
	}
}
