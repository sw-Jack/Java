package java02.Control.Ex01if;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);		
		System.out.print("방문 횟수를 입력하세요 : ");
		int visitCnt = in.nextInt();
		
		String visitStr = null;
		// 메소드(함수)는 최소한으로 사용하는 것이 좋다.
		// 기존에 조건문안에서 출력문을 사용하는 것보다는
		// 변수를 이용하여 문자열을 저장하고 한 번에 출력하는 것이 좋다.
		if(visitCnt<1) {
			// System.out.print("첫 ");
			visitStr = "첫 ";
		}		
		else {
			// System.out.print("재 ");
			visitStr = "재 ";
		}
		System.out.println(visitStr + "방문 감사합니다.");


	}

}
