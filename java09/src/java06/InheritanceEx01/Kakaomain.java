package java06.InheritanceEx01;

/* 
Talkbox ��� Ŭ������ �����ϰ� ������ contents�� chatTime���� ���� �����͸� ����������
member���� ���� ������ �����Ͱ� ���� ������ 
Talkbox.getMember()�� ���� ����� null�� ������ �Ǵ� ���̴�.
*/

public class Kakaomain {
	public static void main(String[] args) {
		Talkbox talkbox = new Talkbox();
		
		talkbox.setContents("���� ��ħ");
		talkbox.setChatTime("��ħ�ð�");
		
		System.out.println(talkbox.getMember());
		System.out.println(talkbox.getContents());
		System.out.println(talkbox.getChatTime());
	}
}
