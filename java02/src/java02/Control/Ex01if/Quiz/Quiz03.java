package java02.Control.Ex01if.Quiz;

import java.util.Scanner;
/* Quiz
 * 1. 숫자를 판별하여 다음과 같이 출력되도록 코딩하시오.
 * - 판별할 수 : 5
 * - 양수 : 5
 * - 판별할 수 : -7
 * - 음수 : 7
 */

public class Quiz03 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("판별할 수 : ");
		int num = in.nextInt();
		// 문자열 변수 사용해서  
		String output;
		if(num > 0) {
			output = "양수";
		}
		else {
			output = "음수";
			num *= -1;
		}
		// 출력문은 한번만
		System.out.println(output + " : " + num);
	}

}
