package java02.Control.Ex01if;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("방문 횟수를 입력하세요 : ");
		int visitCnt = in.nextInt();
		
		// if문과 else에서 출력 결과 중 "방문 감사합니다."라는 문구는 
		// if문에서도 사용되며 else문에서도 사용된다.
		// 즉, 참과 거짓 모두 사용됨으로 항상 사용된다고 판단할 수 있다.
		// 따라서 조건문이 끝나는 지점에 한 번만 출력하여 사용할 수 있다.
		if(visitCnt<1) {
			// System.out.println("첫 방문 감사합니다.");
			System.out.print("첫 ");
		}		
		else {
			// System.out.println("재 방문 감사합니다.");
			System.out.print("재 ");
		}
		System.out.println("방문 감사합니다.");


	}

}
