package java09.Exception.Ex01;
import java.util.Random;

//�������̽� ExceptionEx�� ��ӹ���(implements) ArithmeticEx03 Ŭ����
public class ArithmeticEx03 implements ExceptionEx {

	@Override
	public void ExceptionCase() {
		Random random = new Random();
		int result = 0;
		for(int i=0;i<10;i++) {
			try { // ���� �߻� �ڵ�
				result = 100/random.nextInt(10);
			} 
			catch(ArithmeticException e) {
				// ��� ����
				result = 0;
			}
			catch(Exception e) {
				// ��� ����
				e.printStackTrace();
			}
			finally { // ���� ���� ���� ������ ����
				System.out.println(result);
			}
		}
	}
}
