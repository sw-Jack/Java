import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// final�� ����� �ǹ̸� �ο��ϱ� ���� ���ڿ��� ǥ���ϴ� ���̴�.
		// 50�̶�� ���� �ǹ̰� ������ 50�� MAXEFFECTIVERANGE�� ǥ���ϸ�
		// �ִ� ��ȿ ��Ÿ��� ������ �� �����Ƿ� �ڵ��� ������(�б� ���� ��)�� ���� �� �ִ�.
		final int MAXEFFECTIVERANGE = 50;
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.print("�Ÿ� �Է� : ");
		int distance = in.nextInt();
		String output;

		// ���࿡ distance(�Ÿ�)�� MAXEFFECTIVERANGE(�ִ� ��ȿ ��Ÿ�)���� ũ��
		// ��, �ָ� ������ 
		if(distance > MAXEFFECTIVERANGE) {
			output = "���� " + (distance - MAXEFFECTIVERANGE) + "m �ָ� �־��";
		}
		// �׷��� �ʰ�(else) ���࿡(if) �Ÿ��� �ִ� ��ȿ ��Ÿ����� ������ 
		// ��, ������
		else if(distance < MAXEFFECTIVERANGE) {
			output = "���� " + (MAXEFFECTIVERANGE - distance) + "m ������ �־��";
		}
		// ���� ��� ������ �ƴϸ�(else) ��, ������
		else {
			output = "�� ��Ȯ�� ��ġ�ؿ�";
		}
		System.out.println("�ִ� ��ȿ ��Ÿ�" + output);
		
		

	}

}
