package java01.Basic;
import java.util.Scanner;

public class Ex05Quiz {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("당신의 키를 입력하세요 : ");
		float kg = in.nextFloat();
		float mskg = kg*kg*22;
		float wskg = kg*kg*21;
		System.out.println("표준 체중 계산");
		System.out.println("==========");
		System.out.println("남자 표준 체중 : " + mskg);
		System.out.println("여자 표준 체중 : " + wskg);
	}

}
