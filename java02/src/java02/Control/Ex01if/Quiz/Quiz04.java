package java02.Control.Ex01if.Quiz;

import java.util.Scanner;
/* Quiz
 * 1. 숫자를 판별하여 다음과 같이 출력되도록 코딩하시오.
 * - 판별할 수 : 5
 * - 양수 : 5
 * - 판별할 수 : -7
 * - 음수 : 7
 */

public class Quiz04 {

	public static void main(String[] args) {
		// @SuppressWarnings는 경고를 무시할 경우 사용됨
		// @SuppressWarnings("resource")
		// resource 즉, 자원을 무시하겠다는 의미임.
		Scanner in = new Scanner(System.in);
		
		System.out.print("판별할 수 : ");
		int num = in.nextInt();

		String output = "양수";
		
		if(num < 0) {
			output = "음수";
			num *= -1;
		}
		System.out.println(output + " : " + num);
	}

}
