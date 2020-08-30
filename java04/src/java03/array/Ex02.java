package java03.array;

public class Ex02 {

	public static void main(String[] args) {
		// 배열 선언 시 []를 이용하며, 변수의 앞 또는 뒤에 사용하면 된다.
		// int nums[];
		int [] nums;
		
		// nums라는 배열 변수를 정수형으로 10개의 공간을 한다는 의미이다.
		nums = new int[10];
		
		// 배열의 위치값(첨자)은 0부터 시작함으로 반복문에서 0부터 처리하도록 만든다.
		for(int i=0;i<10;i++)
		{
			 nums[i] = i * i;
		}
		
		// for문을 이용하여 배열의 값들 출력한다.
		// 배열이름.length는 배열의 길이를 의미한다.
		for(int i=1; i<nums.length;i++)
			System.out.println(i + " x " + i + " = " + nums[i]);
	}
}