package java09.Exception.Ex01;
import java.util.Random;

//�������̽� ExceptionEx�� ��ӹ���(implements) ArithmeticEx02 Ŭ����
public class ArithmeticEx02 implements ExceptionEx {

	@Override
	public void ExceptionCase() {
		Random random = new Random();
		
		for(int i=0;i<10;i++) {
			try { // ���ܰ� �߻��� ���� �ڵ带 �̰��� �ִ´�.
			System.out.println(100/random.nextInt(10));
			} 
			catch(ArithmeticException e) {
				// try���� ������ ���ܰ� �߻��Ǹ� �̰����� �ذ�
				// �Ʒ� �ڵ�� ���ܰ� �߻��Ǿ��� ��� ���� ���� ���
				// e.printStackTrace();
				
				// ���� �߻��ϴ� ��쿡�� "0"�� ���
				System.out.println("0");
			}
		}
	}
}
