package java01.Basic;
import java.util.Scanner;

public class Ex05Quiz {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("����� Ű�� �Է��ϼ��� : ");
		float kg = in.nextFloat();
		float mskg = kg*kg*22;
		float wskg = kg*kg*21;
		System.out.println("ǥ�� ü�� ���");
		System.out.println("==========");
		System.out.println("���� ǥ�� ü�� : " + mskg);
		System.out.println("���� ǥ�� ü�� : " + wskg);
	}

}
