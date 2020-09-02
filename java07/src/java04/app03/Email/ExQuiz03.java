// 이메일 보내기

package java04.app03.Email;
import java.util.Random;
import java.util.Scanner;
import com.jin.mail.JinsMail;

public class ExQuiz03 {
	static String getnum(int num) {
		int digit = (int)Math.pow(10,num);
		Random random = new Random();
		return String.format("%0" + num + "d", random.nextInt(digit));
	}

	static String SendMail() {
		JinsMail mail = new JinsMail();
		String authnum = getnum(4);
		
		mail.setId("보내는 사람 ID");
		mail.setPw("보내는 사람 PW");
		mail.setSndUsr("보내는 사람 이름", "보내는 사람 이메일");
		mail.SendMail("받는 사람 이메일", "보낼 메일 제목", "안녕하세요 고객님<br/>" 
		+ "인증 번호는 [ " + authnum + " ] 입니다.");
	
		return authnum;
	}

	public static void main(String[] args) {
		String authnum = SendMail();
		System.out.println("* 인증 번호 : " + authnum);
	}
}

