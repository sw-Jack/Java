package java01.Basic;
import java.util.Scanner;
/*Quiz
 * 다음과 같이 동작되도록 코딩하시오
 * 1. 표준 체중 계산하기
 * 남자 : 키*키*22
 * 여자 : 키*키*21
 */
public class Ex05 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("당신의 키를 입력하세요(m기준) : ");
		float height = in.nextFloat();
		System.out.println(height + "m 이군요");

	}

}
