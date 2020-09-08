package java07.classQuiz.Ex04;

/*
 * version3 : 상속 이용
 */

public class L2Main {
	public static void main(String[] args) {
		// 상속 받은 클래스의 객체 생성
		L2CharInit l2 = new L2CharInit();
		
		// 직업 지정
		l2.setJob(2);
		// 머리스타일 지정
		l2.setHair(2);

		// 직업 출력
		System.out.println("직업 : " + l2.getJob());
		System.out.println("== 설명 =================================");
		// 직업 설명 출력
		System.out.println(l2.getJobExplain());
		// 머리스타일 출력
		System.out.println("머리 스타일 : " + l2.getHair());
	}
}
