package java02.Control.Ex03For;
/* Quiz
 * 3. ������ ���ǿ� �µ��� 2���� ������ ���� ����Ͻÿ�.
 * a. ���� ������ ū �� ������ ����Ͻÿ�.
 * b. ���� ������ 1 ~ 10���� ���Ͻÿ�.
 */
public class Ex05Quiz3 {

	public static void main(String[] args) {
		int min = (int)(Math.random() * 10) + 1;
		int max = (int)(Math.random() * 10) + 1;
		int tmp= 0;
		if(max<min) {
			tmp = min;
			min = max;
			max = tmp;
		}
		System.out.print(min + " " + max);	
	}
}
