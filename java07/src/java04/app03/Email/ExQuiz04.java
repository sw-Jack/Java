package java04.app03.Email;
import java.util.Random;
import java.util.Scanner;

// 이메일 보내기
import com.jin.mail.JinsMail;

// 다형성 : 같은 이름 다른 용도(다른 형태 like 매개변수)
// -> SendMail() and SenMail(String argument)
public class ExQuiz04 {
	static String getnum(int num) {
		int digit = (int)Math.pow(10,num);
		Random random = new Random();
		return String.format("%0" + num + "d", random.nextInt(digit));
	}

	static void SendMail(String authnum) {
		JinsMail mail = new JinsMail();
	
		mail.setId("보내는 사람 ID");
		mail.setPw("보내는 사람 PW");
		mail.setSndUsr("보내는 사람 이름", "보내는 사람 이메일");
		mail.SendMail("받는 사람 이메일", "보낼 메일 제목", "안녕하세요 고객님<br/>" 
		+ "인증 번호는 [ " + authnum + " ] 입니다.");
	}
	
	static String SendMail() {
		String authnum = getnum(4);
		SendMail(authnum);	// 실제 메일 전송 담당의 SendMail() 메소드로 매개변수 authnum 전달
		return authnum;		// main 메소드의 authnum에 해당 authnum 전달
	}

	public static void main(String[] args) {
		String authnum = SendMail();
		System.out.println("* 인증 번호 : " + authnum);
	}
}
