package java07.classQuiz.Ex01;

// version1

public class L2Main {
	public static void main(String[] args) {
		L2Char l2 = new L2Char();
		
		l2.setJob(2);
		
		System.out.println("직업 : " + l2.getJob());
		System.out.println("== 설명 =================================");
		System.out.println(l2.getJobExplain());
	}
}
