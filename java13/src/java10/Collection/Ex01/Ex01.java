package java10.Collection.Ex01;
import java.util.ArrayList;

public class Ex01 {
	public static void main(String[] args) {
		// ArrayList<������Ŭ������> ������ = new ArrayList<������Ŭ������>();
		ArrayList<String> lst = new ArrayList<String>();
		
		// add�� �̿��Ͽ� ArrayList�� �� �߰�
		// �� �߰� �� �ε����� �������(���ʴ��) ����� (0 : test -> 1 : hello)
		lst.add("test");
		lst.add("hello");
		
		// get(index)�� �̿��Ͽ� ����Ʈ ���� �ҷ���
		System.out.println(lst.get(0));
		System.out.println(lst.get(1));

	}
}
