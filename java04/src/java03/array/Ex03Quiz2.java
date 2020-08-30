package java03.array;
/* Q. 로또 번호 생성기 제작
 * 1 ~ 45 사이의 임의의 숫자 6개를 출력하는 프로그램을 제작하시오(중복 X)
 */

public class Ex03Quiz2 {
	public static void main(String[] args) {
		int [] nums;
		int cnt = 0;
		nums = new int[45];
		
		while(true) {
			// 배열의 첨자(위치값)가 0부터 시작하므로 random의 시작값을 지정안함
			int idx = (int)(Math.random() * 45);
			// nums 배열의 값이 0이면 사용되지 않았다는 의미이고
			if(nums[idx] == 0)
			{
				// 이런 경우 1로 지정하여 사용했음을 표시하고
				nums[idx] = 1;
				// cnt를 1씩 증가시켜 총 몇개의 번호가 기록되었는지 체크함
				cnt++;
			}
			// 6번 이상되면 종료되도록 break를 사용함
			// if(cnt == 6)이라고 표현해도되지만 6이 아닌 7이 되면 종료되지 않으므로
			// 종료가 되도록 처리하기 위해 if(cnt >= 6)으로 코딩함
			if(cnt >= 6) break;
		}
			// 0부터 44까지 반복
			for(int i=0;i<nums.length;i++)
			{
				// nums의 i번째 위치한 값이 1과 같으면 
				// 즉, 사용되었다면
				if(nums[i] == 1) 
				{
					// i는 사용된 위치 정보이고 배열은 0부터 시작하므로
					// 1~45 까지의 값을 출력하려면 i+1로 표시할 수 있다.
					System.out.print(i + 1 + " ");
				}
			}
	}
}
