package java07.classQuiz.Ex02;

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
		if(n == 1) { this.job = "������"; jobExplain = "* ������� ���� �⺻���� ������ ���¸� �� Ŭ�����Դϴ�."
				+ "\n* ���� ������ �������� ����� ����մϴ�."; }
		else if(n == 2) { this.job = "�α�"; jobExplain = "* �ܰ˰� Ȱ�� �ٷ�µ� �ɼ��մϴ�."
				+ "\n* �ٰŸ�,���Ÿ� �������� �������� �ִ� ��õ�� �����Դϴ�."; }
		else if(n == 3) { this.job = "������"; jobExplain = "* �������� �پ��� ���� ������ ����Ͽ� �ָ� �ִ� ���� ����ϴ�"
				+ "\n��Ÿ���� Ŭ�����Դϴ�."; }
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
		this.jobExplain = jobExplain;
	}
}
