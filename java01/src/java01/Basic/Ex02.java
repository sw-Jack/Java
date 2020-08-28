package java01.Basic;
import java.util.Scanner;

/* 
 * 자동 완성
 * 명령어의 일부를 입력하고 Ctrl + space 를 누르면
 * 명령어가 자동 완성되는 기능
 * 이를 이용하면 import를 적어주지 않아도
 * 자동으로 만들어진다
 */
/* Quiz
 * 당신의 이름을 입력하세요 ? 000
 * 000님 안녕하세요
 */
public class Ex02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("당신의 이름을 입력하세요 : ");
		String name = in.next();
		System.out.println(name + "님 안녕하세요");

	}

}
