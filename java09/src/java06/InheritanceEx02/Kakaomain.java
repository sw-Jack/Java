package java06.InheritanceEx02;

/* 
 * ������ ������ ��ü�� ����� ������ Talkbox ��ü�� ������ �� �ִ�.
 * Talkbox���� member��� ��ü�� �����ϰ� ������ Member ��ü�� �����Ͽ� �����Ͽ����Ƿ�
 * member�� �ִ� ������ talkbox.getmember()�� ������ ���� ���� ���� �ȴ�.
 */

public class Kakaomain {
	public static void main(String[] args) {
		Talkbox talkbox = new Talkbox();
		Member member = new Member();
		
		member.setId("�� ���̵�");    // 
		member.setPicture("�⺻�׸�");   //
		
		talkbox.setContents("���� ��ħ");
		talkbox.setChatTime("��ħ�ð�");
		
		// member.setId(), member.setPicture()�� �ʱ�ȭ�� ���� Talkbox�� ����
		talkbox.setMember(member);    
		
		// �ܼ� Member Ŭ������ ���� ���� ���
		System.out.println(talkbox.getMember());
		// Member Ŭ������  id (Talkbox Ŭ������ ���İ�)
		System.out.println(talkbox.getMember().getId());
		// Member Ŭ������ id
		System.out.println(member.getId());
		// Member Ŭ������ picture (Talkbox Ŭ������ ���İ�)
		System.out.println(talkbox.getMember().getPicture());
		// Member Ŭ������ picture
		System.out.println(member.getPicture());
		
		System.out.println(talkbox.getContents());
		System.out.println(talkbox.getChatTime());
	}
}
