package java02.Control.Ex01if;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);		
		System.out.print("방문 횟수를 입력하세요 : ");
		int visitCnt = in.nextInt();
		
		// String은 문자열을 저장할 수 있는 type이며 
		// 초기값을 null로 주면 객체가 비어있다는 의미이다.
		// null이 아닌 "재 "를 초기값으로 주게 되면
		// else문을 사용할 필요가 없게 된다.
		// 기본값이 "재 "이며 visitCnt가 0인 경우만 
		// "첫 "이라는 문자열을 저장하면 첫 방문과 재 방문을 구분할 수 있다.
		// String visitStr = null;
		String visitStr = "재";
		
		if(visitCnt<1) {
			visitStr = "첫 ";
		}
		
		/*
		 * else { visitStr = "재 "; }
		 */		
		System.out.println(visitStr + "방문 감사합니다.");


	}

}
