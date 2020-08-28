package java02.Control.Ex01if.Quiz;

import java.util.Scanner;
/* Quiz
 * 2. 태어난 년도 2자리를 입력받아 다음과 같이 출력하시오
 * 출력) xx년에 태어난 당신 00살입니다.
 */

public class Quiz05 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("태어난 년도 2자리 입력 : ");
		int year = in.nextInt();
		System.out.println("현재 년도 입력 : ");
		int currentyear = in.nextInt();
		
		// 나이 구하는 공식 적용 : (현재 년도 - 태어난 년도 + 1)
		int age = currentyear - year + 1;
		if(age < 0) { 
			age = age + 100;
		}
		System.out.println("당신은 " + age + "살 이군요");
	}

}
