package java03.array;

public class Ex03 {

	public static void main(String[] args) {
		int [] nums;
		int i;
		nums = new int[10];

		for(i=0;i<10;i++)
		{
			 nums[i] = i * i;
		}
		// �迭�̸�.length�� �迭�� ���̸� �ǹ��Ѵ�.
		for(i=1; i<nums.length;i++)
			// �迭 ���Ұ��� 36�̸� �ݺ����� �������´�.
			if(nums[i] == 36) break;
		
		// �������� ���� �迭 ÷�� i�� ���
		System.out.println(i + "��° �ߺ��� ���ڰ� �����մϴ�.");
	}
}