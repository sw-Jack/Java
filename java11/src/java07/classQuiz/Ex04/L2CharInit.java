package java07.classQuiz.Ex04;

public class L2CharInit extends L2Char {
	public void setJob(int n) {
		String job = "워리어";
		String jobExplain = "* 워리어는 가장 기본적인 전사의 형태를 띤 클래스입니다."
				+ "\n* 근접 위주의 기초적인 기술을 사용합니다.";
		if(n == 2) { job = "로그"; jobExplain = "* 단검과 활을 다루는데 능숙합니다."
				+ "\n* 근거리,원거리 문제없이 데미지를 주는 전천후 딜러입니다."; }
		else if(n == 3) { job = "메이지"; jobExplain = "* 메이지는 다양한 공격 마법을 사용하여 멀리 있는 적을 상대하는"
				+ "\n스타일의 클래스입니다."; }
		setJob(job);
		setJobExplain(jobExplain);
	}
	// L2Char 클래스를 상속받은 L2CharInit 클래스에서
	// 머리스타일 선택 : 입력 받은 인자 값에 따라 머리스타일 지정
	public void setHair(int s) {
		String hair = "Style A";
		if(s == 2) { hair = "Style B"; }
		else if(s == 3) { hair = "Style C"; }
		setHair(hair);
	}
}
