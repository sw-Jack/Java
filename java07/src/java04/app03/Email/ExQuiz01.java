// 이메일 보내기

package java04.app03.Email;
import java.util.Random;
import java.util.Scanner;
import com.jin.mail.JinsMail;

public class ExQuiz01 {

	public static void main(String[] args) {
		JinsMail mail = new JinsMail();
		Scanner in = new Scanner(System.in);
		System.out.print("수를 입력하세요 : ");
		int num = in.nextInt();	
		String get = getnum(num);
		System.out.println("입력값 : " + num);
		System.out.println("* 인증 번호 발송  *");
		
		mail.setId("보내는 사람 ID");
		mail.setPw("보내는 사람 PW");
		mail.setSndUsr("보내는 사람 이름", "보내는 사람 이메일");
		mail.SendMail("받는 사람 이메일", "보낼 메일 제목", get);
	}
	
	static String getnum(int num) {
		int digit = (int)Math.pow(10,num);
		Random random = new Random();
		return String.format("%0" + num + "d", random.nextInt(digit));
	}
}




  