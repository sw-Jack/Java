package java04.app02.Authentication;
import java.util.Random;
import java.util.Scanner;
/* 자리수 확보 후 출력
 * 자리수 보다 적으면 앞에 0 붙여 출력
 * 자리수 보다 많으면 숫자 그대로
 */

public class Ex03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("수를 입력하세요 : ");
		int num = in.nextInt();	
		
		// format은 특정 문자열을 만들 경우 사용된다.
		// 첫번째 인자의 모양으로 두번째 입력한 데이터를 만들어 주는 것으로
		// 첫번째 인자인 %04d에서 d는 digit를 의미하는 것으로 정수를 뜻하며
		// 4는 4자리수를 의미하고 0은 4자리보다 작은수들이 들어오면 \
		// 빈 자리는 0으로 채운다는 의미이다.
		// 예를 들어 입력된 값이 12인 경우 2자리수이므로 나머지 2자리는 0으로 채워져
		// 0012라는 문자열로 변환하게 된다.
		String str = String.format("%04d", num);
		System.out.println("인증번호 : " + str);
	}


}
