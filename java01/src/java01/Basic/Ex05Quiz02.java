package java01.Basic;
import java.util.Scanner;

/* 다음과 같이 동작되도록 코딩하시오
 * 2. 비만도 계산하기
 * (현재 체중 - 표준 체중) / 표준 체중 * 100
 */
public class Ex05Quiz02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("현재 체중 입력 : ");
		float weight = in.nextFloat();
		float mskg = weight*weight*22;
		float wskg = weight*weight*21;
		float mbmd = (weight - mskg) / mskg * 100; 
		float wbmd = (weight - wskg) / wskg * 100;
		System.out.println("남자 비만도 : " + mbmd);
		System.out.println("여자 비만도 : " + wbmd);    
	}

}
