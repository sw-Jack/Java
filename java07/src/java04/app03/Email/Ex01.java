// �̸��� ������


package java04.app03.Email;
import java.util.Random;
import java.util.Scanner;
import com.jin.mail.JinsMail;

public class Ex01 {

	public static void main(String[] args) {
		JinsMail mail = new JinsMail();	
		/*
		 * mail.setId("������ ��� google ID"); 
		 * mail.setPw("������ ��� google PW");
		 * mail.setSndUsr("������ ��� �̸�", "������ ��� �̸���");
		 * mail.SendMail("�޴� ��� �̸���","���� ����","���� ����");
		 */
		 		
		 mail.setId("������ ��� google ID"); 
		 mail.setPw("������ ��� google PW"); 
		 mail.setSndUsr("������ ��� �̸�", "������ ��� �̸���"); 
		 mail.SendMail("�޴� ��� �̸���","���� ����","���� ����");
	}
}




 
 