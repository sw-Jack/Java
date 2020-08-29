package java02.Control.Ex03For;

public class Ex05 {

	public static void main(String[] args) {
		int i;

		for(i=1;i<5;i++)
		{
			// i가 2와 같으면 break가 동작되어 for문을 빠져나온다.
			if(i==2) break;
			// i가 2와 같으면 continue가 동작되어 for문으로 이동한다. i는 1증가
			// if(i ==2) continue;
			System.out.print(i + " ");
		}
	}
}
