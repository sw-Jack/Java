package java09.Exception.Ex01;
import java.util.Random;


// �������̽� ExceptionEx�� ��ӹ���(implements) ArithmeticEx01 Ŭ����
public class ArithmeticEx01 implements ExceptionEx {
	// �޼ҵ� ������
	@Override
	public void ExceptionCase() {
		// ���� ��ü ����
		Random random = new Random();
		//
		for(int i=0;i<10;i++) {
			// 0 ~ 9 ������ ���� ���� 100�� ������(10�� ����)
			System.out.println(100/random.nextInt(10));
		}
	}
}
