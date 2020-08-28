package java01.Basic;
import java.util.Scanner;

/*sysout 이후 자동 완성을 시키면
 * System.out.println이 만들어짐
 */
public class Ex02Quiz {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("당신의 이름을 입력하세요 : ");
		String name = in.next();
		System.out.print(name);
		System.out.println("님 안녕하세요");
		System.out.println("======");
		System.out.println(name + "님 안녕하세요");

	}

}
