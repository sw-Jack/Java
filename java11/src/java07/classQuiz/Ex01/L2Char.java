package java07.classQuiz.Ex01;

public class L2Char {
	private String tribe;  // ����
	private String job;  // ����
	private String hair;  // �Ӹ� ��Ÿ��
	private String nickName;  // ĳ���͸�
	private String jobExplain;  // ���� ����
	
	public String getTribe() {
		return tribe;
	}
	public void setTribe(String tribe) {
		this.tribe = tribe;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public void setJob(int n) {
		if(n == 1) { this.job = "������"; setJobExplain("������"); }
		else if(n == 2) { this.job = "�α�"; setJobExplain("�α�"); }
		else if(n == 3) { this.job = "������"; setJobExplain("������"); }
	}
	public String getHair() {
		return hair;
	}
	public void setHair(String hair) {
		this.hair = hair;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getJobExplain() {
		return jobExplain;
	}
	public void setJobExplain(String jobExplain) {
		String a = this.job;
		if(a.equals("������")) { this.jobExplain = "* ������� ���� �⺻���� ������ ���¸� �� Ŭ�����Դϴ�."
				+ "\n* ���� ������ �������� ����� ����մϴ�."; }
		if(a.equals("�α�")) { this.jobExplain = "* �ܰ˰� Ȱ�� �ٷ�µ� �ɼ��մϴ�."
				+ "\n* �ٰŸ�,���Ÿ� �������� �������� �ִ� ��õ�� �����Դϴ�."; }
		if(a.equals("������")) { this.jobExplain = "* �������� �پ��� ���� ������ ����Ͽ� �ָ� �ִ� ���� ����ϴ�"
				+ "\n��Ÿ���� Ŭ�����Դϴ�."; }
	}
}
