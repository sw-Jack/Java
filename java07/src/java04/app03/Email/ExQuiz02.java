package java04.app03.Email;
import java.util.Random;
import java.util.Scanner;

// �̸��� ������
import com.jin.mail.JinsMail;

public class ExQuiz02 {

	public static void main(String[] args) {
		JinsMail mail = new JinsMail();
		String authnum = "�ȳ��ϼ��� ����<br/>" + "���� ��ȣ�� [ " + getnum(4) + " ] �Դϴ�.";
		
		mail.setId("������ ��� ID");
		mail.setPw("������ ��� PW");
		mail.setSndUsr("������ ��� �̸�", "������ ��� �̸���");
		mail.SendMail("�޴� ��� �̸���", "���� ���� ����", authnum);
		
		System.out.println("* ���� ��ȣ �߼�  *");
	}
	
	static String getnum(int num) {
		int digit = (int)Math.pow(10,num);
		Random random = new Random();
		return String.format("%0" + num + "d", random.nextInt(digit));
	}
}
