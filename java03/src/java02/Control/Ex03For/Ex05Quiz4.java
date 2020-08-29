package java02.Control.Ex03For;

import java.util.Scanner;

/* Quiz
 * 4. 음악 플레이어를 만드려고 한다. 현재 3분 50초 분량의 노래가 있다.
 * 지금까지 진행도 노래 분량을 입력받아 그림으로 표시하고
 * 몇 % 진행되었는지 수치로 나타내는 프로그램을 작성하시오.
 */
public class Ex05Quiz4 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("현재 초 : ");
		int cursec = in.nextInt();
		int cnt = 0;
		for(int s=1;s<=230;s++) 
		{
			cnt = 1;
			
		}
		int ftime = 230;
		int per = cursec/ftime*100;
		
		System.out.println(per + "%");
		System.out.println(40/230*100);
		
		
	}
}

































