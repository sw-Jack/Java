package java02.Control.Ex01if.Quiz;

import java.util.Scanner;
/* Quiz
 * 세 수를 입력받아 큰 수를 출력하시오.
 * 알고리즘 2
 * 토너먼트 방식으로 코딩
 */

public class Quiz02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		System.out.print("첫번째 수 입력 : ");
		int num1 = in.nextInt();
		System.out.print("두번째 수 입력 : ");
		int num2 = in.nextInt();
		System.out.print("세번째 수 입력 : ");
		int num3 = in.nextInt();
		int max;
		
		if(num1 < num2) {
			max = num2;
		}
		else {
			max = num1;
		}
		// 앞의 비교 결과를 나머지 num3와 비교하여 최대값 지정 후 출력
		if(max < num3) {
			max = num3;
		}
		System.out.print("큰 수 : " + max);


	}

}
