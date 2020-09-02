// 이메일 보내기


package java04.app03.Email;
import java.util.Random;
import java.util.Scanner;
import com.jin.mail.JinsMail;

public class Ex01 {

	public static void main(String[] args) {
		JinsMail mail = new JinsMail();	
		/*
		 * mail.setId("보내는 사람 google ID"); 
		 * mail.setPw("보내는 사람 google PW");
		 * mail.setSndUsr("보내는 사람 이름", "보내는 사람 이메일");
		 * mail.SendMail("받는 사람 이메일","보낼 제목","보낼 내용");
		 */
		 		
		 mail.setId("보내는 사람 google ID"); 
		 mail.setPw("보내는 사람 google PW"); 
		 mail.setSndUsr("보내는 사람 이름", "보내는 사람 이메일"); 
		 mail.SendMail("받는 사람 이메일","보낼 제목","보낼 내용");
	}
}




 
 