package java03.array;
/* Q. �ζ� ��ȣ ������ ����
 * 1 ~ 45 ������ ������ ���� 6���� ����ϴ� ���α׷��� �����Ͻÿ�(�ߺ� X)
 */

public class Ex03Quiz {
	public static void main(String[] args) {
		int [] nums;
		int i;
		
		// ��ȣ 6���� ���� �迭 ����
		nums = new int[6];
		
		for(i=0;i<nums.length;i++) {
			// 1 ~ 45 ������ ������ �� ����
			nums[i] = (int)(Math.random() * 45 + 1);
			
			// �迭�� ÷���� ���� ����� ��
			for(int j=0;j<i;j++)
			
			// ���� ÷���� ���� �� �ߺ��Ǵ� ���� ������ i--, �� �ٽ� ����(���� ���� �κ����� �ö�)
			if(nums[j] == nums[i])
				i--;
		}
		
		// �ߺ����� 6���� �� ���
		for(i=0;i<nums.length;i++){
			System.out.print(nums[i] + " ");
			}	
	}
}
