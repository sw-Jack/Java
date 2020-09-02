package java04.app02.Authentication;
import java.util.Scanner;

/* Quiz
 * 입력한 수의 자리수 만큼에 대한 임의의 값이 나올 수 있도록 코딩하시오
 * ex) 
 * 수를 입력하세요 : 4
 * 1 ~ 10000 사이의 임의의 난수 반환
 * random 메소드 활용
 */


public class Ex02Quiz01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("수를 입력하세요 : ");
		// 자릿수 입력
		int num = in.nextInt();	
		// getnum() 메소드의 반환값 outputnum을 받을 변수 get
		int get = getnum(num);
		System.out.println("인증번호 : " + get);
	}

	// 임의의 인증번호 출력 메소드
	static int getnum(int n) {
		// 임의의 인증번호 생성
		// 자바 내장 메소드 Math.random()와
		// 승수를 구하는 메소드 Math.pow()를 이용해서 0이상 10000미만의 수 생성
		int outputnum = (int)(Math.random()*Math.pow(10,n));
		// 임의의 인증번호 반환
		return outputnum;
	}
}
