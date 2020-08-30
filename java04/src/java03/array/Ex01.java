package java03.array;

public class Ex01 {

	public static void main(String[] args) {
		// 배열 선언 시 []를 이용하며, 변수의 앞 또는 뒤에 사용하면 된다.
		// int arr[];
		int [] arr;
		
		// arr라는 배열 변수를 정수형으로 10개의 공간을 사용한다는 의미이다.
		arr = new int[10];
		
		// 배열의 위치값(첨자)은 0부터 시작하므로 반복문에서 0부터 처리하도록 만든다.
		for(int i=0;i<10;i++)
		{
			 arr[i] = i * i;
		}
		System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[9]);
	}
}
