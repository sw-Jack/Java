

package java05.classBasic.Ex03;
/* 
 * this�� Ŭ���� �ڽ��� �ǹ��Ѵ�.
 * this.xxx �ϸ� ���� Ŭ���� ����  xxx �� �ǹ��ϰ� �ȴ�.
 * ��� ������ ���� ��� ������ private�� ���δ�.
 * private�� �ܺο����� �������� ������ ���� ���� ����Ѵ�.
 */
public class Ex01 {
	public static void main(String[] args) {
		Member member = new Member();
		
		// set : �ش� Ŭ���� ���� ������ �� ����
		member.setId("ȫ�浿");
		member.setPicture("��������.");
	
		// get : set���� ������ Ŭ���� ���� ���� �� �ҷ�����
		System.out.println(member.getId());
		System.out.println(member.getPicture());
	}
} 



