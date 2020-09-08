package java07.classQuiz.Ex01;

public class L2Char {
	private String tribe;  // 종족
	private String job;  // 직업
	private String hair;  // 머리 스타일
	private String nickName;  // 캐릭터명
	private String jobExplain;  // 직업 설명
	
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
		if(n == 1) { this.job = "워리어"; setJobExplain("워리어"); }
		else if(n == 2) { this.job = "로그"; setJobExplain("로그"); }
		else if(n == 3) { this.job = "메이지"; setJobExplain("메이지"); }
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
		if(a.equals("워리어")) { this.jobExplain = "* 워리어는 가장 기본적인 전사의 형태를 띤 클래스입니다."
				+ "\n* 근접 위주의 기초적인 기술을 사용합니다."; }
		if(a.equals("로그")) { this.jobExplain = "* 단검과 활을 다루는데 능숙합니다."
				+ "\n* 근거리,원거리 문제없이 데미지를 주는 전천후 딜러입니다."; }
		if(a.equals("메이지")) { this.jobExplain = "* 메이지는 다양한 공격 마법을 사용하여 멀리 있는 적을 상대하는"
				+ "\n스타일의 클래스입니다."; }
	}
}
