package java03.array;

public class Ex01 {

	public static void main(String[] args) {
		// �迭 ���� �� []�� �̿��ϸ�, ������ �� �Ǵ� �ڿ� ����ϸ� �ȴ�.
		// int arr[];
		int [] arr;
		
		// arr��� �迭 ������ ���������� 10���� ������ ����Ѵٴ� �ǹ��̴�.
		arr = new int[10];
		
		// �迭�� ��ġ��(÷��)�� 0���� �����ϹǷ� �ݺ������� 0���� ó���ϵ��� �����.
		for(int i=0;i<10;i++)
		{
			 arr[i] = i * i;
		}
		System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[9]);
	}
}
