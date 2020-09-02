package java04.app03.Email;
import java.util.Random;
import java.util.Scanner;

// �̸��� ������
import com.jin.mail.JinsMail;

// ������ : ���� �̸� �ٸ� �뵵(�ٸ� ���� like �Ű�����)
// -> SendMail() and SenMail(String argument)
public class ExQuiz04 {
	static String getnum(int num) {
		int digit = (int)Math.pow(10,num);
		Random random = new Random();
		return String.format("%0" + num + "d", random.nextInt(digit));
	}

	static void SendMail(String authnum) {
		JinsMail mail = new JinsMail();
	
		mail.setId("������ ��� ID");
		mail.setPw("������ ��� PW");
		mail.setSndUsr("������ ��� �̸�", "������ ��� �̸���");
		mail.SendMail("�޴� ��� �̸���", "���� ���� ����", "�ȳ��ϼ��� ����<br/>" 
		+ "���� ��ȣ�� [ " + authnum + " ] �Դϴ�.");
	}
	
	static String SendMail() {
		String authnum = getnum(4);
		SendMail(authnum);	// ���� ���� ���� ����� SendMail() �޼ҵ�� �Ű����� authnum ����
		return authnum;		// main �޼ҵ��� authnum�� �ش� authnum ����
	}

	public static void main(String[] args) {
		String authnum = SendMail();
		System.out.println("* ���� ��ȣ : " + authnum);
	}
}
