package java02.Control.Ex03For;

public class Ex05 {

	public static void main(String[] args) {
		int i;

		for(i=1;i<5;i++)
		{
			// i�� 2�� ������ break�� ���۵Ǿ� for���� �������´�.
			if(i==2) break;
			// i�� 2�� ������ continue�� ���۵Ǿ� for������ �̵��Ѵ�. i�� 1����
			// if(i ==2) continue;
			System.out.print(i + " ");
		}
	}
}
