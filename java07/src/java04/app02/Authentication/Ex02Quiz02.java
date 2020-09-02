package java04.app02.Authentication;
import java.util.Random;
import java.util.Scanner;

public class Ex02Quiz02 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("수를 입력하세요 : ");
		int num = in.nextInt();	
		int get = getnum(num);
		System.out.println("인증번호 : " + get);
	}

	static int getnum(int n) {
		// outputnum : 인증번호 저장
		int outputnum;
		// digit : 인증 번호의 최대값 지정
		// 입력받는 n의 값이 10에 대한 승수를 구하는 내용이므로 
		// digit의 초기값을 1로 하여 10을 n번 곱하도록 코딩
		int digit = 1;
		// 기존의 사용하던 Math.random()은 예전 코딩 방식으로 
		// 요즘은 아래와 같은 Random 객체를 생성하여 임의의 수를 구함.
		Random random = new Random();
		// 10의 승수를 표현하기 위해 10을 n번(n은 입력받은 자릿수) 곱하도록 구현
		for(int i=0;i<n;i++) {
			digit = digit * 10;
		}
		// Random 클래스 내의 nextInt를 이용하여 임의의 정수 반환
		// 인자는 랜덤 범위의 최대값으로 사용됨 : 0 이상 digit 미만의 범위
		outputnum = random.nextInt(digit);
		return outputnum;
	}
}




/* Quiz
 * 입력한 수의 자리수 만큼에 대한 임의의 값이 나올 수 있도록 코딩하시오
 * ex) 
 * 수를 입력하세요 : 4
 * 1 ~ 10000 사이의 임의의 난수 반환
 * random 메소드 활용
 */
