package java02.Control.Ex03For;
/* Quiz
 * 2. ������ ���ǿ� �µ��� 10���� ������ ���� ����Ͻÿ�.
 * a. ���� ������ 1~100���� ���Ѵ�.
 * b. 10���� ���� �������ϰ� �����ϸ� ���� ū���� �ѹ� �� ���
 * c. 10���� �� �� ���� ���� ���� �ѹ� �� ���
 */
public class Ex05Quiz2 {

	public static void main(String[] args) {
		int i;
		int max = 1;
		// �ּҰ��� ���� ��� �ּҰ��� �����ϱ� ���� ������ �ʱⰪ�� 
		// ���Ǵ� ���� �� �ִ밪�� �����ϸ� �ȴ�.
		int min = 100;
		for (i=0;i<10;i++) {

			int randNum = (int)(Math.random() * 100) + 1;   // 1 ~ 100
			System.out.print(randNum + " ");
			if(max<randNum) {
				max = randNum;
			}
			if(min>randNum) {
				min = randNum;
			}
		}
		System.out.println("\n���� ū �� : " + max + "\n���� ���� �� : " + min);
	}

}
