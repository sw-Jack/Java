package java02.Control.Ex01if;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("방문 횟수를 입력하세요 : ");
	
		int visitCnt = in.nextInt();
		
		if(visitCnt<1) {
			System.out.println("첫 방문 감사합니다.");
		}
		// if문 안의 조건식이 참이 되는 경우가
		// visitCnt가 1이상인 경우이므로 재방문으로 표현했다.
		if(visitCnt>=1) {
			System.out.println("재 방문 감사합니다.");
		}


	}

}
