package java03.array;

public class Ex02 {

	public static void main(String[] args) {
		// �迭 ���� �� []�� �̿��ϸ�, ������ �� �Ǵ� �ڿ� ����ϸ� �ȴ�.
		// int nums[];
		int [] nums;
		
		// nums��� �迭 ������ ���������� 10���� ������ �Ѵٴ� �ǹ��̴�.
		nums = new int[10];
		
		// �迭�� ��ġ��(÷��)�� 0���� ���������� �ݺ������� 0���� ó���ϵ��� �����.
		for(int i=0;i<10;i++)
		{
			 nums[i] = i * i;
		}
		
		// for���� �̿��Ͽ� �迭�� ���� ����Ѵ�.
		// �迭�̸�.length�� �迭�� ���̸� �ǹ��Ѵ�.
		for(int i=1; i<nums.length;i++)
			System.out.println(i + " x " + i + " = " + nums[i]);
	}
}