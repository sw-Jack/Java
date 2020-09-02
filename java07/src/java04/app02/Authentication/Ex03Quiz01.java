package java04.app02.Authentication;
import java.util.Random;
import java.util.Scanner;

public class Ex03Quiz01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("수를 입력하세요 : ");
		int num = in.nextInt();	
		// getnum의 return 타입이 String, 즉 문자열형이기 때문에 문자열 변수로 반환값을 받는다.
		String get = getnum(num);
		System.out.println("입력값 : " + num);
		System.out.println("인증번호 : " + get);
	}

	// return 값, 즉 반환값의 데이터형이 문자열형이므로 메소드 형도 String 형으로 지정
	static String getnum(int num) {
		// digit에 난수 범위의 최대값 저장
		int digit = (int)Math.pow(10,num); 
		// Random 클래스 객체 random 생성
		Random random = new Random();
		// String.format()을 사용하여 문자열 출력 형식 사용자 지정
		// String.format("%04d", random.nextInt(digit)) 이라하면
		// 자리수를 4칸 확보해놓고 자릿수가 4자리보다 적은 공간은 0으로 채우고 
		// 그런데 문제에서 자릿수를 사용자로부터 입력받는 것이기 때문에 
		// 중간에 사용자 입력값을 받는 변수 num 삽입
		// 형태를 지정한 문자열형 반환값 출력
		return String.format("%0" + num + "d", random.nextInt(digit));
	}
}



/* 자리수 확보 후 출력
 * 자리수 보다 적으면 앞에 0 붙여 출력
 * 자리수 보다 많으면 숫자 그대로
 * Quiz. 앞의 문제에 추가적으로 자리수도 입력받아 출력
 */
