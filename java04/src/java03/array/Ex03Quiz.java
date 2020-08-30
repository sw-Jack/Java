package java03.array;
/* Q. 로또 번호 생성기 제작
 * 1 ~ 45 사이의 임의의 숫자 6개를 출력하는 프로그램을 제작하시오(중복 X)
 */

public class Ex03Quiz {
	public static void main(String[] args) {
		int [] nums;
		int i;
		
		// 번호 6개를 담을 배열 생성
		nums = new int[6];
		
		for(i=0;i<nums.length;i++) {
			// 1 ~ 45 사이의 임의의 수 생성
			nums[i] = (int)(Math.random() * 45 + 1);
			
			// 배열의 첨자의 이전 값들과 비교
			for(int j=0;j<i;j++)
			
			// 이전 첨자의 값들 중 중복되는 값이 있으면 i--, 즉 다시 생성(위의 생성 부분으로 올라감)
			if(nums[j] == nums[i])
				i--;
		}
		
		// 중복없는 6개의 값 출력
		for(i=0;i<nums.length;i++){
			System.out.print(nums[i] + " ");
			}	
	}
}
