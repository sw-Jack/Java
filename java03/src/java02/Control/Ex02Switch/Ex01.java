package java02.Control.Ex02Switch;

public class Ex01 {

	public static void main(String[] args) {
		// Math�� ���� ���� Ŭ�����̸� ���ο� �ִ� random �޼ҵ�� 
		// ������(������) double�� �����͸� ��ȯ(������)�Ѵ�.
		// �ű⿡ 100 ������ (int)�� �̿��Ͽ� ���������� �ڷ����� �������ش�.
		int randNum = (int)(Math.random() * 100);
		
		System.out.println(randNum + "��");
		System.out.print("���� : ");
		
		// switch�� ��ȣ �ȿ��� �������� ���� �ϸ� randNum / 10�� 2�ڸ� ������
		// ���ڸ��� ���� ����ϰڴٴ� �ǹ��̴�. 
		// 90���� , 80���� �������� ���� 9, 8�̶�� ���� ��� ���� ���� �����̴�.
		// case�� Ư�� ���¸� �ǹ��ϴ� ������ case 9�ϸ� switch�� ����� 9�� ���� �ǹ��ϸ� 
		// if(randNum/10 == 9)�� ���� �ǹ��̴�.
		// break�� switch ��ɾ ���������� ���� ��ɾ��̴�.
		
		switch(randNum / 10) {
		case 9 : System.out.println("A"); break;
		case 8 : System.out.println("B"); break;
		case 7 : System.out.println("C"); break;
		case 6 : System.out.println("D"); break;
		default : System.out.println("F"); break;
		}
	}

}
