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
		// 배열이름.length는 배열의 길이를 의미한다.
		for(i=1; i<nums.length;i++)
			// 배열 원소값이 36이면 반복문을 빠져나온다.
			if(nums[i] == 36) break;
		
		// 빠져나올 때의 배열 첨자 i값 출력
		System.out.println(i + "번째 중복된 숫자가 존재합니다.");
	}
}