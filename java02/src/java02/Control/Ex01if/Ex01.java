package java02.Control.Ex01if;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// Scanner라는 객체를 in이라는 이름으로 만듦
		// new를 이용하여 heap영역에 Scanner객체를 입력 버퍼인 System.in을 인자로 받아 동적 할당한다.
		Scanner in = new Scanner(System.in);
		
		System.out.print("방문 횟수를 입력하세요 : ");
		// 위에서 생성한 in이라는 객체 안에 있는 nextInt메소드를 이용하여 정수를 입력받아 visitCnt에 저장한다.
		int visitCnt = in.nextInt();
		// if는 조건문으로 괄호안에 조건식을 넣게 된다.
		// 자바에서는 비교 구문인 'visitCnt<1'의 결과가 True, False로 나타나며 True인 경우 {}안의 내용을 실행한다.
		// 방문이 한번도 없는 경우가 첫 방문이므로 visitCnt가 0인지 판단하는 내용이다.
		// 따라서 if(visitCnt==0)로 표현할 수도 있다.
		if(visitCnt<1) {
			System.out.println("첫 방문 감사합니다.");
		}

	}

}
