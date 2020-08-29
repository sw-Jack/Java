package java02.Control.Ex03For;

public class Ex04 {

	public static void main(String[] args) {
		int i,j;
       
		// 이중 for문
		// 첫 번째 for문이 한번 실행되면 두 번째 for문이 모두 끝나야 다음 내용이 진행된다.
		// 즉 i가 0일때 j가 0부터 4까지 진행되고, i가 1일때 j가 0부터 4까지 진행되는 구조이다.
		for(i=0;i<3;i++)
		{
			for(j=0;j<5;j++) {
				System.out.println("i = " + i + " j = " + j);
			}
		}
	}
}
