import java.util.Scanner;

/* Quiz
 * 3. 총 싸움 게임을 만드려고 한다.
 * 총 별 유효 사거리가 존재하며 유효 사거리에 따라 사격의
 * 정확도를 게임에 넣으려고 한다.
 * 유효 사거리를 연습시키기위한 연습장을 만드려고 하는데
 * 사용 가능한 총은 베레타 M92FS 권총뿐이다.
 * 유효 사거리는 50m이며 사용자의 현재 위치와 타겟의 거리를
 * 계산하는 프로그램을 작성해봐라.
 * 변수저장) 사용자의 거리를 변수에 저장하세요 : 80
 * 출력) 최대 유효 사거리보다 30m 멉니다.
 * 변수저장) 사용자의 거리를 변수에 저장하세요 : 39
 * 출력) 최대 유효 사거리보다 11m 가깝습니다.
 */
public class Ex01 {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
		 System.out.print("사용자의 거리를 변수에 저장하세요 : ");
		 int meter = in.nextInt();
		 String st = "m 멉니다";
		 int gap = meter - 50;
		 if(gap < 0) {
			 gap *= -1;
			 st = "m 가깝습니다";
		 }
		 System.out.println("최대 유효 사거리보다 " + gap + st);
	}

}
