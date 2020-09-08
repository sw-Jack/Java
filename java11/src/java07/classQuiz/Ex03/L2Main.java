package java07.classQuiz.Ex03;

/*
 * version3 : 상속 이용
 */

public class L2Main {
	public static void main(String[] args) {
		// L2Char 클래스를 상속받은 L2CharInit 클래스의 객체 생성
		L2CharInit l2 = new L2CharInit();
		
		l2.setJob(2);
		
		System.out.println("직업 : " + l2.getJob());
		System.out.println("== 설명 =================================");
		System.out.println(l2.getJobExplain());
	}
}
