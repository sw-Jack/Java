// �̸��� ������

package java04.app03.Email;
import java.util.Random;
import java.util.Scanner;
import com.jin.mail.JinsMail;

public class ExQuiz01 {

	public static void main(String[] args) {
		JinsMail mail = new JinsMail();
		Scanner in = new Scanner(System.in);
		System.out.print("���� �Է��ϼ��� : ");
		int num = in.nextInt();	
		String get = getnum(num);
		System.out.println("�Է°� : " + num);
		System.out.println("* ���� ��ȣ �߼�  *");
		
		mail.setId("������ ��� ID");
		mail.setPw("������ ��� PW");
		mail.setSndUsr("������ ��� �̸�", "������ ��� �̸���");
		mail.SendMail("�޴� ��� �̸���", "���� ���� ����", get);
	}
	
	static String getnum(int num) {
		int digit = (int)Math.pow(10,num);
		Random random = new Random();
		return String.format("%0" + num + "d", random.nextInt(digit));
	}
}




  