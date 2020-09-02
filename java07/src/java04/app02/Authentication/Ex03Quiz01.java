package java04.app02.Authentication;
import java.util.Random;
import java.util.Scanner;

public class Ex03Quiz01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("���� �Է��ϼ��� : ");
		int num = in.nextInt();	
		// getnum�� return Ÿ���� String, �� ���ڿ����̱� ������ ���ڿ� ������ ��ȯ���� �޴´�.
		String get = getnum(num);
		System.out.println("�Է°� : " + num);
		System.out.println("������ȣ : " + get);
	}

	// return ��, �� ��ȯ���� ���������� ���ڿ����̹Ƿ� �޼ҵ� ���� String ������ ����
	static String getnum(int num) {
		// digit�� ���� ������ �ִ밪 ����
		int digit = (int)Math.pow(10,num); 
		// Random Ŭ���� ��ü random ����
		Random random = new Random();
		// String.format()�� ����Ͽ� ���ڿ� ��� ���� ����� ����
		// String.format("%04d", random.nextInt(digit)) �̶��ϸ�
		// �ڸ����� 4ĭ Ȯ���س��� �ڸ����� 4�ڸ����� ���� ������ 0���� ä��� 
		// �׷��� �������� �ڸ����� ����ڷκ��� �Է¹޴� ���̱� ������ 
		// �߰��� ����� �Է°��� �޴� ���� num ����
		// ���¸� ������ ���ڿ��� ��ȯ�� ���
		return String.format("%0" + num + "d", random.nextInt(digit));
	}
}



/* �ڸ��� Ȯ�� �� ���
 * �ڸ��� ���� ������ �տ� 0 �ٿ� ���
 * �ڸ��� ���� ������ ���� �״��
 * Quiz. ���� ������ �߰������� �ڸ����� �Է¹޾� ���
 */
