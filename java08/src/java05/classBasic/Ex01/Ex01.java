package java05.classBasic.Ex01;

/* class�� ����� ������ �͵��� ���� ���� ���̴�.
 * �Ʒ������� car��� class�� ������ ���̸�
 * car�� �Ӽ� �� ����, �� ũ��, ������ ������ ���̴�.
 * class�� �̸� ù ���ڴ� �빮�ڷ� ����Ѵ�.
 * 
 */


// Car Ŭ���� ����
// ���� ���� : Car�� �Ӽ� �� ����, �� ũ��, ������ ����
class Car{
	String outColor;
	int wheelSize;
	int engine;
}

public class Ex01 {
	public static void main(String[] args) {
		// Car Ŭ������ ����� ���
		// [Ŭ�����̸�] [��ü�̸�] = new [Ŭ�����̸�] ()
		// ���� ���� �������� ����Ѵ�.
		Car car = new Car();
		
		// .(��)�� ��ü�� ������ �ִ� ���� �������
		// car��� ��ü�� ���ο� �Ʒ��� ���� �������� �����Ͽ� �����͸� ������ ���̴�.
		car.outColor = "red";
		car.wheelSize = 17;
		car.engine = 5000;
		
		System.out.println(car);
		System.out.println(car.outColor);
		System.out.println(car.wheelSize);
		System.out.println(car.engine);
	}
}
