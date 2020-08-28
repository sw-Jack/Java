package java02.Control.Ex01if;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("방문 횟수를 입력하세요 : ");
	
		int visitCnt = in.nextInt();
		
		if(visitCnt<1) {
			System.out.println("첫 방문 감사합니다.");
		}		
		// else는 if의 조건식이 거짓인 경우 동작한다.
		// 위의 if(visitCnt<1)의 반대는 if(visitCnt>=1)이 이며
		// else를 사용하게 되면 if(visitCnt>=1)이 생략된 것으로
		// 판단할 수 있다.
		// 따라서 if(조건식){참인 경우}else{조건식이 거짓인 경우}로
		// 이해하면 된다.
		else {
			System.out.println("재 방문 감사합니다.");
		}


	}

}
