package java04.app02.Authentication;
import java.util.Random;
import java.util.Scanner;

public class Ex02Quiz03 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("수를 입력하세요 : ");
		int num = in.nextInt();	
		int get = getnum(num);
		System.out.println("인증번호 : " + get);
	}

	static int getnum(int n) {
		// pow(a,b)는 a의 b승이라는 개념으로
		// pow(10,n)은 10의 n승을 표현한 것이다.
		// 최대값 digit를 pow를 사용해 초기화
		// 즉,사용자가 입력한 자릿수의 임의의 수가 최대값  digit
		int digit = (int)Math.pow(10,n);
		// Random 클래스 객체 random 생성
		Random random = new Random();
		// 생성한 임의의 수를 변수로 받아 반환하지 않고
		// 바로 return 값으로 
		// 참고) 
		// return new Random().nextInt((int)Math.pow(10,n)); 로도 표현할 수 있음
		return random.nextInt(digit);
	}
}




/* Quiz
 * 입력한 수의 자리수 만큼에 대한 임의의 값이 나올 수 있도록 코딩하시오
 * ex) 자밪
 * 수를 입력하세요 : 4
 * 1 ~ 10000 사이의 임의의 난수 반환
 * random 메소드 활용
 */
